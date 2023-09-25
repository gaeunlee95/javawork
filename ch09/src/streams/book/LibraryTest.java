package streams.book;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//모든 책의 가격의 합
		//Stream<Book> stream = bookList.stream();
		int total = bookList.stream()
							.mapToInt(c -> c.getPrice())
							.sum();
		System.out.println("total: " + total);
		
		//책의 가격이 20,000원 이상인 책의 이름
		bookList.stream()
				.filter(c -> c.getPrice() >= 20000)
				.map(c -> c.getName())
				.sorted()
				//.map(c -> c.getName()) //에러
				.forEach(s -> System.out.println(s));
	}

}
