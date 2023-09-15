package overriding.shop;

public class MainClass {

	public static void main(String[] args) {
		//매장 객체(인스턴스) 생성 
		Shop1 shop1 = new Shop1();
		//메서드 호출
		shop1.김치찌개();
		shop1.된장찌개();
		shop1.비빔밥();
		
		System.out.println("===================================");
		
		Shop2 shop2 = new Shop2();
		
		shop2.김치찌개();
		shop2.된장찌개();
		shop2.비빔밥();
		
		
	}

}
