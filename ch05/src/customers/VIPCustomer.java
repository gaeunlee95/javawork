package customers;
//자식 클래스
public class VIPCustomer extends Customer{
	//필드(변수 선언)
	private int agentId;  //전문 상담원
	double saleRatio;	  //구매 할인율
	
	//기본 생성자
	public VIPCustomer(){
		customerGrade = "VIP";
		saleRatio = 0.1;   //10%
		bonusRatio = 0.05; //5%
	}
	
	//매개변수 있는 생성자
	public VIPCustomer(int customerId, String customerName,int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		saleRatio = 0.1;   //10%
		bonusRatio = 0.05; //5%
	}
	
	
	//agentId set 메서드
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	//showCustomerInfo() 메서드 재정의
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 ID는 " 
				+ agentId + "입니다.";
	}
	
	//calcPrice() 메서드 재정의
	//구매가격 = 가격 - (가격 x 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}


}
