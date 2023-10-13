package banking.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//db 연결 및 종료 담당 클래스
public class JDBCUtil {
	//필드
	static String driverClass = "oracle.jdbc.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521/xe";
	static String user = "c##mydb";
	static String password = "pwmydb";
	
	//db 연결 메서드
	public static Connection getConnection(){
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
