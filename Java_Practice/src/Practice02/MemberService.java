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
			System.out.println("로그인 성공!");
			check=false;
		}
		else {
			System.out.println("로그인 실패");
			check=true;
		}
		return check;
	}
	
	public void logout() {
		
		boolean run=true;
		
		while(run) {
			Scanner scan=new Scanner(System.in);
			System.out.println("로그아웃 할 id를 입력하십시오");
			System.out.print("id >");
			String id=scan.next();
			
		if(id.equals("hong")) {
			System.out.println(id + "님이 로그아웃 하셨습니다.");
			run=false;
		}
		else {
			System.out.println("잘못된 id입니다.");
			System.out.println();
			continue;
		}
	}

}
}
