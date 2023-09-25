package interfaceex;

public class CarMain {

	public static void main(String[] args) {
		//Car 클래스의 객체 myCar 생성
		Car myCar = new Car();
		//myCar.run();
		
		//앞바퀴 교체(변경)
		//KumTire kum1,2 생성 후 Car의 객체인 frontLeftTire, frontRightTire에 삽입(교체)
		KumTire kum1 = new KumTire();
		KumTire kum2 = new KumTire();
		
		myCar.frontLeftTire = kum1;
		myCar.frontRightTire = kum2;
		
		//myCar run
		myCar.run();
		
		System.out.println("===========================");
		//Car2 클래스 사용하여, 자동차 run() 및 타이어 교체
		Car2 myCar2 = new Car2();
		
		//앞바퀴 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();
		myCar2.run();
		
	}

}
