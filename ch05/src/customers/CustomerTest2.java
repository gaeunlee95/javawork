package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 부모형으로 객체 생성 - 자동 형변환
		// 매개변수 있는 생성자 사용
		Customer lee = new Customer(1001, "이순신");
		
		int price = 10000;
		int cost = lee.calcPrice(price);
		
		System.out.println(lee.getCustomerName() + 
				"님이 지불한 비용은 " + cost + "원 입니다.");
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("==========================================");
		
		// 부모형으로 객체 생성 - 자동 형변환
		Customer woo = new VIPCustomer(1010, "우영우", 7777);
		
		price = 20000;
		cost = woo.calcPrice(price);
		
		System.out.println(woo.getCustomerName() + 
				"님이 지불한 비용은 " + cost + "원 입니다.");
		System.out.println(woo.showCustomerInfo());
	}

}
