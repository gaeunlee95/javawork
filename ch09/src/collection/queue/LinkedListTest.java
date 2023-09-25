package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		//자료 추가
		myList.add("A");	//0번
		myList.add("B");	//1번
		myList.add("C");	//2번
		
		//객체 출력
		System.out.println(myList);
		
		//특정 위치에 자료 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		//전체 요소 출력
		for(String list : myList) {
			System.out.print(list + " ");
		}
		
	}

}
