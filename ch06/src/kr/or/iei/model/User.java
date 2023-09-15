package kr.or.iei.model;

public class User {
	//필드(속성)
	//private 변수 id, pwd, name
	private String id;
	private String pwd;
	private String name;
	
	//기본 생성자
	public User() {};
	
	//매개변수가 있는 생성자 (id, pwd, name)
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	//set, get
	public void setId(String id) {
		this.id = id;
	}
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
