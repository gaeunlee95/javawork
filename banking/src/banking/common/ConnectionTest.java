package banking.common;

import java.sql.Connection;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnection();
		System.out.println("연결 성공: " + conn);
		
	}

}
