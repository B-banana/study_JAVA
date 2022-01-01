package Chapter07;

class Outer {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	//�ν��Ͻ� Ŭ����(InstanceInner)�� �ܺ� Ŭ����(Outer)�� �ν��Ͻ� ����̱� ������
	//�ν��Ͻ� ���� outerIv�� ����ƽ ���� outerCv ��� ����� �����ϴ�.
	class InstanceInner {
		int iiv = outerIv;	//�ܺ� Ŭ������ private����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//int siv = outerIv ;	//����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ���� �� �� ����.
		static int scv = outerCv;	//����ƽ Ŭ������ ����ƽ ������� ���� ����
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		//���� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ����ƽ ��� �Ѵ� ��� ����
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)���� ����
			int liv3 = lv;	//(JDK 1.8���ʹ� ���� �ƴ�)
			int liv4 = LV;	//ok 
		}
	}

}
