package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		//일반예외 - 컴파일 오류(컴파일러 체크) 
		//try ~ catch()
		//try ~ catch() ~ finally
		try {
			//클래스 이름을 잘못 기록하면 에러 발생
			Class.forName("java.lang.Strings"); //class 이름에 오타가 발생될 수 있어 미리 일반 예외로 안내해줌 //java.lang.String
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {	//혹은 Exception e
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} finally {		//프로그램 상 항상 실행해야 할 경우에 사용함
			System.out.println("항상 수행됨");
		}
		
	}

}
