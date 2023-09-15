package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		System.out.println("===============");
		
		// 배열 - 순서가 있다, 중복 가능
		// 직접 저장 - 중괄호{} 사용
		String[] cars = {"Sonata","Morning", "K7", "K7"};
		//String[] cars = new String[]{"Sonata","Morning", "K7", "K7"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		System.out.println("===============");
		
		//배열의 크기(개수) - 배열이름.length
		System.out.println("배열의 크기 : " + cars.length);
		
		//for문 - 전체 조회
		for(int i = 0; i < cars.length; i++) { //0, 1, 2, 3
			System.out.println(cars[i]);
		}
		
		
		
	}
}
	
	
