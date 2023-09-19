package abstracts.template;

public class AICar extends Car {
	//AICar 클래스의 drive() 메서드 구현부 추가
	@Override
	public void drive() {
		System.out.println("차가 자율 주행합니다.");
	}
	//AICar 클래스의 stop() 메서드 구현부 추가
	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
	}
	
}
