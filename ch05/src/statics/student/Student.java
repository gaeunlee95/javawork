package statics.student;

public class Student {
	//int serialNum = 1000;
	static int serialNum = 1000; //클래스 변수 - 클래스로 접근
	int id; 					 //인스턴스 변수(필드) - new 사용
	String name; 				 //인스턴스 변수(필드)
	
	//생성자가 생성될 때마다 학번 증가 /ckck
	/*public Student() {
		serialNum++;
		id = serialNum;
	}*/
	
	//입력
	public void setId(int id) {
		this.id = id;
	}
	//출력
	public int getId() {
		return id;
	}
}
