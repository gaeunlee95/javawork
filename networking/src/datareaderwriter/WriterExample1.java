package datareaderwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample1 {

	public static void main(String[] args) {
		
		try (Writer writer = new FileWriter("C:/File/test.txt");){
		
			//1. 한 문자 쓰기
			char a = 'A';
			char b = 'B';
			
			//2. 배열 쓰기
			char[] arr = {'C', 'D', 'E'};
			
			//3. 문자열 쓰기
			String str = "안녕하세요.";
			
			writer.write(a);
			writer.write(b);
			writer.write(arr);
			writer.write(str);
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
