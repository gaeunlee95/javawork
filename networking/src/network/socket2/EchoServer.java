package network.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	
	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	private static ExecutorService executorSerivce = 
			Executors.newFixedThreadPool(10);
	
	
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
					serverSocket = new ServerSocket(50001); //포트번호
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//서버가 연결 요청 수락함
						Socket socket = serverSocket.accept(); //클라이언트와 통신할 소켓 생성
						
						//서버의 동시 처리(스레드 풀 사용)
						//Runnable은 함수형 인터페이스이므로 람다식으로 구현 가능
						//추상메서드 void run(x);
						executorSerivce.execute(() ->{
							try {
								//IP 주소 알아내기
								InetSocketAddress isa = 
										(InetSocketAddress) socket.getRemoteSocketAddress();
								String clientIp = isa.getHostString();
								System.out.println("[서버] " + clientIp + " 연결 요청을 수락함");
								//웹 브라우저에서 http://127.0.0.1:50001/ 을 입력함 - 콘솔에서 확인
								
								//클라이언트가 보낸 데이터 받기(읽기)
								InputStream is = socket.getInputStream();
								byte[] bytes = new byte[1024]; //데이터를 저장할 배열 선언
								int readBytes = is.read(bytes); //데이터를 읽은 바이트수
								//데이터를 문자열로 생성 - 디코딩
								String message = new String(bytes, 0, readBytes, "utf-8");
								
								//받은 데이터 보내기
								OutputStream os = socket.getOutputStream();
								bytes = message.getBytes(); //인코딩
								os.write(bytes);
								
								os.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
								
								socket.close(); //소켓 종료
								System.out.println("[서버] " + clientIp + "의 연결을 끊음");
							}catch(IOException e) {
								System.out.println("[서버] " + e.getMessage());
							}
						});
					
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
			executorSerivce.shutdown();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
