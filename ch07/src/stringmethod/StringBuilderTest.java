package stringmethod;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder, StringBuffer - 문자열 변경이 가능한 클래스(메모리 주소 변경되지 않고 유지)
		
		//String()의 객체 javaStr 생성 및 문자열 삽입
		String javaStr = new String("Java");
		
		//
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산전 buffer 메모리 주소: " + System.identityHashCode(javaStr));
		
		//문자열 추가, 연결 - append() 사용
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("programming are fun!!");
		
		System.out.println(buffer);
		System.out.println("연산후 buffer 메모리 주소: " + System.identityHashCode(javaStr));
		
	}

}
