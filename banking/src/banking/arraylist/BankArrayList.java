package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>(); 
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		
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
					createAccount();      		//계좌 생성
				}else if(selectNo == 2) {
					getAccountList();			//계좌 목록
				}else if(selectNo == 3) {
					deposit();					//입금
				}else if(selectNo == 4) {
					withdraw();					//출금
				}else if(selectNo == 5) {
					removeAccount();			//종료
				}else if(selectNo == 6) {
					selectAccount();			//계좌 검색
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
	
	}//main 끝

	private static void createAccount() {
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
				System.out.print("계좌주: "); //계좌주 정보 삽입
				String owner = scanner.nextLine();
				
				System.out.print("초기 입금액: "); //잔고 삽입
				int balance = Integer.parseInt(scanner.nextLine());
				
				//입력받은 내용을 매개변수로 계좌 생성함
				Account newAccount = new Account(ano, owner, balance);
				accountList.add(newAccount);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}//createAccount 끝
	
	private static void getAccountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------------");
	
		//계좌 목록 조회
		for(int i=0;i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.print("잔고: " + account.getBalance() + "\n");
		}
	}//getAccountList 

	private static void deposit() {
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
	
	private static void withdraw() {
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
	
	private static void removeAccount() {
		System.out.println("----------------------------------------");
		System.out.println("삭제");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				accountList.remove(account);
				System.out.println("계좌가 삭제 되었습니다.");
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}
		
	}
	
	private static void selectAccount() {
		//계좌 번호와 일치하는 계좌의 정보 출력
		System.out.println("----------------------------------------");
		System.out.println("계좌 검색");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				System.out.println("결과: 계좌가 검색 되었습니다.");
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.print("잔고: " + account.getBalance() + "\n");
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}
		
	}
	
	//계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i<accountList.size(); i++) {
			
			//이미 등록된 계좌를 가져와서 
			//외부에서 입력한 계좌와 일치하는지 비교함
			//if(accountList.get(i) != null) {
				String dbAno = accountList.get(i).getAno();
				if(dbAno.equals(ano)) {
					account = accountList.get(i); //계좌 객체 생성
					break;
				}
			}
		//}
		return account;
	}
	
}
