package objectequals.member;

public class Member {
	//필드 생성
	private String memberId;	//사번
	private String name;		//이름
	
	//매개변수 있는 생성자
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	//hashCode() 재정의
	@Override
	public int hashCode() { //멤버이름.hashCode()를 반환함
		return memberId.hashCode();
	}
	
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;	//Member형으로 다운 캐스팅
			if(this.memberId.equals(memberId) &&
					this.name.equals(member.name)) {
				return true;	//외부 입력된 회원아이디와 이미 생성된 회원아이디가 일치하면 true
			}
		}
		return false;
	}
	//객체의 문자열 정보 - toString() 재정의
	@Override
	public String toString() {
		return memberId + ", " + name;
	}
	
	
	
	
	
}
