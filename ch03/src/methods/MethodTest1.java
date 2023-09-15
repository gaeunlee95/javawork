package methods;

public class MethodTest1 {
	
		// 변수의 선언과 사용
		// 함수 정의(선언)와 호출(사용)

	public static void main(String[] args) {
		sayHello(); //함수를 호출
		sayHello2("파이썬");
		sayHello2("우영우");
	}
	
	//sayHello() 이름의 함수를 정의
	//void - 반환값이 없음(비어 있다)
	public static void sayHello() {
		System.out.println("안녕하세요~ 자바");
	}
	
	//매개변수(parameter)가 있는 함수 정의
	public static void sayHello2(String name) {
		System.out.println("안녕하세요~ " + name);
	}
	
	
	
}
