package protectedex.pack2;

import protectedex.pack1.A;

//A를 D가 상속 받음
//다른 패키지여도 상속 관계는 protected에 접근(사용) 가능
public class D extends A {

	public D() {
		//super();
		this.field = "yes";
		this.method();
	}
	
//	public D(String field) {
//		super(field); //부모 클래스 A의 field 값 가져옴
//	}
	
	
	
	
}
