package Practice02;

import java.util.Scanner;

public class MemberService {
	
	boolean check;
	
	public MemberService() {
	}
	
	public boolean login() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("id : ");
		String id=scan.next();
		System.out.print("pw : ");
		String password=scan.next();
		
		if(id.equals("hong") && password.equals("12345")){
			System.out.println("�α��� ����!");
			check=false;
		}
		else {
			System.out.println("�α��� ����");
			check=true;
		}
		return check;
	}
	
	public void logout() {
		
		boolean run=true;
		
		while(run) {
			Scanner scan=new Scanner(System.in);
			System.out.println("�α׾ƿ� �� id�� �Է��Ͻʽÿ�");
			System.out.print("id >");
			String id=scan.next();
			
		if(id.equals("hong")) {
			System.out.println(id + "���� �α׾ƿ� �ϼ̽��ϴ�.");
			run=false;
		}
		else {
			System.out.println("�߸��� id�Դϴ�.");
			System.out.println();
			continue;
		}
	}

}
}
