package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {

	public void test1() {
	Scanner sc = new Scanner(System.in);
	
	String[] personArr = new String[5];
	
	//1. length() -> length 로 수정 //배열의 경우 length로 갯수 확인 가능
	for(int i = 0; i < personArr.length; i++) {
		//2. i -> (i + 1) 로 수정 // i는 0부터 시작하니, i + 1로 수정해야 1부터 출력
		System.out.print((i + 1)  + "번째 주민번호 입력 : ");
		
		String personId = sc.nextLine();
		
		if((personId.length() == 14)) {
			//3. charAt(8)-> charAt(7) 로 수정 // 성별을 구분하는 인덱스는 7번
			char gender = personId.charAt(7);
			
			//4. 1, 2, 3, 4 -> '1' ,'2', '3', '4' 수정 // 홑따움표 없을 시 문자를 인식하지 못하니 홑따옴표 추가
			if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
				personArr[i] = personId.substring(0, 8) + "******";
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				//5. 잘못 입력된 경우, 다음 인덱스로 넘어가지 않도록 i--; 추가
				i--;
			}
		
		} else {
		System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
		//6. 잘못 입력된 경우, 다음 인덱스로 넘어가지 않도록 i--; 추가
				i--; //이전 인덱스로 이동
		}
	
	}//for문 끝
	
	System.out.println("--- 주민번호 정보 등록 완료 ---");
	
	System.out.println(Arrays.toString(personArr));
	
	}

}