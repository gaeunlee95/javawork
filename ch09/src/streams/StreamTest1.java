package streams;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		//ArrayList에 객체 생성해서 저장함
		List<String> list = Arrays.asList("LG", "Samsung", "현대");
		/*List<String> list = new ArrayList<>();
		list.add("LG");
		list.add("Samsung");
		list.add("현대");*/
		
		//comStream은 생성후 한번만 사용되고, 다시 사용하려면 재생성을 해야함
		Stream<String> comStream = list.stream(); //list의 모든 객체를 가져옴
		comStream.forEach(com -> System.out.println(com)); //람다식으로 출력

		//for(), forEach() - 객체를 각각 출력
	}

}

