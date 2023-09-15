package wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		//int num1 = 100;
		Integer num1 = 100;
		int num2 = 200;
		
		//num1이 객체이므로 메서드 접근 가능함
		int sum = num1.intValue() + num2;
		
		System.out.println(num1);
		System.out.println(sum);
		
		//valueOf() 메서드 -> 정수나 문자열을 숫자로 변환
		Integer num3 = Integer.valueOf("123");
		System.out.println(num3);
		
		//parseInt() -> 문자열을 숫자로 변환
		Integer num4 = Integer.valueOf("456");
		System.out.println(num4);

	}

}
