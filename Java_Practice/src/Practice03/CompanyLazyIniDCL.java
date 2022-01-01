package Practice03;

public class CompanyLazyIniDCL {
	
	//volatile 키워드는 멀스티스딩 환경에서 인스턴스 초기화 하는 과정이 
	//올바르게 진행되도록 설정해줌
	private volatile static CompanyLazyIniDCL instance;
	
	private CompanyLazyIniDCL() {
	}
	
	public static CompanyLazyIniDCL getInstacne() {
		
		if(instance == null) {
			//첫번째 if문에서 synchronized 접근 후 한번 더 유무 체크
			//이후는 synchronized에 접근하지 않기 때문에 성능 저하 예방
			synchronized (CompanyLazyIniDCL.class) {
				if(instance == null) {
					instance = new CompanyLazyIniDCL();
				}
			}
		}
		return instance;
	}

}
