package nestedclass.interfaces;

//"문자를 보냅니다" 코드 작성.
public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}

}
