package collection.member;

import java.util.ArrayList;

//자료 관리 클래스(생성, 조회) - DAO(Data Access Object)
public class MemberArrayList {
	//필드 - 자료 구조 명시
	//private 접근제어자인 ArrayList 클래스의 변수 arrayList에 Member클래스형 자료가 들어감을 명시
	private ArrayList<Member> arrayList;
	
	//생성자
	//MemberArrayList 생성 시, ArrayList 클래스의 arrayList 변수 생성
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가
	//회원 추가(addMember())메서드 선언
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 조회
	//Member 클래스의 변수 member에 arrayList의 i번 인덱스의 값 삽입 및 출력
	//값 출력을 위해서 Member 클래스 내의 toString() 메서드 재정의 필요
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원의 전체 인원
	//인덱스 값 확인하는 getSize()메서드 선언 
	//변수 arrayList상에 값이 저장되어 있으니 즉,arrayList의 총 인덱스를 확인해야함
	public int getSize() {
		return arrayList.size();
	}

	//회원 삭제
	//매개로 전달된 회원아이디를 비교해서 있으면 삭제
	//외부에서 가져온 값(memberId)와 arrayList 내부의 값의 memberId의 값이 동일하면 삭제
	//동일하지 않으면 값이 존재하지않음을 출력
	public boolean removeMember(int memberId) { //boolean으로 하지않고 void로 만들어도 됨
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId(); //이미 등록된 회원번호
			if(dbId == memberId) {	//외부 아이디와 비교해서 일치하면
				arrayList.remove(i); //member 객체를 삭제함
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	
}
