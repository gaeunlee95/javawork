package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		//module 삭제 후 sql.Connection 클래스 import
		Connection conn = null;
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
			//연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", //JDBC 드라이버 thin 타입
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
