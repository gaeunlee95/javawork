package ifexample;

public class Practice230906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 7;
		if (age >= 8) {
			System.out.println("학교를 다닙니다");
		}else {
			System.out.println("학교를 다니지 않습니다");
		}
		
		System.out.println();
		
		char gender1 = 'M';
		if (gender1 == 'F') {
			System.out.println("여성입니다");
		}else {
			System.out.println("남성입니다");
		}
		
		char gender2 = 'F';
		if (gender2 == 'F')System.out.println("여성입니다"); 
		// 수행할 문장이 하나일 경우 중괄호 사용하지 않아도 O ,하지만 하나이든 두개이든 중괄호 사용하는 것이 가독성이 좋고 추후 수행문 추가시 오류 방지

		System.out.println("==================");
		
		int age1 = 60;
		int fee = 0;
		
		
		if(age1 < 8) { 
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age1 >= 8 && age1 < 14) { // ** (age < 14) 가능 / 하나의 조건을 만족시키면 다른 조건은 비교하지 않음
			fee = 2000;
			System.out.println("초등학생입니다.");
		}else if(age1 >= 14 && age1 < 20) { // ** (age < 20) 가능
			fee = 2500;
			System.out.println("중,고등학생입니다.");
		}else if(age1 >= 60) {
			fee = 0;
			System.out.println("경로우대 입니다.");
		}else {
			fee = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + fee + "원 입니다.");
		
	
	}

}
