package collection.set;

public class Student {
	//필드(변수 선언)
	String name;
	int age;
	
	//매개변수 있는 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age =age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;	//강제 형변환
			if(name.equals(student.name))
				return true;
		}
		return false;	
	}
	
	
	
	
}
