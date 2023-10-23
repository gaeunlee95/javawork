package board;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable{
	private static final long serialVersionUID = 1000L;
	
	//필드
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Timestamp bdate; //java.sql
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	
	
	
	
}
