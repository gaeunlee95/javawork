package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest2 {

	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try(BufferedReader br = new BufferedReader(
				new FileReader("src/decorator/ReadLineTest2.java"))){
			
			int lineNo = 1;  //행 변수
			while(true) {
				String data = br.readLine();  //1행씩 읽음
				if(data == null) break;
				System.out.println(lineNo + " " + data);
				lineNo++;  //행 수 1증가
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
