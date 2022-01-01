package Practice03;

public class Card {
	
	private static int cardNum = 10001;
	
	private int userCardNum;

	public Card() {
		userCardNum = cardNum;
		cardNum++;	//카드 생성시 번호 추가
		
	}
	
	public int getCardNumber() {
		return userCardNum;
	}
	
}
