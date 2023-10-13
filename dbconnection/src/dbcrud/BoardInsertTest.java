package dbcrud;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardInsertTest {

	public static void main(String[] args) {
		//module 삭제 후 sql.Connection 클래스 import
		Connection conn = null; //네트워크 연결 클래스
		PreparedStatement pstmt = null; //sql 처리 인터페이스
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // == lib > ojdbc11.jar
		
			//연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", //JDBC 드라이버 thin 타입
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			//db 처리 작업
			//매개변수화된 sql문 작성 - 동적 바인딩
			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES (seq_bno.NEXTVAL,? ,? ,? , SYSDATE,? ,?)"; //인덱스 1~5
						//다른 언어와 활용하기위해 문자열의 경우 홑따옴표(') 사용
			pstmt = conn.prepareStatement(sql);
			//? 값 지정
			pstmt.setString(1, "notebook3");
			pstmt.setString(2, "LG 그램 노트북3");
			pstmt.setString(3, "cloud");
			//사진 첨부한 경우
			pstmt.setString(4, "phone.jpg"); //package에 사진 파일 넣기
			pstmt.setBlob(5, new FileInputStream("src/dbcrud/phone.jpg"));
			//사진 미첨부인 경우
			//pstmt.setString(4, null);
			//Blob blob = null;
			//pstmt.setBlob(5, blob);
			
			//sql 실행 - executeUpdate()
			int rows = pstmt.executeUpdate(); //insert, update, delete 할때 사용
			System.out.println("저장된 행의 수: " + rows);
			//auto commit이 됨
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //반드시 수행되는 구간
			if(conn != null) { //연결이 되어 있다면
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//if 끝
		}//finally 끝
				
	}//main 끝

}
