package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "양만춘"));
		memberMap.addMember(new Member(1003, "을지문덕"));
		//키는 중복 불허, 값은 변경됨
		memberMap.addMember(new Member(1003, "우영우")); //키 1003의 value 변경
		
		System.out.println("총 객체 수: " + memberMap.getSize());
		
		//회원 삭제
		memberMap.removeMember(1003);
		memberMap.removeMember(1004);
		
		System.out.println("총 객체 수: " + memberMap.getSize());
		
		//회원 목록
		memberMap.showAllMember();
		
	}

}
