package whileexample;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계
		// 변수 - n, sum
		int n = 0;
		/*n += 1; //0+1=1
		n += 2; //1+2=3
		n += 3; //3+3=6 */ 
		int sum = 0;
		
		while(n < 10) {
			n++; //n = n + 1
			sum += n; //sum = sum + n
			System.out.println("n=" + n + ", sum=" + sum);
		}
		System.out.println("합계: " + sum);
	}

}
