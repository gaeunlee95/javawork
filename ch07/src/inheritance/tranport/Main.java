package inheritance.tranport;

public class Main {

	public static void main(String[] args) {
		//Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호",20000 );
		
		//Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		//Taxi 객체 생성
		Taxi kakaotaxi = new Taxi("kakaotaxi");
		
		//take() 메서드 사용
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		sohee.take(kakaotaxi, 10000);
		
		//Person, Bus 객체의 정보 출력
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showInfo();
		kakaotaxi.showInfo();
	}

}
