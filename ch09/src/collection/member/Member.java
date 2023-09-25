package collection.member;

//VO(Value Object) - 자료형으로 사용
public class Member {
	//접근제어자 private인 변수(회원 아이디,이름) 선언
	private int memberId;	//회원 아이디
	private String memberName;	//회원 이름
	
	//매개변수가 있는 생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName; 
	}
	
	//메서드(getter/setter)
	//private 변수이니 호출을 위한 get()메서드 선언
	//상단에서 이미 set을 하여서 굳이 setter 메서드 생성할 필요없음
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	} 
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	
	
	@Override
	public String toString() {
		return memberId + ": " + memberName;
	}

}
