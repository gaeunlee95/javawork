package abstracts.shop;

public class Shop1 extends HeadShop {

	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개: 6,500원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개: 7,000원");
		
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥: 7,000원");
		
	}

}
