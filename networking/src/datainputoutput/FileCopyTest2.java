package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		//close() 사용하지 않는 방법 : try ~ with ~ resource문
		//바이트 단위로 읽어서 쓰기(복사) - 이미지
		String originFile = "C:/File/panda-1.jpg";//원본 파일
		String copyFile = "C:/File/panda-2.jpg";  //사본 파일
		
		try(InputStream is = new FileInputStream(originFile); 
			OutputStream os = new FileOutputStream(copyFile)) {
			
			while(true) {
				int num = is.read();  //읽은 데이터
				if(num == -1) break;
				os.write(num); //파일에 쓰기
			}
			os.flush();  //버퍼 비우기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
