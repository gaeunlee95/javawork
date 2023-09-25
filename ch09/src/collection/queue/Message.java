package collection.queue;

public class Message {
	//필드
	//문자열 변수(command, to) 선언
	String command;	//수행 - 이메일, SMS, Kakaotalk
	String to;		//대상
	
	//매개변수 있는 생성자
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}
	
	
}
