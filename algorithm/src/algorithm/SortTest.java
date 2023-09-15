package algorithm;

public class SortTest {

	public static void main(String[] args) {
		// 오름 차순 정렬 - 버블 정렬(거품)
		// 자리 바꾸기(위치) a, b, temp
		//2, 3, 4, 5, 6, 9
		int[] arr = {3, 6, 9, 2, 5, 4};
		int temp; //임시 변수
		
		//중첩 for
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) { //자리 바꿈
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//arr 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		/*
		 * 1행 3>3 F, 3>6 F, 3>9 F, 3>2 T, 2>5 F, 2>4 F arr[0]=2, arr[5]=3
		 * 2행 2>2 F, 2>6 F, 2>9 F, 2>3 F, 2>5 F, 2>4 F arr[1]=6
		 * ...
		 */
	}
	
}
