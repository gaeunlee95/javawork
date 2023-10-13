package banking.array;

import java.util.Scanner;

import banking.domain.Account;
//gpt 및 네 버전
public class BankMain {
	//계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			System.out.println("============================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("============================================");
			System.out.println("선택>");
			
			//메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());
			//int selectNo = scanner.nextInt(); //사용불가 
			//정수를 입력해야하는 경우, nextInt()는 개행문자 오류가 있으니 Integer.parseInt(scanner.nextLine() 사용 
			
			if(selectNo == 1) {
				createAccount();      	//계좌 생성
			}else if(selectNo == 2) {
				getAccountList();		//계좌 목록
			}else if(selectNo == 3) {
				deposit();				//입금
			}else if(selectNo == 4) {
				withdraw();				//출금
			}else if(selectNo == 5) {
				sw = false;				//종료
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요.");
			}
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}//main 끝

	
	//계좌 생성
	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		
//		// 중복 계좌 번호를 확인합니다.
	    if (findAccount(ano) != null) { //1111이라는 이미 생성된 계좌가 있으면 해당 코드 실행
	        System.out.println("결과: 계좌가 중복되었습니다. 다시 입력해 주세요.");
	        return; // 중복된 계좌 번호가 입력되면 "메서드를 종료합니다."
	    }
		
		System.out.print("계좌주: "); //계좌주 정보 삽입
		String owner = scanner.nextLine();
		
		System.out.print("초기 입금액: "); //잔고 삽입
		int balance = Integer.parseInt(scanner.nextLine());
		//int balance = scanner.nextInt(); //사용불가
		
		//accounts[0] = new Account(ano, owner, balance); //연습 데이터 1개 생성
		//i번째 값이 없을 경우 계좌(객체)를 생성
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) { //배열의요소가 비어있을때 계좌를 저장함
				accounts[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록
	private static void getAccountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------------");
	
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) { //계좌가 있는 배열의 요소 출력
				System.out.print("계좌번호: " + accounts[i].getAno() + "\t");
				System.out.print("계좌주: " + accounts[i].getOwner() + "\t");
				System.out.println("잔고: " + accounts[i].getBalance());
			}
		}
	}
	//입금
	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();

		if(findAccount(ano) != null) { //입력한 계좌번호(ano)가 있으면 실행
			System.out.print("입금액: ");
			int money = Integer.parseInt(scanner.nextLine()); //Integer.parseInt(scanner.nextLine()) - 입력받은 문자열을 정수로 변환
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 정상 처리되었습니다.");
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}

	
	//출금
	private static void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		
		if(findAccount(ano) != null) { //입력한 계좌번호(ano)가 있으면 실행
			System.out.print("출금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			Account account = findAccount(ano);
			if(money <= account.getBalance()){
				account.setBalance(account.getBalance() - money);
				System.out.println("결과: 정상 처리되었습니다.");
			}else {
				System.out.println("결과: 잔액이 부족합니다. 다시 입력해 주세요.");
			}
		}else{
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
	

	//계좌 검색
	private static Account findAccount(String ano) {
		Account account = null; //찾을 계좌를 저장할 객체 변수 선언 
		//즉, 변수를 초기화 /내부에서 계좌를 찾지 못한 경우 처리하기 위해
		//계좌를 찾은 경우 객체를 저장, 찾지 못한 경우 null 값을 유지
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno(); //이미 생성된 계좌번호 가져옴
				if(dbAno.equals(ano)) { //외부에서 입력한 찾는 계좌와 일치하면
					account = accounts[i];	//일치하는 계좌를 저장함
					break;
				}
			}
		}
		return account;
	}

}
