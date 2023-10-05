package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	//필드
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;	
	String chatName;
	
	//연결 요청 메서드
	public void connect() throws IOException{
		socket = new Socket("192.168.20.", 6000);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
	}
	
	//데이터 송신
	public void send(String json) throws IOException{
		dos.writeUTF(json);
		dos.flush();
	}
	
	public void receive() {
		//항상 받을 준비
		Thread thread = new Thread(()->{
			try {
				while(true) {
					String json = dis.readUTF();
					
					//읽은 데이터 파싱
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp 
							+ ">" + message);
				}
			} catch (IOException e) {
				System.out.println("[클라이언트] 서버에 연결 끊김");
				System.exit(0); //process 완전 종료
			}
		});
		thread.start();
	}
	
	public void unconnect() throws IOException{
		socket.close();
	}
	
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();

			Scanner scanner = new Scanner(System.in);
			System.out.println("대화명 입력: ");
			chatClient.chatName = scanner.nextLine();
			
			//속성 - command, data
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString(); //객체를 문자열로 얻기
			
			//데이터 보냄
			chatClient.send(json);
			//데이터 받기
			chatClient.receive();
			
			System.out.println("==========================================");
			System.out.println("보낼 메시지를 입력하고 Enter를 누르세요.");
			System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
			System.out.println("==========================================");
			
			while(true) { //항상 대기
				String message = scanner.nextLine();
				if(message.toLowerCase().equals("q")) {
					break; 
				}else { //메시지 보냄
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					json = jsonObject.toString();
					chatClient.send(json);
				}
			}
			
			scanner.close();
			chatClient.unconnect(); //연결 끊음
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main 끝

}
