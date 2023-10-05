package chatting2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient2 {
	
	//필드
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		String chatName;
		
		//연결 요청 - TCP 이므로
		public void connect() throws IOException{
			//상대방 host 입력
			socket = new Socket("192.168.20.4", 6000);
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			System.out.println("[클라이언트] 서버에 연결됨");
		}
		
		//메서드: JSON 받기
		public void receive() {
			//항상 받을 준비함 - 스레드를 만들어야함
			Thread thread = new Thread(()->{
				try {
					while(true) {
					String json = dis.readUTF();
					
					//읽은 데이터를 파싱함
					//어떤 컴퓨터에서 어떤 누가 어떤 메시지를 보냄
					JSONObject root = new JSONObject(json); 
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp + ">" + message);
					}
				} catch (IOException e) {
					System.out.println("[클라이언트] 서버에 연결 끊김");
					System.exit(0);  //process 완전 종료
				}
			});
			thread.start();
		}
		
		//send 쓰레드
		public void send(String json) throws IOException{
			dos.writeUTF(json);
			dos.flush();
		}
		
		public void unconnect() throws IOException{
			socket.close();
		}
		
		public static void main(String[] args) {
			try {
				ChatClient2 chatClient = new ChatClient2();
				chatClient.connect();
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("대화명 입력: ");
				chatClient.chatName = scanner.nextLine();
				
				//command: 입장, data: 채팅방 이름
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("command", "incoming");
				jsonObject.put("data", chatClient.chatName);
				String json = jsonObject.toString();
				
				chatClient.send(json); //데이터를 보냄
				chatClient.receive();  //받을 준비함
				
				System.out.println("============================================");
				System.out.println("보낼 메시지를 입력하고 Enter");
				System.out.println("채팅을 종료하려면 q 또는 Q를 입력하고 Enter");
				System.out.println("============================================");
				while(true) {
					String message = scanner.nextLine(); //채팅 문자 입력
					if(message.toLowerCase().equals("q")) {
						break;
					}else {
						//command: 메시지 보냄
						jsonObject = new JSONObject();
						jsonObject.put("command", "message");
						jsonObject.put("data", message);
						json = jsonObject.toString();
						chatClient.send(json);
					}
				}
				scanner.close();
				chatClient.unconnect();   //연결 끊음
			}catch(Exception e) {
				System.out.println("[클라이언트] 서버 연결 안됨");
			}
			System.out.println("[클라이언트] 종료");
		}

}
