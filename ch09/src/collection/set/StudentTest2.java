package collection.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		
		//학생 인스턴스 생성
		Student std1 = new Student("이순신", 101);
		Student std2 = new Student("강감찬", 102);
		Student std3 = new Student("홍길동", 103);
		Student std4 = new Student("강감찬", 102);
		
		//객체 추가
		map.put("이순신", std1);
		map.put("강감찬", std2);
		map.put("홍길동", std3);
		map.put("강감찬", std4);
		
		//map 객체 출력
		System.out.println(map); //key, 객체안의 값 출력
		
	}

}
