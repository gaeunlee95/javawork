package exceptions.resource;

public class MyResourceTest3 {

	public static void main(String[] args) throws Exception {	//throw Exception 오류 해결x, 잠시 던져둔것
		//try~with~resource문
		//close() 사용하지 않음
		try(MyResource res1 = new MyResource("res1");) { //괄호 안에 MyResource 객체 생성 //with문

			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));		//오류 발생(123'a')
		}catch(Exception e) {
			e.printStackTrace();
		}//finally {	// finally, close 사용x
			//res1.close();
	}
	
}


