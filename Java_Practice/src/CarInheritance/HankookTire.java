package CarInheritance;

public class HankookTire extends Tire {

	// �ʵ�

	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // �θ� ������ ȣ��
	}

	// �޼ҵ�
	@Override
	public boolean roll() {

		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}
