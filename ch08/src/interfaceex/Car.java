package interfaceex;

public class Car {
	//필드 - 인터페이스 타입 선언
	
	/*Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();*/
	
	//타이어 변수 선언
	//네 타이어에 대한 변수 선언 //클래스의 경우, 초기화 필요x
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	//기본 생성자 (기본적으로 앞:HanTire, 뒤:KumTire 타이어 장착) 
	public Car() {
		frontLeftTire = new HanTire();
		frontRightTire = new HanTire();
		backLeftTire = new KumTire();
		backRightTire = new KumTire();
	}
	
	//메서드
	//네 타이어가 굴러가는 run() 템플릿 메서드 생성
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
