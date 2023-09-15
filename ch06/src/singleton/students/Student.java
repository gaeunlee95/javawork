package singleton.students;

public class Student {
	//private 필드
	//기준 번호 - 100
	//학번
	private static int serialNum = 100;
	private int studentNum;
	
	//생성자(넘버++)
	public Student() {
		serialNum++;
		studentNum = serialNum;
	}
	
	//학번 출력 메서드
	public int getStudentNum() {
		return studentNum;
	}
	
}
