package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		//기본 생성자 사용
		//일반 고객 1명의 객체 생성
		Customer lee = new Customer();
		lee.setCustomerId(1001);
		lee.setCustomerName("이순신");
		
		//보너스 포인트 계산
		int price = 10000; //구매 가격
		lee.calcPrice(price);
		
		//출력
		System.out.println(lee.showCustomerInfo());

		System.out.println("=========================================");
		
		//vip 1명의 객체 생성
		VIPCustomer woo = new VIPCustomer();
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgentId(7777);
		
		//보너스 포인트 계산
		price = 20000; //가격 수정
		woo.calcPrice(price);
		
		//출력
		System.out.println(woo.showCustomerInfo());
		
		
	}

}
