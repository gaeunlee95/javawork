package datainputoutput;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) {
		
		try {
			// 입력 스트림 객체 생성
			InputStream is = new FileInputStream("C:/File/test2.db");
			
			byte[] data = new byte[1024]; //데이터를 읽을 배열 생성
			
			while(true) {
				int num = is.read(data); //배열을 읽은 바이트 수
				//System.out.println(num); //5 
				
				
				if(num == -1) break; //데이터가 없으면
				for(int i=0; i<num; i++) {
					System.out.print(data[i] + " ");
				}
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
