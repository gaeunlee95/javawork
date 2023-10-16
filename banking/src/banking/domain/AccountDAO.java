package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	Connection conn;  //db 연결 객체 선언
	PreparedStatement pstmt;  //sql 처리 객체 선언
	ResultSet rs;
	Scanner scanner = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌 번호(형식-숫자만:00-00-000): ");
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			//계좌번호 형식 검증
			String regExp = "\\d{2}-\\d{2}-\\d{3}"; //형식 
			boolean result = Pattern.matches(regExp, ano);
			
			if(result == false) {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
				break;
			}
			if(result)	
			//중복 계좌가 있는지 체킹
			if(findAccount(ano) != null) { //중복 계좌가 있으면
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				while(true) {
					System.out.print("계좌주: "); //계좌주 정보 삽입
					String owner = scanner.nextLine();
					
					//계좌번호 형식 검증
					regExp = "[a-zA-Z가-힣]+";   //형식 //'+' 없을 시 한글자만 사용가능 
					result = Pattern.matches(regExp, owner);
					
					if(result) {
						System.out.print("초기 입금액: "); //잔고 삽입
						int balance = Integer.parseInt(scanner.nextLine());
						
						//db 작업
						try {
							conn = JDBCUtil.getConnection();
							String sql = "INSERT INTO account(ano ,owner ,balance) "
											+ "VALUES (? ,? ,? ) ";
							pstmt = conn.prepareStatement(sql);
							//값
							pstmt.setString(1, ano);
							pstmt.setString(2, owner);
							pstmt.setInt(3, balance);
							//sql 실행
							pstmt.executeUpdate();
							System.out.println("계좌가 생성되었습니다.");
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
						break;
					}else {
					System.out.println("계좌주는 한글과 영문이 가능하니다. 다시 입력해 주세요");
					}
				}
				break;
			}
		}
	}//createAccount 끝
	
	public void getAccountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------------");
		//계좌를 저장할 어레이리스트 생성
		List<Account> accountList = new ArrayList<>();
		//db 작업
		
		try {
			conn = JDBCUtil.getConnection();  //db 연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			//검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { //다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano"); //db에서 가져온 ano 칼럼
				String owner = rs.getString("owner"); 
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account); //계좌를 리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		
		//계좌 목록 조회
		for(int i=0;i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.print("잔고: " + account.getBalance() + "\n");
		}
	}//getAccountList 끝

	public void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------------");
		
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //입력한 계좌번호(ano)가 있으면 실행
				Account account = findAccount(ano);
				
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				int balance = account.getBalance() + money;
				
				//db 처리
				try {
					//db 처리작업
					conn = JDBCUtil.getConnection(); //db연결
					String sql = "UPDATE account SET balance = ? "
							+ "WHERE ano = ? ";
					pstmt = conn.prepareStatement(sql);
					
					//값 지정
					pstmt.setInt(1, balance);
					pstmt.setString(2, ano);
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("결과: 정상 처리되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else{
				System.out.println("결과: 계좌가 없습니다.");
			}
		}
	}//deposit 끝
	
	public void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------------");
		
		
			while(true) {
				System.out.print("계좌 번호: ");
				String ano = scanner.nextLine();
				
				if(findAccount(ano) != null) {
					while(true) {
						Account account = findAccount(ano);
						
						System.out.print("출금액: ");
						int money = Integer.parseInt(scanner.nextLine());
						
						if(money > account.getBalance()) { //출금액이 잔고보다 많으면
							System.out.println("결과: 잔액이 부족합니다. 다시 입력해 주세요.");
						}else {
						int balance = account.getBalance() - money; //잔고-출금액
						//db 처리
							try {
								//db 처리작업
								conn = JDBCUtil.getConnection(); //db 연결
								String sql = "UPDATE account SET balance = ? "
										+ "WHERE ano = ? ";
								pstmt = conn.prepareStatement(sql);
								
								//값 지정
								pstmt.setInt(1, balance);
								pstmt.setString(2, ano);
								//sql 실행
								pstmt.executeUpdate();
								System.out.println("결과: 정상 처리되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							break;
						}//else 끝
					}//while 끝
					break;
				}else {
					System.out.println("결과: 계좌가 없습니다.");
				}
			}
	}//withdraw 끝
	
	public void removeAccount() {
		System.out.println("----------------------------------------");
		System.out.println("삭제");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				try {
					//db 처리작업
					conn = JDBCUtil.getConnection(); //db 연결
					String sql = "DELETE FROM account "
							+ "WHERE ano = ? ";
					pstmt = conn.prepareStatement(sql);
					
					//값 지정
					pstmt.setString(1, ano);
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("결과: 정상 처리되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}// while 끝
		
	}
	
	public void selectAccount() {
		//계좌 번호와 일치하는 계좌의 정보 출력
		System.out.println("----------------------------------------");
		System.out.println("계좌 검색");
		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.println("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				try {
					//db 처리작업
					conn = JDBCUtil.getConnection(); //db 연결
					String sql = "SELECT * FROM account "
							+ "WHERE ano = ? ";
					pstmt = conn.prepareStatement(sql);
					
					//값 지정
					pstmt.setString(1, ano);
					//sql 실행
					rs = pstmt.executeQuery();
					if(rs.next()) {
						ano = rs.getString("ano");
						String owner = rs.getString("owner"); 
						int balance = rs.getInt("balance");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				
				System.out.print("계좌번호: " + ano + "\t");
				System.out.print("계좌주: " + owner + "\t");
				System.out.print("잔고: " + balance + "\n");
				
				break;
			}else {
				System.out.println("없는 계좌번호 입니다.");
			}
		}
		
	}
	
	//계좌 검색
	public Account findAccount(String ano) {
		Account account = null;
		//db 처리
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner"); 
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
	
}
