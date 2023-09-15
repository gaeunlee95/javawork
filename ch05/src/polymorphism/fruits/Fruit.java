package polymorphism.fruits;
//부모 클래스
public class Fruit {
	//필드
	protected String name;     //과일 이름
	protected String weight;	 //무게(중량)
	protected int price;		 //가격
	
	//기본 생성자
	public Fruit(){}
	
	//메서드
	public void showFruitInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}
	
}
