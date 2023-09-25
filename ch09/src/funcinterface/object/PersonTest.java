package funcinterface.object;

public class PersonTest {

	public static void main(String[] args) {
		// Person 객체 생성
		//Person 클래스의 객체 person 생성
		Person person = new Person();
		
		// 추상메서드 구현 -> 람다식
		//Person 클래스의 객체 person이 action()메서드 실행 및 람다식으로 구현문 선언
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		person.action(() -> {
			System.out.println("퇴근을 합니다.");
		});
		
		
	}

}
