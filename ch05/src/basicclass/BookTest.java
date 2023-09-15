package basicclass;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book(100, "개미");

		System.out.println(book1); //메모리 주소 -> 100, 개미
		System.out.println(book1.toString()); //메모리 주소 -> 100, 개미
		
		//String msg = "개미";
		String msg = new String("개미");
		System.out.println(msg);  //개미
	}

}
