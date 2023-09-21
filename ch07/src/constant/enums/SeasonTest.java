package constant.enums;

public class SeasonTest {

	public static void main(String[] args) {
		//Season 클래스의 객체 season 생성
		Season season;
		//season의 값 초기화
		season = Season.가을;	 //초기화
		
		//System.out.println(Season.여름);
		
		//switch문을 사용하여 계절 출력
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		default:
			System.out.println("계절이 없습니다.");
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다.");
	}

}
