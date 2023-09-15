package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 - score(정수형/int), grade(문자형/char,string)
		// A학점 - 90점 ~ 100점
		// B학점 - 80점 ~ 89점
		// C학점 - 70점 ~ 79점
		// D학점 - 60점 ~ 69점
		// F학점 - 0 ~ 59점
		
		// 객체(변수) scan 생성
		Scanner scan = new Scanner(System.in);
			
		//입력
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt(); //사용자 입력
		char grade = 'A'; //char 한 문자(홑따음표/'')
		
		//연산
		if(score >= 90 && score <= 100) { //true && true
			grade = 'A';
		}else if(score >= 80 && score <90) {
			grade = 'B';
		}else if(score >= 70 && score <80) {
			grade = 'C';
		}else if(score >= 60 && score <70) {
			grade = 'D';
		}else { // else if(score >= 0 && score < 60)
			grade = 'F';
		}
		//출력
		System.out.println(grade + " 학점입니다.");
		scan.close();
		
		
		/*
		Scanner sc = new Scanner (System.in);
		
		System.out.print("학점 : ");
		int score1 = sc.nextInt();
		char grade1;
		
		if(score1 >= 90) {
			grade1 = 'A';
		}else if(score1 >= 80) {
			grade1 = 'B';
		}else if(score1 >= 70) {
			grade1 = 'C';
		}else if(score1 >= 60) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		System.out.println(grade + " 학점 입니다");
		sc.close();
		*/


	}

}
