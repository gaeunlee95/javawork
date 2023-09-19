package interfaceex.sorting;

public interface Sort {
	//정수형 배열을 인수로 받아서 오름차순으로 정렬
	public void ascending(int[] arr);
	//정수형 배열을 인수로 받아서 내림차순으로 정령
	public void descending(int[] arr);
	
	//알고리즘에 대한 설명 정의
	//일반 메서드
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}

	
}
