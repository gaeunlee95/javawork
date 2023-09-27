package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamsTest {

	public static void main(String[] args) {
		//정수, 실수, 문자열 쓰기
		try { 
			//기반 스트림 객체 생성(상대 경로)
			OutputStream os = new FileOutputStream("./data.db"); //상대 경로
			//보조 스트림 객체 생성
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본 타입 자료 쓰기
			dos.writeInt(1);     //정수형 자료
			dos.writeUTF("우영우");  //문자열 자료
			dos.writeDouble(95.2); //실수형 자료
			
			dos.writeInt(2);     //정수형 자료
			dos.writeUTF("장그래");  //문자열 자료
			dos.writeDouble(88.5); //실수형 자료
			
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		//바이트 데이터 읽기
		try(InputStream is = new FileInputStream("./data.db");
			DataInputStream dis = new DataInputStream(is)){
				
			//기본 타입 자료 읽기
			//파일에 쓴 순서대로 읽어야 함
			for(int i=0; i<2; i++) { //데이터 수만큼 반복
				int num = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(num + " / " + name + " / " + score);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
