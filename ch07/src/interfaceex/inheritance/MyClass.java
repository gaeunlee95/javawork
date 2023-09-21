package interfaceex.inheritance;

public class MyClass implements MyInterface
{
	//인터페이스 MyInterface의 메서드들의 구현부 정의
	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void method() {
		System.out.println("method()");
	}
		
}
