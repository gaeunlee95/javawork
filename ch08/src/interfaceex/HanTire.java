package interfaceex;

public class HanTire implements Tire {
	//Tire 인터페이스의 roll() 메서드 구현부 선언
	@Override
	public void roll() {
		System.out.println("한타이어가 굴러갑니다.");
	}

}
