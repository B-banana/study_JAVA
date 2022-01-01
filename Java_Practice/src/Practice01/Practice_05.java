package Practice01;

import java.util.Scanner;

public class Practice_05 {

	public static void main(String[] args) {
		//양수만 입력하기 (2자리의 양수가 입력되지 않을 경우 재 입력 요구)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		int n;
		do {	//do-while을 씀으로 먼저 입렵을 시행합니다.
		System.out.print("입력 : ");
		n=scan.nextInt();
		} while(n < 10 || n > 99);
		
		System.out.println("변수값이 " + n + "으로 지정되었습니다.");
		
	}

}
