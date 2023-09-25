package exceptions.resource;

public class MyResourceTest2 {

	public static void main(String[] args) throws Exception {	//throw Exception 오류 해결x, 잠시 던져둔것
		MyResource res1 = null;
		try {
			res1 = new MyResource("res1");

			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));		//오류 발생(123'a')
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	//리소스 닫는 코드는 여기에 작성함
			res1.close();
		}
		
	}

}
