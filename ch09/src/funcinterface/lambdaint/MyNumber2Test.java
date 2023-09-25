package funcinterface.lambdaint;

public class MyNumber2Test {

	public static void main(String[] args) {
		
		MyNumber2 myNum;
		
		//getMax() 구현 - 람다식 사용
		/*myNum = (x, y) -> {
			return (x >= y) ? x : y;
		};*/
		//return 생략 가능함
		myNum = (x, y) -> (x >= y) ? x : y;
		
		//getMax() 호출
		System.out.println("더 큰 수는 " + myNum.getMax(12, 5));
		
	}

}
