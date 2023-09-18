package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		//String name = "우영우"; //메모리 위치 - 스택 영역
		String name1 = new String("우영우"); //메모리 위치 - 힙 
		String name2 = new String("우영우"); //메모리 위치 - 힙
		
		//인스턴스의 메모리 주소 비교
		//해쉬코드 확인 - 물리적 메모리 주소(십진수) //System.identityHashCode()
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		//주소, 문자열 비교
		System.out.println(name1 == name2);      //주소 비교 - false
		System.out.println(name1.equals(name2)); //문자열 비교 - true

		System.out.println("===========================================");
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		
		//주소 비교
		System.out.println(book1 == book2);     //주소 비교 - false
		System.out.println(book1.equals(book2));//문자열 비교 - false /// equal 재정의 필요
		
		//book 인스턴스의 물리적 주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
	
		//논리적 주소 일치 시킴 - hashCode() : Object 클래스가 제공
	
	}

}
