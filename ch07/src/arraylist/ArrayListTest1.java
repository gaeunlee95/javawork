package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String[] carts = {"사과", "콩나물", "커피", "우유"};
		
		//문자형 ArrayList carts 생성
		//리스트 공간이 10개 생성됨 //ArrayList<자료형> 객체 = new ArrayList<>();
		//리스트는 순서가 있음(인덱싱) , 중복 허용
		ArrayList<String> carts = new ArrayList<>();
		
		//자료 추가 - add()
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");
		carts.add("커피");
		
		//자료 출력 - get()
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		
		//리스트의 크기
		System.out.println("리스트의 크기: " + carts.size());
		
		//자료 수정 - set(인덱스, 수정할 객체)
		carts.set(2, "바나나");
		
		//자료 삭제 - remove()
		//carts.remove(1); //인덱스로 삭제
		carts.remove("콩나물"); //객체 이름을 넣어 삭제
		
		//리스트의 크기
		System.out.println("리스트의 크기: " + carts.size());
		
		//전체 조회(출력)
//		for(int i=0; i<carts.size(); i++) { //리스트를 처음부터 반복하면서
//			String cart = carts.get(i);	//저장된 자료(객체)를 가져와서 cart에 저장
//			System.out.print(cart + " ");
//		}
		
		for(int i=0; i<carts.size(); i++) {
			System.out.print(carts.get(i) + " ");
		}
		
		System.out.println();
		
		//향상된 for문 - for(자료형 변수 : 리스트이름){}
		for(String cart : carts)
			System.out.print(cart + " ");
		
	}

}
