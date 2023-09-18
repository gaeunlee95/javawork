package array2d;

public class Array2dTest1 {

	public static void main(String[] args) {
		//정수형 2차원 배열 선언
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length); //행의 크기 /2
		System.out.println(arr[0].length); //1열의 크기 /3
		System.out.println(arr[1].length); //2열의 크기 /3
		
		//전체 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //줄바꿈
		}
		
		//arr1 배열에 값을 저장
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//arr2 배열에 값(요소)을 저장
		//선언과 함께 초기화
		int[][] arr2 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8}
		};
		
		//특정한 요소를 인덱싱
		System.out.println(arr[1][1]);
		
		//arr1전체 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //줄바꿈
		}
		
		//arr2 전체 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //줄바꿈
		}
		
	}

}
