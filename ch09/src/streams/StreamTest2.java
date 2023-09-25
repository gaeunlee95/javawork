package streams;

import java.util.Arrays;
//import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// 문자형 배열
		String[] 과일 = {"사과", "배", "수박", "참외"};
		
		//for문을 사용하지 않고, forEach()문 사용 -> stream 객체를 얻어야 함
		//Stream<String> strStream = Arrays.stream(과일);
		//strStream.forEach(str -> System.out.println(str));
		Arrays.stream(과일).forEach(str -> System.out.print(str));
		
		// 정수형 배열
		int[] number = {1, 2, 3, 4};
		//Stream<Integer> numStream = Arrays.stream(number);
		//numStream.forEach((n) -> {System.out.println(n);});
		Arrays.stream(number).forEach((n) -> {System.out.println(n);});
		
		//합계, 개수, 평균 구하기
		int sumVal = Arrays.stream(number).sum();
		//count()의 반환형이 long이므로 int로 다운 캐스팅
		int count = (int)Arrays.stream(number).count();
		double avg = (double)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.println("평균: " + avg);
	
	}

}
