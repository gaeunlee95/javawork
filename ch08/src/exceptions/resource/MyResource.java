package exceptions.resource;

public class MyResource implements AutoCloseable{	//자동 닫기
	//필드
	//private 접근제어자의 문자형 변수 text 선언
	private String text;
	
	//매개변수가 있는 생성자
	//MyResource ... 열기 출력
	public MyResource(String text) {
		this.text = text;
		System.out.println("[MyResource(" + text + ")] 열기");
	}
	
	//메서드
	//read1()메서드 - MyResource  ... 열기 및 문자열"100" 리턴
	public String read1() {
		System.out.println("[MyResource(" + text + ")] 열기");		//로그 삽입
		return "100";
	}
	//read2()메서드 - MyResource  ... 열기 및 문자열"123a" 리턴 //추후 이 메서드 오류나도록 할 것임
	public String read2() {
		System.out.println("[MyResource(" + text + ")] 열기");		//로그 삽입
		return "123a";
	}
	
	//AutoCloseable 인터페이스(이미 자바상에 존재)의 close()추상 메서드 재정의 //로그 닫기 출력
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + text + ")] 닫기");
	}
	
}
