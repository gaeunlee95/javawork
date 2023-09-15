package thissamples;

public class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	//this를 리턴하는 메서드 정의
	public void printThis() {
		System.out.println(this);
	}
}
