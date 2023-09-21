package abstracts.template;

public abstract class Car {
	//추상메서드 drive(), stop() 생성
	public abstract void drive();
	public abstract void stop();
	
	//startCar() 메서드 생성
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	//turnOff() 메서드 생성
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 정의 : 상속받는 클래스에서 수정할 수 없음
	// 템플릿 메서드 run() 생성
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
