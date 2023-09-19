package reference.subjects;

public class StudentName {

	public static void main(String[] args) {
		/*Student std1 = new Student(101, "홍길동");
		Student std2 = new Student(102, "이가은");
		
		//과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 80);
		
		std2.koreanSubject("국어", 90);
		std2.mathSubject("수학", 90);
		
		//학생 정조 출력
		std1.showStudentInfo();
		std2.showStudentInfo();*/
		
		//객체 생성
		Student[] students = {
			new Student(101, "홍길동"),
			new Student(102, "이가은"),
			new Student(103, "임상옥")
		};
		
		
		//점수 저장
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 80);
		
		students[1].koreanSubject("국어", 90);
		students[1].mathSubject("수학", 90);
		
		students[2].koreanSubject("국어", 80);
		students[2].mathSubject("수학", 80);
		
		//전체 출력
		for(int i=0; i<students.length; i++) {
			students[i].showStudentInfo();
			System.out.println();
		}
		
		//항상된 for문
		//for(자료형 변수 : 배열){}
		for(Student std : students) {
			std.showStudentInfo();
		}
		
	}

}
