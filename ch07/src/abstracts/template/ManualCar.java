package abstracts.template;

public class ManualCar extends Car {
	//ManualCar 클래스의 drive() 메서드 구현부 추가
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}
	//ManualCar 클래스의 stop() 메서드 구현부 추가
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}

}
