package statics.card;

public class CardTest {

	public static void main(String[] args) {
			
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println("카드번호: " + card1.getCardNumber());
		System.out.println("카드번호: " + card2.getCardNumber());
		System.out.println("카드번호: " + card3.getCardNumber());
	}

}
