package exceptions;

public class ExceptionHandling2 {
	
	public static void printLength(String data) {
		//예외처리(실행 예외 - 런타임 오류)
		try {
			//에러가 발생할 수 있는 영역
			int count = data.length();		//글자수 세는 함수
			System.out.println("문자 수: " + count);
		}catch(NullPointerException e) {
			//에러 처리 구문
			System.out.println(e.getMessage());
			//e.printStackTrace();		//경로를 추적해서 에러를 출력
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("지하철");
		printLength(null);
		
		System.out.println("[프로그램 종류]\n");
		
		
		
	}

}
