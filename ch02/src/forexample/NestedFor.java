package forexample;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열에 '*' 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print('*');
			}
			System.out.println(); //한줄 띄움
		}
		
		/*
		 * i=1 j=1 *
		 *     j=2 **
		 *     j=3 ***
		 *     j=4 ****
		 *     j=5 *****
		 * i=2 j=1 *
		 *     j=2 **
		 *     j=3 ***
		 *     j=4 ****
		 *     j=5 *****    
		 * 
		 */
		System.out.println("============");
		
		//삼각형 모양1 - 행의 변화는 없고 열이 해 증가때마다 1씩 증가
        /*
	         *
			 **
			 ***
			 ****
			 *****
		 */ 
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print('*');
			}
			System.out.println(); //한줄 띄움
		}

		//삼각형 모양2 - 행의 변화는 없고 열이 해 증가때마다 1씩 감소
        /*
			 *****
			 ****
			 ***
			 **
			 *
		 */ 
		System.out.println("============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄 띄움	
		}
		
		System.out.println("============");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print('*');
				//System.out.println("i=" + i + ", j" + j);
			}
			System.out.println(); //한줄 띄움	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
