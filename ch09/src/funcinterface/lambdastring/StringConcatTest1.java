package funcinterface.lambdastring;

public class StringConcatTest1 {

	public static void main(String[] args) {
		
		StringConcatImpl concat = new StringConcatImpl();
		String str1 = "kh";
		String str2 = "정보통신";
		concat.makeString(str1, str2);
	}

}
