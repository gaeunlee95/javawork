package input;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nexLine()
		// 숫자 - nextInt() 
		Scanner scanner = new Scanner(System.in);
		// ** Scanner > import scanner > 상단의 import java.util.Scanner; 표시됨
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine(); // 문자열 입력
		
		System.out.print("나이 입력: ");
		int age = scanner.nextInt();
		System.out.println("이름: " + name + ", 나이: " + age);
		
		scanner.close(); //닫기
		
		
	}

}
