package arrays;

public class ArrayGugudan {

	public static void main(String[] args) {
		// 구구단 3단 
		// 변수 dan(3) 선언
		int dan = 3;
		
		//출력
		for(int i=0; i<9; i++) {
			System.out.println(dan + " x " + (i + 1) + " = " + dan * (i + 1));
		}

		System.out.println("========================");
		
		//배열을 사용하여 구구단(gugudan) 저장 및 출력
		//값이 9개인 gugudan 배열 생성
		int[] gugudan = new int[9];
		//gugudan[0] = dan * 1;
		
		
		//값 저장 및 출력
		for(int i=0;i<gugudan.length; i++) {
			gugudan[i] = dan * (i + 1);
			//System.out.println(dan + " x " + (i + 1) + " = " + gugudan[i]);
		}
		
		for(int i=0;i<gugudan.length; i++) {
			//gugudan[i] = dan * (i + 1);
			System.out.println(dan + " x " + (i + 1) + " = " + gugudan[i]);
		}
		
		System.out.println("========================");
		//전체 구구단 
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				
			}
		}
		
		
		
		
		
		//배열 복사
		//값이 9개인 배열 gugudan2 생성
		int[] gugudan2 = new int[9];
		
		//1. 일반 복사 (for문 사용)
		for(int i=0; i<gugudan2.length; i++) {
			gugudan2[i] = gugudan[i];
		}
		
		//출력
		for(int i=0; i<gugudan2.length; i++) {
			System.out.println(dan + " x " + (i + 1) + " = " + gugudan2[i]);
		}
		
		System.out.println("========================");
		
		//2. Object 크래스의 clone()
		//값이 9개인 배열 gugudan3 생성
		int[] gugudan3 = gugudan2.clone();
		
		//출력
		for(int i=0; i<gugudan3.length; i++) {
			System.out.println(dan + " x " + (i + 1) + " = " + gugudan3[i]);
		}
		
	}
}
