package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		//추상 클러스는 객체 생성 안됨
		//부모 타입으로 객체 생성
		//HeadShop shop1 = new Headshop();
		HeadShop shop1 = new Shop1();
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.비빔밥();
		
		System.out.println();
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.비빔밥();
	}

}
