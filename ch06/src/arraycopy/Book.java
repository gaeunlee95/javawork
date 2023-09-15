package arraycopy;

public class Book {
	//private인 필드 bookName, author 선언
	private String bookName;
	private String author;
	
	//기본 생성자 /DeepCopy
	public Book() {}
	
	//매개변수가 있는 생성자 /ShallowCopy
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	//set(), get() 메서드 생성
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	//toString() 재정의
	//객체의 문자열 정보 재정의 /bookName, author 출력
	@Override
	public String toString() {
		return bookName + ", " + author;
	}
	
}
