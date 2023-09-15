package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		//부모형으로 객체 생성 - 자동 형변환
		HeadShop shop1 = new Shop1();
		shop1.비빔밥();
		
		System.out.println("==============================");
		
		HeadShop shop2 = new Shop2();
		shop2.비빔밥();
		
		
		int iNum = 10;
		double dNum;
		dNum = iNum; //double > int 
		System.out.println(dNum); // double
		
		double iNum2 = 10.0;
		int dNum2;
		dNum2 = (int)iNum2; //int > double F -> 강제 형변화 필요
		System.out.println(dNum2); // 
		
	}

}
