package bufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {

	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try {
			BufferedReader br = new BufferedReader
					(new FileReader("word.txt"));
			//전체 데이터 읽기
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
