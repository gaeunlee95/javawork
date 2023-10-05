package chatting2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient2 {
	ChatServer2 chatServer;
	Socket socket;
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;
	
	public SocketClient2(ChatServer2 chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa = 
					(InetSocketAddress) socket.getRemoteSocketAddress();
			//this.clientIp = isa.getHostName();
			this.clientIp = isa.getHostString();
			receive();
		} catch (IOException e) {
		}
	}
	
	//메서드 : JSON 받기
	public void receive() {
		//항상 받을 준비를 함(대기)
		chatServer.threadPool.execute(()->{
			try {
				while(true) {
					String receiveJson = dis.readUTF(); //읽을때 연결이 끊기면 예외 발생()
					
					//JSONObject로 파싱 - command(명령:요청내용) 속성의 구조
					//{"command": "incomming", "data": "chatName" }
					//{"command": "message", "data": "xxxx(메시지)" }
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command"); //command 속성값 얻기
					
					switch(command) {
					case "incoming": //채팅방 입장
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "입장하셨습니다."); //SocketClient.this
						chatServer.addSocketClient(this);
						break;
					case "message":  //메시지 보냄
						String message = jsonObject.getString("data"); //data 속성값 얻기
						chatServer.sendToAll(this, message);
						break;
					}
				}
			}catch(IOException e) {
				//연결이 끊겼을때 예외 발생
				chatServer.sendToAll(this, "나가셨습니다.");
				chatServer.removeSocketClient(this); //현재 소켓 클라이언트 삭제
			}
		});
	}
	
	//메서드 : JSON 보내기
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();  
		} catch (IOException e) {
		}
	}
	
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
		}
	}
}
