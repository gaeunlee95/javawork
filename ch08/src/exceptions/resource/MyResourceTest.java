package exceptions.resource;

public class MyResourceTest {

	public static void main(String[] args) throws Exception {
		//객체 생성
		//MyResource 클래스의 객체 res1 생성 //문자형의 매개변수를 받아야하는 생성자인 문자 res1 삽입
		MyResource res1 = new MyResource("res1");
		
		//System.out.println(res1.read1());
		//System.out.println(res1.read2());

		//객체 res1에 대한 read1(), read2()의 값 출력
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));		//오류 발생(123'a' 정수형으로 변경 불가) //오류를 throw만 해놓았기때문에 다음 구문인 close()실행 불가
		res1.close();
		
		//close() 실행(로그 닫기 출력)
		res1.close();
	}

}
