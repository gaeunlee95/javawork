package classes.methods;

public class Hello {
	
	//기본 생성자
	//public Hello() {} //생략가능(매개변수 없는 생성자)

	//sayHello() 메서드 정의
	//메서드 오버로딩(함수 이름은 같고 매개변수는 다름)
	public void sayHello() {
		System.out.println("안녕");
	}
	
	public void sayHello(String name) {
		System.out.println("안녕~" + name);
	}
}
