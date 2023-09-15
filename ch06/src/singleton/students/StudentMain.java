package singleton.students;

public class StudentMain {

	public static void main(String[] args) {
		//School 
		School school = School.getInstance();
		School school2 = School.getInstance();
		
		//학생 객체 생성
		Student lee = school.createStudent();
		Student park = school.createStudent();
		
		
		//학번 출력
		System.out.println("학번: " + lee.getStudentNum());
		System.out.println("학번: " + park.getStudentNum());
				
		//학교 객체의 주소 (같음, static 이니까)
		System.out.println("*** 학교 객체 주소 ***");
		System.out.println(school);
		System.out.println(school2);
		
		//학생 객체의 주소 (다름)
		System.out.println("*** 학생 객체 주소 ***");
		System.out.println(lee);
		System.out.println(park);
		
	}

}
