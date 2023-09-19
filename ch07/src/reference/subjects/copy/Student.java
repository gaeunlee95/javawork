package reference.subjects.copy;

public class Student {
	//필드
	int studentID; 		//학번
	String studentName; //이름
	Subjects korean;	//국어 과목(참조)
	Subjects math; 		
	
	//생성자
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subjects(); //korean 객체 생성
		math = new Subjects();
	}
	
	//국어 과목 추가 메서드 정의
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setSubjectPoint(score);
	}
	//수학 과목 추가 메서드 정의
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setSubjectPoint(score);
	}
	
	//학생의 정보 출력
	public void showStudentInfo(){
		System.out.println(studentName + "의 " + korean.getSubjectName()
				+ "점수는 " + korean.getscorePoint() + "점 입니다.");
		System.out.println(studentName + "의 " + math.getSubjectName()
		+ "점수는 " + math.getscorePoint() + "점 입니다.");
	}

}


