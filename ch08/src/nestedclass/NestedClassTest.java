package nestedclass;

//중첩 클래스
//클래스 A 선언
class A{
	//클래스 A의 객체 생성 시 "A객체 생성"출력되는 생성자 
	A(){System.out.println("A객체 생성");}

	//내부 인스턴스 멤버 클래스
	//
	class B{
		int field1;
		//static int field2; //내부 클래스에서 static 변수가 생성 안됨 /static class로 수정해야 사용가능
		B(){System.out.println("B객체 생성");}
		
		void method1() {}
	}

	//내부 정적 멤버 클래스
	static class C{
		int field1;
		static int field2;
		
		C(){System.out.println("C객체 생성");}
		
		void method1() {}
		static void method2() {}
	}
	
	//메서드 내부 로컬 클래스 사용
	void method() {
		class D{
			int field1;
			//static int field2; //사용불가
			D(){System.out.println("D객체 생성");}
			void method1() {};
		}
		//d 객체 생성
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
	
}

public class NestedClassTest {

	public static void main(String[] args) {
		//a 객체 생성
		A a = new A();
		
		//b 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//c 객체 생성
		//static이 있으면 클래스로 직접 접근
		A.C c = new A.C();
		c.field1 = 2;
		A.C.field2 = 3;
		A.C.method2();
		
		//d 클래스의 method() 메서드 호출
		a.method();
		
	}

}
