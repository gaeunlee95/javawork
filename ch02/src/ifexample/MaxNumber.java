package ifexample;

public class MaxNumber {

	public static void main(String[] args) {
		// 두 수중 큰 값을 찾는 프로그램
		// 변수 - n1, n2, max
		int n1 = 10;
		int n2 = 20;
		int 최대값; //한글이름 선언
		
		//연산1.if ~ else구문
		if(n1 >= n2) { //n1 > n2 || n1 = n2 
			최대값 = n1;
		}else { //n1 < n2 생략
			최대값 = n2;
		}
		
		//연산2. 조건 연산자
		int max = (n1 >= n2) ? n1: n2; 
		
		//출력
		System.out.println("두 수중 큰 값은 " + 최대값 + "입니다.");
		System.out.println("두 수중 큰 값은 " + max + "입니다.");
	}

}
