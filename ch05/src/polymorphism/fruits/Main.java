package polymorphism.fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3. 복숭아");
		System.out.println("선택>");
		
		//문자를 숫자형으로 변환
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		//객체 생성시 다형성 이용
		Fruit fruit = null;
		if(selectNo == 1) {
			fruit = new Grape();
		}else if(selectNo == 2) {
			fruit = new Banana();
		}else if(selectNo == 3) {
			fruit = new Peach();
		}else {
			System.out.println("지원되는 기능이 없습니다.");
		}
		fruit.showFruitInfo();
		
		
		scanner.close();
	}
	
}
