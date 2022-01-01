package Practice04;

class OuterClass {
	
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass;	
	//�������� ȣ��. ���� Ŭ���� �ڷ��� ������ ���� ����

	
	//non static
	class InClass {
		
		int inNum = 100;
		//�ش� Ŭ������ non-static�̹Ƿ� static���� ���ǵ�
		//sNum�� ��� �Ҽ� ����. ���� Ŭ���� ���ο��� 
		//static insNum�� ���̵� ���� �Ҽ� ����
		//static�� ����Ϸ��� Ŭ������ static�̿��� �ϹǷ�
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(inNum);
			System.out.println("OutClass num : " + num + "(�ܺ� �ν��Ͻ�(heap) �������)");
			System.out.println("OutClass num : " + sNum + "(�ܺ� ����(Data) �������)");
			System.out.println("inClass num : " + inNum + "(���� �ν��Ͻ�(heap) �������)");
			
		}	//inTest
		
	}	//InClass
	
	//=================================
	
	//������ : this�� ������� �ʱ�ȭ / �� �ٸ� ��ü�� �ʱ�ȭ ��
	//���� ���� ȣ��. �ܺ� Ŭ������ ����Ʈ ������
	//�ܺ� Ŭ������ ������ �Ŀ� ���� Ŭ������ ����
	public OuterClass() {
		inClass = new InClass();
	}
	
	//���� Ŭ���� ����� ȣ���ϱ� ���� �޼ҵ�
	public void usingClass() {
		inClass.inTest();
	}
	
	//==================================
	
	//���� ���� Ŭ����
	static class InStaticClass {
		
		int inNum = 100;	//�ڱ� ���� �ʵ忡�� ����°��� �׳� ����
		static int sinNum = 200;	//�ʵ忡�� ������ ���� ���� ��� ����
		
		void inTest() {
			
			//num = 200 //���� : ��� �޸𸮰� �ٸ�.
			//Ŭ������ static�� Data �޸𸮸� ����ϳ� ���ͽ��Ͻ��� heap�޸� ������ ���
			inNum = 100;
			sinNum = 210;	//�ش� Ŭ�������� ������ ��������� �׳� ��� ����
			sNum = 300; //�ܺ� static���� ���ǵ� ������ ��� ����
			System.out.println("InStaticClass inNum : " + inNum + "(���� �ν��Ͻ� ����)");
			System.out.println("InStaticClass sinNum : " + sinNum + "(���� static ����)");
			System.out.println("InStaticClass sNum : " + sNum + "(�ܺ� static ����)");
			//System.out.println("InStaticClass sNum : " + num + "(�ܺ� �ܺ� ����");
			//����
			
		}	
		
		//���� static Ŭ������ static �޼ҵ�
		static void sTest() {
			
			//num += 10; //static�̹Ƿ� �翬�� ��� �Ұ�
			//inNum += 10;	//���� ����
			sinNum = 300;
			sNum = 310;	//static�̸� ���� ��� ����
			
			System.out.println("InStaticClass sinNum : " + sinNum + "(���� static)");
			System.out.println("OuterClass sNum : " + sNum + "(�ܺ� static)");			
			
		}
			
	}
	
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		//1. Non-static�� ��� ��ü�� ���� ����ؾ� ��.
		//(�ν��Ͻ� ���� Ŭ����)
		OuterClass outClass = new OuterClass();	//�ܺ� Ŭ���� ��ü ����
		OuterClass.InClass inClass = outClass.new InClass();
		System.out.println("�Ϲ� ���� Ŭ������ �Ϲ� �޼��� ȣ��");
		inClass.inTest();
		System.out.println();
		
		//2. private���� ���� ���ٽ� ȣ��
		//(���� ���� Ŭ����)
		OuterClass outClass1 = new OuterClass();	//�ܺ� Ŭ���� ����
		System.out.println("private���� ���� ���ٽ� ȣ��");
		outClass1.usingClass();	//�ܺ� Ŭ������ �����Ǹ鼭 ���� Ŭ������ ������
		//�� �� ������ �ܺ�Ŭ������ ���� Ŭ������ �ش� �޼ҵ带 ȣ���� ���.
		System.out.println();
		
		//3. static ���� Ŭ����
		//(�ܺ� Ŭ���� ��ü ���� ����� ����)
		OuterClass.InStaticClass inStaticClass = new OuterClass.InStaticClass();
		System.out.println("���� ���� Ŭ������ �Ϲ� �޼���");
		inStaticClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ static �޼��� ȣ��");
		inStaticClass.sTest();
		//static�� �� �޼ҵ嵵 ����� �����Ѵٴ� ��
		
		System.err.println("=Ŭ���������ε� ���� ����");
		OuterClass.InStaticClass.sTest();
		//�� ���� ����ƽ��, �� ����ƽ �޼ҵ��� �ܺ� Ŭ���� ��ü�� �������� �ʾƵ� �ٷ� ȣ���ؼ� ����� �����ϴٴ� ��
	}
}
