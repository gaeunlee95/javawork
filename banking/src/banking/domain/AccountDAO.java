package banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌 번호(형식-숫자만:00-00-000): ");
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			//계좌번호 형식 검증
			String regExp = "\\d{2}-\\d{2}-\\d{3}"; //형식 
			boolean result = Pattern.matches(regExp, ano);
			
			if(result == false) {
				System.out.println("게좌번호 형식이 아닙니다. 다시 입력해 주세요");
				break;
			}
			if(result)	
			//중복 계좌가 있는지 체킹 fm 쌤
			if(findAccount(ano) != null) { //중복 계좌가 있으면
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				while(true) {
					System.out.print("계좌주: "); //계좌주 정보 삽입
					String owner = scanner.nextLine();
					
					//계좌번호 형식 검증
					regExp = "[a-zA-Z가-힣]+";   //형식 //'+' 없을 시 한글자만 사용가능 
					result = Pattern.matches(regExp, owner);
					
					if(result) {
						System.out.print("초기 입금액: "); //잔고 삽입
						int balance = Integer.parseInt(scanner.nextLine());
						
						//db 작업
						
						
						break;
					}else {
					System.out.println("계좌주는 한글과 영문과 가능하니다. 다시 입력해 주세요");
					}
				}
				break;
			}
		}
	}//createAccount 끝
	
	public void getAccountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------------");
		
		List<Account> accountList = new ArrayList<>();
		//계좌 목록 조회
		for(int i=0;i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.print("잔고: " + account.getBalance() + "\n");
		}
	}//getAccountList 

	public void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //입력한 계좌번호(ano)가 있으면 실행
				Account account = findAccount(ano);
				
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리되었습니다.");
				break;
			}else{
				System.out.println("결과: 계좌가 없습니다.");
			}
		}
	}//deposit 끝
	
	public void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------------");
		
		
			while(true) {
				System.out.print("계좌 번호: ");
				String ano = scanner.nextLine();
				
				if(findAccount(ano) != null) {
					while(true) {
						Account account = findAccount(ano);
						
						System.out.print("출금액: ");
						int money = Integer.parseInt(scanner.nextLine());
					
						if(money > account.getBalance()) { //출금액이 잔고보다 많으면
							System.out.println("결과: 잔액이 부족합니다. 다시 입력해 주세요.");
						}else {
							account.setBalance(account.getBalance() - money);
							System.out.println("결과: 정상 처리되었습니다.");
							break;
						}
					}
					break;
				}else {
					System.out.println("결과: 계좌가 없습니다.");
				}
			}
	}//withdraw 끝
	
	public void removeAccount() {
		System.out.println("----------------------------------------");
		System.out.println("삭제");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				//db 처리
				
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}// while 끝
		
	}
	
	public void selectAccount() {
		//계좌 번호와 일치하는 계좌의 정보 출력
		System.out.println("----------------------------------------");
		System.out.println("계좌 검색");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				//db 처리
				
				
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}
		
	}
	
	//계좌 검색
	public Account findAccount(String ano) {
		Account account = null;
		
		//db 처리
		return account;
	}
	
}
