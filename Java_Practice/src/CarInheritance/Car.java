package CarInheritance;

public class Car {
	
	//Class Tire �������� ��ü ����, �ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftrTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);

	//������ (����Ʈ)
	
	//�޼ҵ�
	public int run() {
		
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftrTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
