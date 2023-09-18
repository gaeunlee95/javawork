package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		
		//char 변수 c 에 문자열 A 값 삽입 및 출력(문자형, 정수형)
		/*char c = 'A';
		System.out.println(c); //A
		System.out.println((int)c); //65
		
		//char 변수 c2에 정수 66 삽입 및 출력(문자열) 
		char c2 = 66;
		System.out.println(c2);*/ //B
		
		
		//for문을 이용하여 대문자 A~Z 출력
		System.out.println("== 일반 for문을 사용 알파벳 출력 ==");
		char c;
		for(c=65; c<=90; c++) { //65 코드값 
			System.out.print(c + " ");
		}
		//변수의 마지막 값 출력 (변수의 마지막 값: )
		System.out.println("\n변수의 마지막 값: " + (char)(c-1)); //Z
		
		//대문자 알파벳(26개)을 배열에 저장하고 출력
		System.out.println("== 알파벳을 배열에 저장하고 출력 ==");
		char [] alphabets = new char[26];
		char ch = 'A';
		alphabets[0] = ch;
		//System.out.println(alphabets[0]); //A
		//alphabets[1] = (char)(ch + 1); //자바 덧셈 연산하면 int형으로 바뀜 -> 다시 형변환
		//ch++; //ch = ch + 1 - 1증가(후증가)
		//alphabets[1] = ch; //자바 덧셈 연산하면 int형으로 바뀜 -> 다시 형변환
		
		//System.out.println(alphabets[1]); //B
		
		//알파벳을 배열에 저장 - 1증가
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}
	
	}

}
