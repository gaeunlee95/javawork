package banking.bank_db;

import java.util.Scanner;

import banking.domain.AccountDAO;

public class Main {

	public static void main(String[] args) {
		//AccountDAO의 객체 생성 - 메서드 사용 가능
		AccountDAO dao = new AccountDAO();
		boolean sw = true;
		Scanner scanner = new Scanner(System.in);
		
		while(sw) {
			try {
				System.out.println("==============================================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.삭제 | 6.계좌 검색| 7.종료");
				System.out.println("==============================================================");
				System.out.println("선택>");
				
				//메뉴 선택
				int selectNo = Integer.parseInt(scanner.nextLine());
				//int selectNo = scanner.nextInt(); //사용불가 
				//정수를 입력해야하는 경우, nextInt()는 개행문자 오류가 있으니 Integer.parseInt(scanner.nextLine() 사용 
				
				if(selectNo == 1) {
					dao.createAccount();      	//계좌 생성
				}else if(selectNo == 2) {
					dao.getAccountList();			//계좌 목록
				}else if(selectNo == 3) {
					dao.deposit();				//입금
				}else if(selectNo == 4) {
					dao.withdraw();				//출금
				}else if(selectNo == 5) {
					dao.removeAccount();			//종료
				}else if(selectNo == 6) {
					dao.selectAccount();			//계좌 검색
				}else if(selectNo == 7) {
					sw = false;					//종료
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요.");
				}
			}catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("올바른 숫자를 입력해주세요");
			}
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
	}

}
