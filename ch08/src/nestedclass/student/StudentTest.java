package nestedclass.student;

//중첩 클래스는 클래스간 밀접한 관련이 있거나,
//다른 클래스와 협력할 일이 없는 경우에 사용한다.
//Student 클래스 생성
class Student{
	//문자열인 학생이름 변수 name 선언
	private String name;	//private 접근제어자이어도 접근 가능
	
	//매개변수 있는 생성자
	public Student(String name) {
		this.name = name;
	}
	
	//중첩 클래스(내부 클래스, nested, inner)
	//Student 클래스의 내부 클래스 Score 클래스 생성
	class Score{
		//과목점수 변수인 ...
		int eng;
		int math;
		
		void showinfo() {
			System.out.println("이름: " + name);
			System.out.println("영어 점수: " + eng);
			System.out.println("수학 점수: " + math);
		}
	}
}


public class StudentTest {

	public static void main(String[] args) {
		//외부 클래스의 객체(인스턴스) 생성
		Student jang = new Student("장그래");
		
		//내부 클래스의 인스턴스 생성]
		//외부클래스.내부클래스 인스턴스 = 내부 인스턴스.new 내부클래스()
		Student.Score score = jang.new Score();
		
		score.eng = 88;
		score.math = 73;
		score.showinfo();
		
	}

}
