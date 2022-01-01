package Practice03;

public class CompanyLazyInitialization {
	//이른 초기화 방식과 정반대로 클래스가 로드 되는 시점이 아닌 
	//인스턴스가 필요한 시점에 요청할 경우 동적 바인딩을 통해 인스턴스를 
	//생성하는 방식. Thread-safe 를 만족 시키위해 synchronized 사용
	//Thread-safe :  멀티 스레드 프로그래밍에서 일반적으로 어떤 함수나 변수, 혹은 객체가 여러 스레드로부터 동시에 접근이 이루어져도 
	//                프로그램의 실행에 문제가 없음을 뜻함.

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







