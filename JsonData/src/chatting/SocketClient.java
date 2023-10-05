package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

//import chatting2.ChatServer2;

public class SocketClient {
	ChatServer chatServer;
	Socket socket;	
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa = 
					(InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostString();
			receive();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//데이터 받기(수신) : JSON 받기
	public void receive() {
		chatServer.threadPool.execute(()->{
				try {
					while(true) {
					String receiveJson = dis.readUTF();
				
					//JSON 파싱
					//명령(command) 속성의 구조
					//{"command": "incoming", "data": "chatName"}
					//{"command": "message", "data": xxxx(메세지)}
					JSONObject jsonObject = new JSONObject(receiveJson);
					
					String command = jsonObject.getString("command");
					switch(command) {
					case "incoming": //채팅방
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "입장하셨습니다.");
						chatServer.addSocketClient(this); //서버의 소켓 클라이언트 생성
						break;
					case "message": //메세지
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					}
					}
				} catch (IOException e) {
					//클라이언트 소켓이 종료되면 연결이 끊김
					chatServer.sendToAll(this, "나가셨습니다.");
					chatServer.removeSocketClient(this); //서버의 소켓 클라이언트 삭제
				}
			
		});//람다 구현문 끝
	}//receive 끝
	
	//데이터 보내기(송신) : JSON
	public void send(String json) { //연결이 끊길 수 있음 - 예외처리
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	//소켓 종료
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
