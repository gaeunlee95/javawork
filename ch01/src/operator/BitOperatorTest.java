package operator;

public class BitOperatorTest {

	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5;	//이진수 00000101 (8비트, 8자리)
		int num2 = 10;  //이진수 00001010 
						//이진수 00000000 - &
						//이진수 00001111 - |
		int result;
		
		result = num1 & num2;  //모두 1일때 1이고, 나머지는 0
		System.out.println(result);  //00000000 -> 0
		
		result = num1 | num2;  //둘중의 하나만 1이어도 1임
		System.out.println();  //00001111 -> 15
		
		
		//비트 이동 연산자
		int a = 10;	//00001010
		//a<<2 - 변수 a를 2비트 만큼 왼쪽으로 이동
		System.out.println(a << 2);  //00101000 -> 48
		//a>>2 - 변수 a를 2비트 만큼 오른쪽으로 이동
		System.out.println(a >> 2);  //00000010 -> 2
		
		
	}

}
