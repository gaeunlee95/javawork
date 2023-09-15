package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 1 증가, 1 감소 연산자(++, --)
		int num = 10;
		
		//num = num + 1;
		//num += 1; //복합 대입연산자
		num++; //1 증가 (C, 자바) / 반복구문에 사용
		System.out.println(num);
		
		int num2 = 20;
		//num2 = num2 -1;
		//num2 -= 1;
		num2--; //1 감소
		System.out.println(num2);
		
		System.out.println("==================");
		
		//복합 대입 연산자 연습
		int val = 100;
		System.out.println(val += 1); //val = val + 1 (100 + 1)
		System.out.println(val -= 1); //val = val - 1 (101 - 1)
		System.out.println(val *= 10); //val = val * 10 (100 * 10)
		System.out.println(val /= 10); //val = val / 10 (1000 / 10)
	}

}
