package chatting2;

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

public class ChatServer2 {

	//필드
		ServerSocket serverSocket;
		//쓰레드 풀
		ExecutorService threadPool = Executors.newFixedThreadPool(100); 
			
		////멀티 스레드 환경 : 채팅방 맵 객체 - chatRoom
		//Map<String, SocketClient> chatRoom = new Hashtable<>(); 
		
		Map<String, SocketClient2> chatRoom = 
				Collections.synchronizedMap(new HashMap<>());
		
		public void start() throws IOException {
			serverSocket = new ServerSocket(6000);
			System.out.println("[서버] 시작됨");
			
			//항상 연결을 준비함 - 스레드를 만들어야함
			Thread thread = new Thread(()->{
				//()->{} : Runnable 인터페이스의 run() 구현
				try {
					while(true) {
						//클라이언트의 연결 요청 수락(블로킹 해제) 및 소켓 객체 생성
						Socket socket = serverSocket.accept(); 
						SocketClient2 sc = new SocketClient2(this, socket); 
					}
				} catch (IOException e) { //블럭 비움
				}
			});
			thread.start();
		}
		
		//클라이언트 소켓 추가
		public void addSocketClient(SocketClient2 socketClient) {
			//키 : 채팅방 이름
			String key = socketClient.chatName + "@" + socketClient.clientIp;
			chatRoom.put(key, socketClient);
			System.out.println("입장: " + key);
			System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
		} 
		
		//클라이언트 소켓 삭제
		public void removeSocketClient(SocketClient2 socketClient) {
			String key = socketClient.chatName + "@" + socketClient.clientIp;
			chatRoom.remove(key);
			System.out.println("나감: " + key);
			System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
		} 
		
		//모든 클라이언트에게 보내기 - json 
		public void sendToAll(SocketClient2 sender, String message) {
			JSONObject root = new JSONObject();
			root.put("clientIp", sender.clientIp);
			root.put("chatName", sender.chatName);
			root.put("message", message);
			String json = root.toString();
			
			//key:chatNam, value=socketClient
			//values() 리턴 타입 - Collection - 외부 반복자
			Collection<SocketClient2> socketClient = chatRoom.values();
			for(SocketClient2 sc : socketClient) {
				//발신자와 동일하면 보내지 말고 다음 클라이언트를 보냄
				if(sc == sender) continue; 
				sc.send(json);
			}
		}
		
		public void stop() {
			try {
				serverSocket.close();
				threadPool.shutdown();
				//반복자 - 내부 스트림 - stream() : 위의 Collection 사용해도 됨
				/*Collection<SocketClient> socketClient = chatRoom.values();
				for(SocketClient sc : socketClient) {
					sc.close();
				}*/
				chatRoom.values().stream().forEach(sc -> sc.close());
				System.out.println("[서버] 종료됨 ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			try {
				ChatServer2 chatServer = new ChatServer2();
				chatServer.start();
				
				System.out.println("============================================");
				System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
				System.out.println("============================================");
			
				Scanner scanner = new Scanner(System.in);
				while(true) {
					String key = scanner.nextLine();
					if(key.toLowerCase().equals("q")) {
						break;
					}
				}
				scanner.close();
				chatServer.stop();
			} catch (IOException e) {
				System.out.println("[서버] " + e.getMessage());
			}
		}
	

}
