package collection.list;

//VO(Value Object) - 자료형
public class Board { //게시판
	//필드
	private String title; 	//제목
	private String content;	//글 내용
	private String writer;	//작성자
	
	//매개변수 있는 생성자
	public Board(String title, String content,String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//getter, setter 메서드 선언
	//set은 이미 상단에서 생성하여 굳이 필요없긴함
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return writer;
	}
	
	
}
