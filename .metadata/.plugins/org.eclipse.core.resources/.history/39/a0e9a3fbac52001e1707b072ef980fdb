package arraycopy;

//얕은 복사 - 원본을 수정하면 사본도 수정됨
public class ShallowCopy {

	public static void main(String[] args) {
		//값이 3개인 배열 array1, array2 생성
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//array1에 값 저장
		array1[0] = new Book("미생1", "윤태호");
		array1[1] = new Book("미생1", "윤태호");
		array1[2] = new Book("미생1", "윤태호");
		
		//array1의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		//array1 출력
		System.out.println("*** array1 출력 ***");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
	
		//배열 일반복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		
		//array2 출력
		System.out.println("*** array2 출력 ***");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		//clone() 배열 복사
		Book[] array3 = array2.clone();
		
		//array3 출력
		System.out.println("*** array3 출력 ***");
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		
		//향상 for문
		//for(자료형 변수 : 배열이름){변수 출력}
		System.out.println("*** array3 출력(항상 for문) ***");
		for(Book arr3 : array3 ) {
			System.out.println(arr3.toString());
		}
		
	}

}
