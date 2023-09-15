package switchexample;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		// 메달 색상에 따른 메달 출력
		// 변수 - medalColor
		// "Gold", "Silver", "Bronze"
		String medalColor = "B";
		
		switch(medalColor) {
		case "Gold" :
			System.out.println("금메달 입니다.");
			break;
		case "Silver" :
			System.out.println("은메달 입니다.");
			break;
		case"Bronze" :
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		
		
	}
}
