package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		//객체 user1 생성
		User user1 = new User();
		
		//값 입력
		user1.setId("abc123");
		user1.setPwd("12345");
		user1.setName("이가은");
		
		//아이디: ... 출력
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPwd());
		System.out.println("이름: " + user1.getName());
		
	}

}
