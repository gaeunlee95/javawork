package forexample;

public class GugudanFull {

	public static void main(String[] args) {
		// 구구단 전체 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		System.out.println("===============");

		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
