package customers;

//고객 - 골드 고객
public class GoldCustomer extends Customer{
	double saleRatio;	  //구매 할인율
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		saleRatio = 0.1;	//10%
		bonusRatio = 0.02;	//2%
	}

	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

}
