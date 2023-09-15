package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		// 1.예금 2.출급 3.잔고 4.종료
		//메뉴 화면 만들기
		Scanner sc = new Scanner(System.in);
		int balance = 0;    //잔고
		boolean sw = true; //상태 변수
		
		while(sw) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			
			int selNum = sc.nextInt(); //메뉴 번호 입력
			
			switch(selNum) {
			case 1:
				System.out.println("예금액>");
				int deposit = sc.nextInt();
				balance += deposit; //balance = balance + sc.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				int withdrawal = sc.nextInt();
				if(withdrawal > balance) {
					System.out.println("출금액이 부족합니다.");
				}else {
					balance -= withdrawal;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				sw = false; // 상태를 바꿈 - while문 종료 
				break;
			default:
				System.err.println("지원되지 않는 기능입니다.");
			}
			
		}//while 끝
		System.out.println("프로그램 종료");
		sc.close();
		
		
		
		
		
	}
		
		
}//main 끝

