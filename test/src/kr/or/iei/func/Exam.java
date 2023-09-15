package kr.or.iei.func;

import kr.or.iei.model.vo.User;

public class Exam {
	public void exam1() {
		//2.전화번호 저장된 부분 문자열로 변경 -> ex) "01011112222" 
		User user1 = new User("user01", "pass01", "유저1", 23, "01011112222");
		User user2 = new User("user02", "pass02", "유저2", 27, "01022223333");
		User user3 = new User("user03", "pass03", "유저3", 34, "01033334444");

		User[] users = new User[3];

//		for(int i = 0; i < users.length; i++) {
//			users[i] = useri;
//		}
		
		//3.상단의 코드로는 값 저장 불가, 배열 users에 각각 객체를 삽입
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;

		System.out.println("아이디\t비밀번호\t이름\t나이\t전화번호");
		
		//전체 출력
		//4. 저장된 값을 받아와야하니 setId() -> getId() 로 변경
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].getId()+"\t"
					+users[i].getPwd()+"\t"+users[i].getName()
					+"\t"+users[i].getAge()+"\t"+users[i].getPhone());
		}
	}
}
