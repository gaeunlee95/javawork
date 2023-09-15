package methods;

public class OneUpTest1 {
	
	//class 첫글자 대문자 / 함수 첫글자 소문자
	
	//1증가 하는 함수 정의
	//지역변수의 생명주기(scope) - 함수나 제어문의 블럭안에서 생성되고, 호출된 뒤(블럭을 벗어나면)에 소멸함
	public static int oneUP() {
		int x = 1; //지역(local) 변수
		x++; // x += 1
		return x;
	}

	public static void main(String[] args) {
		System.out.println(oneUP()); //2
		System.out.println(oneUP()); //2
		
		//System.out.println(x); //oneUp()의 x는 소멸한 변수임
	}

}
