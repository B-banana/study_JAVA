package Practice02;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		
		boolean run=true;
		boolean check=true;
		
		int input_num;
		
		
		MemberService ms=new MemberService();
		
		while(run) {
			System.out.println("===================");
			System.out.println("1.로그인 | 2. 로그아웃");
			System.out.println("===================");
			System.out.println("번호선택 > ");
			
			Scanner scan=new Scanner(System.in);
			input_num=scan.nextInt();

			switch(input_num) {
				case 1 :
					ms.login();
					run=check;
					
					break;
				case 2 :
					ms.logout();
					run=check;
					break;
				default :
					System.out.println("잘못된 번호입니다.");	
					System.out.println();	
				}
				System.out.println();
			}
		
	}

}
