package thissamples;

public class ThisTest {

	public static void main(String[] args) {
		//생성된 인스턴스 - bDay와 this 속성과 주소 같음
		BirthDay bDay = new BirthDay();
		bDay.setYear(2023);
		
		System.out.println(bDay);
		bDay.printThis();
	}

}
