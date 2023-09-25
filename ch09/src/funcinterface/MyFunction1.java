package funcinterface;

//함수형 인터페이스를 사용하려는 이유 - 익명 함수를 사용하기 위해
//함수형 인터페이스에서는 추상 메서드 1개 밖에 사용할 수 없음
@FunctionalInterface
public interface MyFunction1 {
	public void method();
	
	//public void method2(); //사용불가
	
}

