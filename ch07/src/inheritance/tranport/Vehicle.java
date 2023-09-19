package inheritance.tranport;

public class Vehicle {
	//변수 선언
	String vehicleName;	//차량 이름
	int money;			//수입
	int passengerCount;	//승객수

	//매개변수가 있는 생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	//메서드 - 태우다
	public void carry(int fare) {	//요금
			this.money += fare;
			passengerCount++;	
	}
	
	//차량 정보 출력 메서드
	public void showInfo() {
		System.out.printf("%s의 수입은 %d원이고, 승객수는 %d명입니다.\n", vehicleName, money, passengerCount );
	}
	
	
}
