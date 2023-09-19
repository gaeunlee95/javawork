package interfaceex.caculator;

public class CalcTest {

	public static void main(String[] args) {
		//인터페이스는 개체를 생성할 수 없음
		//Calculator cal = new Calculator();
		MyCalculator calc = new MyCalculator();
		int n1 = 10, n2 = 0;
		
		int add = calc.add(n1, n2);
		int sub = calc.sub(n1, n2);
		int mul = calc.mul(n1, n2);
		int div = calc.div(n1, n2);
		
		//출력
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}

}
