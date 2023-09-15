package statics.student;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 객체 변수, 클래스 객체 변수(static)
		//클래스 변수는 클래스 이름으로 직접 접근(new 하지 않음)
		//클래스 변수는 값이 공유되고, 누적되며 프로그램이 종료되면 소멸함
		//static있을 경우, new 사용x
		Student.serialNum++;
		System.out.println(Student.serialNum); //1001
		
		Student.serialNum++;
		System.out.println(Student.serialNum); //1002
		
		Student s1 = new Student();
		s1.setId(101);
		System.out.println("학번: " + s1.getId());
		
		
		
		
		//잘못된 예제
		//Student s1 = new Student();
		//Student s2 = new Student();
		
		//s1.serialNum++;
		//System.out.println(s1.serialNum); //1001
		
		//s2.serialNum++;
		//System.out.println(s2.serialNum); //1001
		
		//System.out.println("s1= " + s1.getId());
		//System.out.println("s2= " + s2.getId());
		
		
	}

}
