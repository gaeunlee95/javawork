package board;

public class PrintfTest {

	public static void main(String[] args) {
		//정수 
		System.out.printf("%d\n", 85);   //85
		System.out.printf("%7d\n", 85);  //     85 (85를 포함하여 7자리, 빈자리는 공백처리)
		System.out.printf("%-7d\n", 85); //85      (7자리, 빈자리는 공백처리, 왼쪽정렬)
		System.out.println();
		
		//문자열
		System.out.printf("%s\n", "hello");  //hello
		System.out.printf("%7s\n", "hello"); //  hello
		System.out.printf("%7s\n", "hello"); //hello  
	}

}
