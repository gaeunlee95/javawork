package exceptions.throwex;

public class ThrowsTest {

	public static void main(String[] args) {
		//함수를 호출한 곳에서 예외 처리함
		try {
			findClass(); //Class 클래스에 대해 이 메서드에도 오류가 날수있으니 일반 예외 발생
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	//
	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 체크해줌 - 일반 예외
		Class.forName("java.lang.System2"); //오류 발생 //java.lang.System
	}
}
