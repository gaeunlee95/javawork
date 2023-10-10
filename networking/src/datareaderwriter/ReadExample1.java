package datareaderwriter;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) {
		//try(객체 생성) ~ catch 
		try (Reader reader = new FileReader("C:/File/test.txt");){
			while(true) {
				int data = reader.read();
				//System.out.println(data);
				if(data == -1) break;
				System.out.print((char)data + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
