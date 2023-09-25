package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyFunction1 function;
		
		//람다식 표현으로 추상메서드를 실제로 구현
		//매개변수가 없음 - 빈 소괄호 사용
		//코드가 1줄인 경우{} - 중괄호 생략 가능
		//MyFunction 인터페이스의 function의 
		/*function = () -> {
			System.out.println("안녕");
		};*/ 
		
		function = () -> System.out.println("안녕");
		
		//실행함수 호출
		function.method();
	}

}
