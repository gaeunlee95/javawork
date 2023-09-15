package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		//매개변수가 있는 생성자로 객체 user1 생성
		User user1 = new User("abc124", "12345", "이가은");
		
		//출력
		System.out.println(user1.getId());
		System.out.println(user1.getPwd());
		System.out.println(user1.getName());
		
		//크기가 3인 users 배열 생성
		User[] users = new User[3];
		User user2 = new User("abc", "123","이");
		User user3 = new User("efg", "234", "김");
		User user4 = new User("sss", "234", "박");
		
		//배열을 각 user1,..에 저장
		users[0] = user2;
		users[1] = user3;
		users[2] = user4;
		
		//users[0] 출려
		System.out.println(users[0].getId() + ", " + users[0].getPwd() +
				", " + users[0].getName());
		
		//전체 출력
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].getId() + ", " + users[i].getPwd() +
					", " + users[i].getName());
		}
	}

}
