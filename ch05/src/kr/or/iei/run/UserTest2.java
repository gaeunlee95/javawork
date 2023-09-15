package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		//매개변수가 있는 생성자로 user1 인스턴스 생성
		//==set
		/*User user1 = new User("sky789", "12345", "이가은");
		
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPwd());
		System.out.println("이름: " + user1.getName());
		
		System.out.println();
		
		System.out.printf("아이디: %s\n비밀번호: %s\n이름: %s\n", 
				user1.getId(),user1.getPwd(), user1.getName());
		*/
		
		//배열 객체
		//배열 일반형
		/*String[] carts = new String[4];
		carts[0] = "콩나물";
		carts[1] = "커피";
		carts[2] = "라면";
		carts[3] = "우유";*/
		
		
		//크기가 3인 배열 생성
		User[] users = new User[3];
		
		//user 3명 객체 생성
		User users1 = new User("sky789", "12345", "이가은");
		User users2 = new User("sky567", "23456", "우영우");
		User users3 = new User("sky456", "41151", "장그래");
		
		//배열에 개게를 저장(입력)
		users[0] = users1;
		users[1] = users2;
		users[2] = users3;
		
		//users[0] 1개 출력
		System.out.println(users[0].getId() + ", " + users[0].getPwd() 
				+ ", " + users[0].getName());
		
		System.out.println("=====================");
		
		//전체 출력
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].getId() + ", " + users[i].getPwd() 
					+ ", " + users[i].getName());
		}
		
		//System.out.println(users[0]); //메모리 주소 출력
	}

}
