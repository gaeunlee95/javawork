package transport;

public class Bus {
	//필드
	int busNumber; //버스 번호
	int passenger; //승객
	int money;	   //수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우다
	public void take(int fee) { //요금을 받음
		this.money += fee; //요금을 더해서 수입이 늘어남
		passenger++; 	   //승객수 1명 증가, passenger=passenger + 1
	}
	
	//버스의 정보
	public void showBusInfo() {
		System.out.printf("%s번 버스의 수입은 %,d원 이고, 승객 수는 %d명 입니다.\n"
				, busNumber, money, passenger);
	}
	
	
}
