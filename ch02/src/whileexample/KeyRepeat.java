package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y' 키 입력 -> "계속 반복합니다"
		// 'n' 키 입력 -> "반복을 중단합니다."
		// 그 이외의 키 -> "키를 잘못눌렀습니다."
		// 문자열 동등 비교함수는 equals()
		//String key = "y"; / nextLine()은 String
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) : ");
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) { //key == 숫자 / key.equal(문자)
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("키를 잘못 눌렀습니다.");
			}
		}
	sc.close(); // 입력 종료
	} //main 함수 끝
} //클래스 끝
