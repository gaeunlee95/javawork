package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 인터페이스를 구현한 HashSet 클래스의 객체 생성
		// 순서가 없고, 중복 데이터를 저장할 수 없음
		Set<String> set = new HashSet<>();
		
		//객체 생성
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java"); //중복이므로 저장 안됨
		
		//객체의 수
		System.out.println("총 객체수: " + set.size());
		
		//특정 객체 출력 //좋은 문장은 아님;;
		if(set.contains("Java")) {
			System.out.println("Java");
		}
		
		//객체 삭제
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		System.out.println("총 객체수: " + set.size());
		
		
		//전체 목록 조회
		//순서가 없어서 인덱싱을 할 수 없음
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {	//객체 수만큼 반복하면서
			String element = iterator.next();	//다음 객체가 있으면 가져옴
			System.out.println(element);
		}
		
		System.out.println("================================");
		
		//전체 조회2
		for(String element : set)
			System.out.println(element);
		
		//리시
		System.out.println(set);
		
	}

}
