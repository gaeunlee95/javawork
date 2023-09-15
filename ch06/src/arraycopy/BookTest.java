package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		//객체를 저장할 크기가 3인 배열 books 생성
		Book[] books = new Book[3];
		
		//객체 3권 생성
		Book book1 = new Book("개미", "베르나르 베르베르");
		Book book2 = new Book("태백산맥", "조정례");
		Book book3 = new Book("미생", "조태호");
		
		//인덱스 순서에 따라 배열에 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		//1개 출력
		System.out.println(books[2]);
		
		//전체 출력
		for(int i=0; i<books.length; i++) {
			//System.out.println(books[i]);
			System.out.println(books[i].toString());
		}
		
	}

}
