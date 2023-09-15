package inheritance.statement;
//자식 클래스
public class Alcohol extends Drink {

	float alcper; //알콜 도수
	
	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count); //부모 : super
		this.alcper = alcper;      //자신 : this
	}
	
	public static void printTitle() { //제목행 출력
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	
	@Override
	public void printData() {
		System.out.println(name + " (" + alcper + ")\t" + price + "\t" 
					+ count + "\t" + getTotalPrice());
	}
	
}
