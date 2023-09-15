package switchexample;

public class SwitchPractice {

	public static void main(String[] args) {
		// 엘리베이터
		// 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스 클럽
		// 변수 - floor, name
		
		int floor = 1;
		String name= "";
		
		switch(floor) {
		case 1: 
			name = "약국";
			break;
		case 2: 
			name = "정형외과";
			break;
		case 3: 
			name = "피부과";
			break;
		case 4: 
			name = "치과";
			break;
		case 5: 
			name = "헬스 클럽";
			break;
		default:
			return;
		}
		System.out.println(floor + "층 " + name + "입니다.");

	}

}
