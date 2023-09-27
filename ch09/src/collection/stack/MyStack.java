package collection.stack;

import java.util.ArrayList;

//DAO - 데이터 관리
public class MyStack {

	private ArrayList<String> arrayList;
	
	//생성자
	public MyStack() {
		arrayList = new ArrayList<>();
	}
	
	//자료 추가(저장)
	public void push(String data) {
		arrayList.add(data);
	}
	
	//자료 삭제(꺼내기)
	public String pop() {
		int size = arrayList.size();
		if(size == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayList.remove(size - 1);  //배열의 인덱스 이므로 1이 작다.
	}
	
}
