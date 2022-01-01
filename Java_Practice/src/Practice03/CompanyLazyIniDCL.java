package Practice03;

public class CompanyLazyIniDCL {
	
	//volatile Ű����� �ֽ�Ƽ���� ȯ�濡�� �ν��Ͻ� �ʱ�ȭ �ϴ� ������ 
	//�ùٸ��� ����ǵ��� ��������
	private volatile static CompanyLazyIniDCL instance;
	
	private CompanyLazyIniDCL() {
	}
	
	public static CompanyLazyIniDCL getInstacne() {
		
		if(instance == null) {
			//ù��° if������ synchronized ���� �� �ѹ� �� ���� üũ
			//���Ĵ� synchronized�� �������� �ʱ� ������ ���� ���� ����
			synchronized (CompanyLazyIniDCL.class) {
				if(instance == null) {
					instance = new CompanyLazyIniDCL();
				}
			}
		}
		return instance;
	}

}
