package objectarray.books;

//Book 자료형 정의
public class Book {
	private String bookName;
	private String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
		
	//책의 정보 출력
	public String showBookInfo() {
		return bookName + ", " + author;
	}
	
}
