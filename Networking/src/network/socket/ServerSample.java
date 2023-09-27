package network.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {
	
	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("==========================================");
		
		//TCP 서버 시작
		startServer();
				
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"))
				break;
		}
		scanner.close();
		
		//TCP 서버 종료
		stopServer();
	}
	
	private static void startServer() {
		//작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//서버가 연결 요청 수락함
						Socket socket = serverSocket.accept(); //클라이언트와 통신할 소켓 생성
					
						//IP 주소 알아내기
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "연결 요청을 수락함");
						//웹 브라우저에서 http://127.0.0.1:50001/ 을 입력함 - 콘솔에서 확인
					
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
					
					}
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());
				}
			}
		};
		thread.start(); //서버 스레드 시작
	}//startServer 끝
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
