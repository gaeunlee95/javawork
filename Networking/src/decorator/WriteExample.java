package decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//파일에 문장열 쓰기 - Writer -> FileWriter
		try (Writer writer = new FileWriter("message.txt")){
			
			//문자열 쓰기
			String msg = "오늘도 좋은 하루!!\n행운을 빌어요\n감사합니다.\n좋아요";
			writer.write(msg);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

