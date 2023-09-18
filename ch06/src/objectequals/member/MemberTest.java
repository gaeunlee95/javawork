package objectequals.member;

public class MemberTest {

	public static void main(String[] args) {
		//객체 생성
		//객체 member1, member2
		Member member1 = new Member("m1001", "우영우");
		Member member2 = new Member("m1001", "우영우");
		
		//논리적으로 동등객체를 확인할 hashCode() 재정의
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());

		//문자열 일치하도록 equals() 재정의
		System.out.println(member1.equals(member2));
		
		//객체 정보 출력 - toString() 재정의
		System.out.println(member1);
		System.out.println(member2);
	
	}	

}
