package Practice03;

public class Card {
	
	private static int cardNum = 10001;
	
	private int userCardNum;

	public Card() {
		userCardNum = cardNum;
		cardNum++;	//ī�� ������ ��ȣ �߰�
		
	}
	
	public int getCardNumber() {
		return userCardNum;
	}
	
}
