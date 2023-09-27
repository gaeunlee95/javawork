package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class GetBytesTest2 {

	public static void main(String[] args) {
		//바이트 기반에서 문자열 읽기
		try (InputStream is = new FileInputStream("C:/File/out.txt");) {
			byte[] data = new byte[1024]; //받은 데이터를 저장할 배열 생성, 1KB
			int readBytes = is.read(data); //읽은 바이트수
			//읽은 바이트를 문자열로 생성
			String str = new String(data, 0, readBytes, "utf-8");
			System.out.println(str);
			
			//is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
