package whileexample;

import java.util.Scanner;

public class CoffeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 - 5
		// 커피값 - 500 , 투입하면 커피 나옴
		// 500원을 초과하면 거스름돈과 커피가 나옴
		// 500원이 부족하면 커피 안나옴
		// 커피가 다 떨어지면 "판매를 중단합니다" 출력 - 프로그램 종료
		Scanner sc = new Scanner(System.in);
				
		int coffee = 5;
		
		while(true) {
			System.out.print("돈을 넣어주세요 : ");
			int money = sc.nextInt(); // 돈을 입력
			
			if(money == 500) {
				System.out.println("커피가 나옵니다");
				coffee -= 1; // coffee = coffee - 1
				
			}else if(money > 500) {
				System.out.println((money-500) + "원을 돌려주고 커피가 나옵니다.");
				coffee -= 1;
			}else {
				System.out.println("커피가 나오지 않습니다.");
			}
			System.out.println("남은 커피의 양은 " + coffee + "개 입니다.");
			
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되었습니다. 판매를 중지합니다.");
				break;
			}
		}//while 끝
		sc.close();
	}//main 끝

}
