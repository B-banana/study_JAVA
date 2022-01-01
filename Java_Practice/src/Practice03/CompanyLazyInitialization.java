package Practice03;

public class CompanyLazyInitialization {
	//�̸� �ʱ�ȭ ��İ� ���ݴ�� Ŭ������ �ε� �Ǵ� ������ �ƴ� 
	//�ν��Ͻ��� �ʿ��� ������ ��û�� ��� ���� ���ε��� ���� �ν��Ͻ��� 
	//�����ϴ� ���. Thread-safe �� ���� ��Ű���� synchronized ���
	//Thread-safe :  ��Ƽ ������ ���α׷��ֿ��� �Ϲ������� � �Լ��� ����, Ȥ�� ��ü�� ���� ������κ��� ���ÿ� ������ �̷������ 
	//                ���α׷��� ���࿡ ������ ������ ����.

	private static CompanyLazyInitialization instance;
	
	private CompanyLazyInitialization() {
	}
	
	public static synchronized CompanyLazyInitialization getInstance() {
		
		if(instance == null) {
			instance = new CompanyLazyInitialization();
		}
		return instance;
	}
	

}







