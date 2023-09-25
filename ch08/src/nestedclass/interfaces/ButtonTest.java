package nestedclass.interfaces;

import nestedclass.interfaces.Button.OnClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		//버튼 객체 생성
		Button button = new Button();
		
		//전화걸기 객체 생성
		CallListener call = new CallListener();
		button.setListener(call);
		button.touch();
		
		//문자보내기 객체 생성
		//MessageListener msg = new MessageListener();
		//button.setListener(msg);
		button.setListener(new MessageListener());
		button.touch();
		
		//사진찍기 구현 - 구현 클래스를 따로 만들지 않고 익명 객체로 구현
		button.setListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
		
		//쇼핑 - 구매 구현(익명 객체)
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("상품을 구매합니다.");
			}
		});
		button.touch();
		
		
	}

}
