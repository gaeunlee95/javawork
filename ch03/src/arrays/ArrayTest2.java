package arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열의 선언 및 사용
		// 배열의 크기가 4인 cars 배열 선언
		// 값이 비어있으면 null을 출력
		String[] cars = new String[4];
		
		//입력(저장)
		cars[0] = "Sonata";
		cars[1] = "Morning";
		cars[2] = "K7";
		cars[3] = "K7";
		
		//특정한 위치 (1번 인덱스) 조회
		System.out.println(cars[1]); //Morning
		
		System.out.println("===============");
		
		//전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		
		
		
		
	}

}
