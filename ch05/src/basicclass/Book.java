package basicclass;

public class Book{
	//필드
	int bookNumber; 	//책 번호
	String bookTitle;	//책 제목
	
	//생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	//메서드 재정의
	//String 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	//equal() 재정의
//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

}
