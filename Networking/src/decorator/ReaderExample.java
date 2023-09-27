package decorator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("message.txt");
			
			/*while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}*/
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
