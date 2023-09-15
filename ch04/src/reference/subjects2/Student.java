package reference.subjects2;

import reference.subjects.Subjects;

public class Student {
	//필드
	private int studentId; 		//int studentId = 0
	private String studentName; //String studentName = null
	private Subjects[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subjects[10];
	}
	
	//과목 추가 메서드
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값(과목이름, 점수)을 저장
		Subjects subject = new Subjects(name, score);

		//과목을 배열에 저장
		//subjects[0] = subject; //1개 저장
		for(int i = 0; i<subjects.length; i++) {
			if(subjects[i] == null) { //배열의 요소가 비어있을때
				subjects[i] = subject; //배열 객체를 저장
				break; //빠져 나옴
			}
		}
	}
	
	//학생 정보 출력
	public void showStudentInfo() {
		int total = 0; //총점
		double average; //평균
		int count = 0; // 개수
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) { //배열의 요소 차 있을때(비어있지 않을때)
				count++;
				total += subjects[i].getscorePoint(); //점수 누적
			System.out.println(studentId + "번 학생 " + studentName + "의 " +
					subjects[i].getSubjectName() + " 점수는 " + subjects[i].getscorePoint() + "점 입니다."	);
			}
		}
		average = (double)total / count; // 평균 = 총점 / 개수
		System.out.printf("과목의 총점은 %d점이고, 평균은 %.1f입니다.\n", total, average);
	}
	
}	


