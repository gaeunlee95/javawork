package bufferedStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {
		try (Writer writer = new FileWriter("word.txt")){
				String msg = "ant bear chicken cow eagle elephant "
						+ "horse monkey penguin tiger";
				writer.write(msg);
				
				writer.flush();
			}catch(IOException e) {
				e.printStackTrace();
		}
			
	}
	
}


