package array2d;

public class Array2dApt {

	public static void main(String[] args) {
		// 아파트 세대 구현하기
		// 5층(행), 한층당 - 3세대(열) 
		// 3층 - 1세대
		int[][] household = new int[5][3]; //5층 3세대로 배열 household 선언
		household[2] = new int [1]; //3층 1세대로 재선언
		
		//출력 ("..층 ..세대")
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length);
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);
		
//		for(int i=0; i< household)
		
	}

}
