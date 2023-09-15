package arraycopy;

//깊은 복사 - 원본을 수정해도 사본 변경 없음
public class DeepCopy {

	public static void main(String[] args) {
		//값이 3개인 배열 array1, array2 생성
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//array1에 값 저장
		array1[0] = new Book("미생1", "윤태호");
		array1[1] = new Book("미생1", "윤태호");
		array1[2] = new Book("미생1", "윤태호");
		
		//기본 생성자로 array2의 객체 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//array1을 array2에 복사 (setter, getter 사용)
		for(int i=0; i<array1.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		//array1의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		//array1 출력
		System.out.println("*** array1 출력 ***");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		//array2 출력
		System.out.println("*** array2 출력 ***");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		
		
	}

}
