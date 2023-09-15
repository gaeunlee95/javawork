package kr.or.iei.model;

//회원 클래스(자료형) 정의
public class User {
	//필드(속성)
	private String id;
	private String pwd;
	private String name;
	
	//기본 생성자(생략가능) ///UserTest
	public User() {
		System.out.println("User의 생성자입니다.");
	}
	
	//매개변수가 있는 생성자 ///UserTest2
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	//set필드이름()-입력, get필드이름()함수-출력
	//set ///UserTest1
	//입력
	public void setId(String id) {
		this.id = id;
	}
	//출력
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
