package CarInheritance;

public class Tire {
	
	//�ʵ�
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//������
	public Tire(String locatoin, int maxRotation) {
		this.location = locatoin;	//������ �ʱ�ȭ
		this.maxRotation = maxRotation;
	}		
	
	//�޼ҵ�
	public boolean roll() {
		
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;	
		}
	}

}
