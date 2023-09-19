package abstracts.step1;

//추상 클래스 Car 정의
public abstract class Car {
	//추상메서드 사용이용
	//상복받는 자식클래스에서 반드시 구현하도록 제시, 강제함
	public abstract void run();
	public abstract void refuel();
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
}
