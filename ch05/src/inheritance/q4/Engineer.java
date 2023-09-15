package inheritance.q4;
//자식 클래스
public class Engineer extends Employee {
	
	//매개변수가 있는 생성자는 super() 사용
	public Engineer(String name) {
		super(name);
	}
	
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}
