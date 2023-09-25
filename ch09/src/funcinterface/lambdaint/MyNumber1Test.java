package funcinterface.lambdaint;

public class MyNumber1Test {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		MyNumber1 number;
		
		//변수에 람다식을 저장
		//calculate()를 구현함
		/*number = (x) -> {	//더하기 계산
			x = x + 10;
			System.out.println(x);
		};*/
		
		//어떤 수에 10을 더하는 함수 구현
		//매개변수가 1개인 경우 소괄로 생략 가능
		number = x -> System.out.println(x+10);
		
		//calculate() 호출
		number.calculate(1);
		
		//어떤 수를 제곱하는 함수 구현
		number = n -> System.out.println(n * n);
		number.calculate(2);
		
		
		
	}

}
