package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		  for(초기값; 종료값; 증감값){			
			   실행문			
			}
		*/
		// 1 ~ 10 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//아스키 코드값 알파벳 출력
		//'A' - 65, 'a' - 97, 0 - 48
		char alpha = 'A';
		System.out.println(alpha);
		
		int val = 66;
		System.out.println((char)val); //B
		
		for(int num=65; num<=90; num++) {
			System.out.print((char)num + " ");
		}
		System.out.println();
		
		//영어 아스키 코드값 (65부터 123까지 출력)
		for(char ch=65; ch<123; ch++){
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//한글 아스키 코드값(12593 ~ 12686)
		for(char ch=12593; ch<=12686; ch++) {
			System.out.print(ch + " ");
		}
		
		
		
		
		

	}

}
