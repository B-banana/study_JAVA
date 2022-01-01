package Practice03;

public class CompanyEagerIni {
	//Singleton pattern - Eager Initalzation
	//싱글톤 패턴 - 이른 초기화 방식
	
	private static CompanyEagerIni instance = new CompanyEagerIni();
	
	private CompanyEagerIni() {
	}
	
	public static CompanyEagerIni getInstance() {	//외부에서 가져오기 위해서 static으로 생성
		return instance;
	}
	
}
