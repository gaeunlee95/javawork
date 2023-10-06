package continueexam;

public class ContinueTest {

	public static void main(String[] args) {
		//1. break문 - 1~10까지 자연수중 1~5까지 출력
		for(int i=1; i<=10; i++) {
			if(i > 5) {
				break;
			}
			System.out.print(i);
		}
		
		System.out.println();
		
		//2. continue문 - 1~10까지 자연수중 5와 8을 제외한 수 출력
		//반복하다가 continue를 만나면 이후의 코드를 수행하지 않고 조건식이나 증감식을 수행
		for(int i=1; i<=10; i++) {
			if(i == 5 || i == 8) {
				continue;
			}
			System.out.print(i);
		}
	
	}
}