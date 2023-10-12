package domain;

import java.io.Serializable;

//DTO 클래스(자료 전달 객체), VO
public class User implements Serializable{
	//필드
	private String userId;
	private String userName;
	private String userpassWord;
	private int userAge;
	private String userEmail;
	
	//기본 생성자 생략
	
	//메서드(getter/setter)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassWord() {
		return userpassWord;
	}
	public void setUserPassWord(String passWord) {
		this.userpassWord = passWord;
	}
	
	
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//Source -> Generate toString()
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userpassWord=" + userpassWord + ", userAge="
				+ userAge + ", userEmail=" + userEmail + "]";
	}

	
	
	
	
	
}
