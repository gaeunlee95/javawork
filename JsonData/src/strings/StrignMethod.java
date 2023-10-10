package strings;

import java.util.Scanner;

public class StrignMethod {

	public static void main(String[] args) {
		
		//주민등록번호 - 문자의 길이: length()
		//String personId = "941005-2345678";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요: ");
		String personId = scanner.nextLine();
		
		System.out.println(personId.length());
		
		//문자 추출 - substring()
		String yyyymmdd = personId.substring(0, 6);
		System.out.println(yyyymmdd);
		
		String secondNum = personId.substring(7); //7번 인덱스부터 끝까지 추출
		System.out.println(secondNum);
		
		//성별 구분 - 인덱스의 문자 확인
		char gender = personId.charAt(7);
		
		
		if(personId.length() == 14) {
			if(gender == '1' || gender == '3') {
				System.out.println("남자");
			}
			if(gender == '2' || gender == '4') {
				System.out.println("여자");
			}
		}else {
			System.out.println("잘못된 주민번호 형식입니다.");
		}
		
		scanner.close();
	}

}
