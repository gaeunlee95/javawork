package nestedclass.interfaces;

//Button 내부의 인터페이스를 구현한 클래스 정의
public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
