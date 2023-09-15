package singleton.students;

public class School {
	
	//private static ...
	private static School instance;
	
	//private 기본 생성자
	private School () {}
	
	//getInstance 메서드 생성 (instance가 null일 경우 new School() 생성)
	//School - static으로 생성
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//학생 생성 메서드
	//Student - new로 생성
	public Student createStudent() {
		Student student = new Student();
		return student;
	}
	
	
}
