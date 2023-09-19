package arraylist.score;

//Subject 자료형 정의
public class Subject {
	//필드
	private String subjectName; //과목 이름
	private int scorePoint;     //과목 점수
	
	//기본 생성자
	public Subject() {}
	
	//매개변수 있는 생성자
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	//getter, set은 상단 생성자에서 진행
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectPoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//점수 출력
	public int getscorePoint() {
		return scorePoint;
	}
}
