package Practice04;

class Outter2 {
	
	//���1. �͸��� Ŭ����
	//Ŭ���� �̸��� ���� Ŭ������ �ٷ� ����
	Runnable getRunnable(int i) {
		int num = 300;
		
		//�͸� ���� Ŭ����. Runnable �������̽� ����
		return new Runnable() {

			@Override
			public void run() {
				//num = 400; //���� - ���ʺ��� �������̽���
				//i = 10;	//�� final�̱� ������ ���� �缱�� ���� �Ұ�
				System.err.println(i);
				System.err.println(num);
			}
		};	//Ŭ���� ���� ; ǥ��
	}
	
	//��� 2
	//�͸� ���� Ŭ������ ������ ����
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};

}

public class AnonymousInner {
	
	public static void main(String[] args) {
		
		Outter2 out = new Outter2();	//�ܺ� ��ü ����
		Runnable runneralbe = out.getRunnable(10);	//�͸� ���� Ŭ���� ��ü ����
		runneralbe.run();
		
		/*
		Outter2 out = new Outter2();	//�ܺ� ��ü
		out.runner.run();	//�������̽��� ���� static�̹Ƿ� �ٷ� ȣ��
		*/
	}

}
