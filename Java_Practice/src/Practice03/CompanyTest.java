package Practice03;

public class CompanyTest {

	public static void main(String[] args) {
		
		CompanyEagerIni company1 = CompanyEagerIni.getInstance();
		CompanyEagerIni company2 = CompanyEagerIni.getInstance();
		
		System.out.println("company 1 :" + company1);
		System.out.println("company 2 :" + company2);
		

	}

}
