package arraytest;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		//1번 인덱스에 값을 수정
		arr2[1] = 5;
		//3번 인덱스에 값을 저장
		arr2[3] = 4;
		//arr2[5] = 6;	//arr2 배열에 인덱스 5번이 존재하지 않아 오류 발생
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
