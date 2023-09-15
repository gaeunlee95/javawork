package transport;

public class Main {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		Person p3 = new Person("이가은", 1000);
		
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus603 = new Bus(603);
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p3.takeBus(bus603);
		
		p1.takeSubway(green);
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		
		System.out.println("===========================================");
		
		bus100.showBusInfo();
		bus603.showBusInfo();
		
		green.showSubwayInfo();
		
		
		
		
	}

}
