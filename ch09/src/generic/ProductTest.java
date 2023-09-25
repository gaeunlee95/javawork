package generic;

public class ProductTest {

	public static void main(String[] args) {
		//Product 객체 생성 <클래스, 문자열>
		Product<TV, String> prod1 = new Product<>();
		Product<Car, String> prod2 = new Product<>();
		
		//TV 객체(인스턴스) 생성
		TV tv = new TV();
		
		//Car 객체(인스턴스) 생성
		Car car = new Car();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		
		tv.making();
		System.out.println("모델명: " + prod1.getModel());
		
		car.making();
		System.out.println("모델명: " + prod2.getModel());
		
	}

}
