package funcinterface.object;

public class Person {
	//인터페이스를 매개변수로 사용
	//Workable 인터페이스의 객체를 매개변수로 받고 이 객체는 추상메서드 work()실행
	void action(Workable workable) {
		workable.work();
	}
	
}
