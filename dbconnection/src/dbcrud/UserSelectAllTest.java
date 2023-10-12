package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

	public static void main(String[] args) {
		//module 삭제 후 sql.Connection 클래스 import
		Connection conn = null; //네트워크 연결 클래스
		PreparedStatement pstmt = null; //sql 처리 인터페이스
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
			//연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", //JDBC 드라이버 thin 타입
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			//db 처리 작업
			//매개변수화된 sql문 작성 - 동적 바인딩
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			//sql 실행 - 검색(executeQuery())
			//db 칼럼 소문자
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			while(rs.next()) { // ==true //검색한 데이터가 있으면(찾앗으면) //반복하여 자료전체를 가져와야하니
				//db에서 userid(칼럼은 소문자)를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassWord(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				//리스트에 user 객체 저장
				userList.add(user);
			}
			/*for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				//System.out.println(user); //toString() 사용하여 출력
				System.out.println("userId: " + user.getUserId());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userAge: " + user.getUserAge());
				System.out.println("userPassword: " + user.getUserPassWord());
				System.out.println("userEmail: " + user.getUserEmail());
				System.out.println("============================================");
			}*/
			
			for(User user : userList) {
				System.out.println("userId: " + user.getUserId());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userAge: " + user.getUserAge());
				System.out.println("userPassword: " + user.getUserPassWord());
				System.out.println("userEmail: " + user.getUserEmail());
				System.out.println("============================================");
			}
			
			//stack 구조이니 실행된 반대순서로 close 해줌 (rs > pstmt > conn)
			rs.close();
			pstmt.close();
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
		
	}

}
