package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {

	// 필드
	ServerSocket serverSocket;
	
	// 스레드 풀
	ExecutorService threadPool = Executors.newFixedThreadPool(100); //스레드 100개 생성
	
	// 채팅방 - HashMap(싱글스레드), Hashtable(멀티스레드)
	//Map<String, SocketClient> chatRoom = new Hashtable<>();
	//동기화된 컬렉션 이용
	Map<String, SocketClient> chatRoom = 
			Collections.synchronizedMap(new HashMap<>());	
	
	public void start() throws IOException{
		///try {
			//서버소켓 생성 - 소켓을 통해 서버-클라이언트간 데이터를 주고받는 양방향 연결 지향성 통신
			serverSocket = new ServerSocket(6000);
			System.out.println("[서버] 시작됨");
			
			//항상 먼저 대기 - 스레드 만들기
			///
			Thread thread = new Thread() {
				@Override
				public void run() {
						try {
							while(true) {
								//accept() - 연결 수락 및 소켓 객체 생성
								Socket socket = serverSocket.accept();
								//소켓 클라인언트 객체 생성
								SocketClient sc = new SocketClient(ChatServer.this, socket);
								}
						}catch (IOException e) { //블럭 비움
							//e.printStackTrace();
						}
				}//run 끝	
			}; //Thread 끝
			
			thread.start();
			
		///} catch (IOException e) {
		///	e.printStackTrace();
		///}
		///System.out.println("[서버]: 시작됨");
	}
	
	//클라이언트와 통신할 소켓 추가
	public void addSocketClient(SocketClient socketClient) {
		//key: 채팅방 이름(대화명)
		String key = socketClient.chatName + "@" + socketClient.clientIp; 
		chatRoom.put(key, socketClient); //hashMap에 저장
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}
	
	//클라이언트와 통신할 소켓 삭제
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp; 
		chatRoom.remove(key); //hashMap에서 key로 삭제
		System.out.println("나감: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}
	
	//Json 데이터 보내기(모든 클라이언트에게 보내기)
	public void sendToAll(SocketClient sender, String message) {
		//json 데이터 객체 생성
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp); //속성, 속성값 저장
		root.put("chatName", sender.chatName); 
		root.put("message", message);
		String json = root.toString(); //문자열 얻기
		
		//반복자 필요
		Collection<SocketClient> socketClient = chatRoom.values();
		for(SocketClient sc : socketClient) {
			//발신자와 동일하면 보내지 말고 다른 클라이언트에게 보냄
			///if(sc == sender) continue;
			if(sc != sender)
			sc.send(json);  //문자열 보내기
		}
	}
	
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			
			//반복자 필요
			Collection<SocketClient> socketClient = chatRoom.values();
			for(SocketClient sc : socketClient) {
				sc.close();
			}
			
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("==========================================");
			System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
			System.out.println("==========================================");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) { //항상 대기
				String key = scanner.nextLine();
				if(key.toLowerCase().equals("q")) { //대문자 들어올시, 소문자로 변환
					break; // q 입력 시, 서버 종료
				}
			}
			scanner.close();
			chatServer.stop();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//main 끝

}
