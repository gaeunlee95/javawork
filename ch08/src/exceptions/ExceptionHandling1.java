package exceptions;

public class ExceptionHandling1 {

	public static void printLength(String data) {
		int count = data.length();		//글자수 세는 함수
		System.out.println("문자 수: " + count);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		//printLength("지하철");
		printLength(null);
		
		System.out.println("[프로그램 종류]\n");
		
		
		
	}

}
