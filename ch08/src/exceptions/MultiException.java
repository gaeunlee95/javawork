package exceptions;

public class MultiException {

	public static void main(String[] args) {
		//문자열을 숫자로 변환 - NumberFormatException
		//인덱스 범위 에러
		String[] array = {"100", "123a"};	//array[0], array[1]
		
		for(int i=0; i< array.length; i++) {
			try {
			System.out.println(array[i]);
			int value = Integer.parseInt(array[i]);
			System.out.println(value);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과했습니다.");
		}
		}
		
	}

}
