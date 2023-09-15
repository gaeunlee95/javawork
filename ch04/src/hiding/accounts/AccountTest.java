package hiding.accounts;

public class AccountTest {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account = new Account();
		//멤버에 직접 접근하지 못하도록 권장
		//account.ano = "111-222-3333";
		//멤버 메서드에 접근 가능
		account.setAno("111-222-3333");
		account.setOwner("김대박");
		account.setBalance(10000);
		
		//계좌번호 출력
		System.out.println("계좌 번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance());
		
		//System.out.println(account.ano);

		
	}

}
