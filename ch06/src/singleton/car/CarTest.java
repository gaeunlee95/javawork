package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		//싱글톤 객체는 1개임
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourMorning = factory.createCar();
		
		System.out.println("신차 번호: " + mySonata.getCarNum());
		System.out.println("신차 번호: " + yourMorning.getCarNum());
	}

}

