package forexample;

public class GududanTest {

	public static void main(String[] args) {
		// 단일 for()
		/*
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * 
		 * 3 x 3 = 9
		 * ...
		 * 3 x 8 = 24
		 * 3 x 9 = 27
		 */

		int dan =3;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + "= " + (dan*i));
		}
		
		System.out.println("===================");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("3 x %d = %d\n",3 , i);
		}
		
		
		
		
		
		
	}

}
