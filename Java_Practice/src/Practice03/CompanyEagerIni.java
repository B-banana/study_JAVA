package Practice03;

public class CompanyEagerIni {
	//Singleton pattern - Eager Initalzation
	//�̱��� ���� - �̸� �ʱ�ȭ ���
	
	private static CompanyEagerIni instance = new CompanyEagerIni();
	
	private CompanyEagerIni() {
	}
	
	public static CompanyEagerIni getInstance() {	//�ܺο��� �������� ���ؼ� static���� ����
		return instance;
	}
	
}
