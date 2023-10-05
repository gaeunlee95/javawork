package kr.or.iei.run;

//import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	//필드
	private static ServerSocket serverSocket;			
	
	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("==========================================");
		
		//서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		
		//'q'를 입력하여 while문이 끝난 후, 다음 구문인 stopServer로 넘어가짐
		while(true) { //항상 대기
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) { //대문자 들어올시, 소문자로 변환
				break; // q 입력 시, 서버 종료
			}
		}
		scanner.close();
		
		//서버 종료
		stopServer();
		
	}//main 끝
	
	
	//TCP 서버시작 메서드 생성
	public static void startServer() {
		//항상 대기 - 스레드 만들기
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					while(true) { //항상 클라이언트 연결 대기
						System.out.println("\n[서버] 연결 요청 기다림\n");
						//연결 수락(accept()) 및 클라이언트와 통신할 소켓 객체 생성
						Socket socket = serverSocket.accept();
						//클라이언트가 연결을 요청한 후 accept()하면 다음 구문으로 넘어감
						
						//어떠한 IP로 요청하였는지, IP 확인
						//InetSocketAddress 클래스의 객체 isa에 Socket 클래스의 getRemoteSocketAddress() 함수를 
						//사용하여 객체 socket(연결된 클라이언트)의 주소 삽입
						//연결된 클라이언트의 IP 주소 확인
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
//						처음부터 IP 값을?
						String clientIp = isa.getHostString(); //clientIp 변수에 IP를 반환
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						
						//데이터 받기(수신)
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is); //기반스트림을 생성자의 매개변수로 연결
						String message = dis.readUTF(); //받은 데이터를 message 변수에 반환
						System.out.println("[서버] 데이터를 받음: " + message);
						
						//데이토 보내기(송신)
						String message2 = "서버가 글을 보냅니다.";
						//OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[서버] 데이터를 보냄: " + message2);
						
						//통신(소켓) 종료
						socket.close();
					}
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());
				}
			}
			
		}; //thread 끝
		thread.start();
	}//startServer 메서드 끝
	
	
	//서버종료 메서드 생성
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//stopServer 끝
	
	
}
