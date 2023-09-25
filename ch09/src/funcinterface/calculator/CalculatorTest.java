package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		// 인터페이스 Calculator의 추상메서드 calculate()를 구현 - 람다식으로
		// 람다식 - (매개변수) -> {구현문};
		// 덧셈 구현 
		add = (x, y) -> x + y;
		
		// 뺄셈 구현
		sub = (x, y) -> x - y;
		
		// 곱셈 구현
		mul = (x, y) -> x * y;

		// 나눗셈 구현
		div = (x, y) -> x / y;
		
		// calculate() 호출
		System.out.println("두 수의 합: " + add.calculate(num1, num2));
		System.out.println("두 수의 빼기: " + sub.calculate(num1, num2));
		System.out.println("두 수의 곱셈: " + mul.calculate(num1, num2));
		System.out.println("두 수의 나눗셈: " + div.calculate(num1, num2));
	}

}
