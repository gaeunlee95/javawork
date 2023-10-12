package domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

public class Board implements Serializable {
	
	private static final long serialVersionUID = 1112L;
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfileName;
	private Blob bfileData;
	
	
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
	
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	public String getBfileName() {
		return bfileName;
	}
	public void setBfileName(String bfileName) {
		this.bfileName = bfileName;
	}
	
	public Blob getBfileData() {
		return bfileData;
	}
	public void setBfileData(Blob bfileData) {
		this.bfileData = bfileData;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bdate=" + bdate + ", bfileName=" + bfileName + ", bfileData=" + bfileData + "]";
	}
	
	
	
	

}
