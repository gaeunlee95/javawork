package constant.enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		//Week 클래스의 객체 today 생성 및 초기화
		Week today = null;
		
		//Calendar 클래스의 객체 cal 생성 및 ...
		Calendar cal = Calendar.getInstance();
		
		//Day_OF_WEEK 함수를 이용하여, 오늘의 요일값(정수) 변수 week에 저장
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week);
		
		//switch문을 이용하여, 오늘의 요일 출력
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
			default:
				System.out.println("요일이 업습니다."); break;
		}
		System.out.println("Today is " + today);
	
		//if문을 사용하여, 일요일 경우와 아닐 경우에 대해 선언
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영화보러 갑니다.");
		}else {
			System.out.println("열심히 코딩합시다.");
		}
	
	}

}
