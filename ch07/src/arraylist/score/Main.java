package arraylist.score;

public class Main {

	public static void main(String[] args) {
		// Student 객체 std 생성
		Student std1 = new Student(101, "우영우");
		
		//각 객체의 과목과 점수 삽입
		std1.addSubject("국어", 90);
		std1.addSubject("수학", 85);
		std1.addSubject("Java", 100);
		
		//객체의 정보 출력
		std1.showStudentInfo();
		
	}

}
