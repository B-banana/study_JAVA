package Practice01;

import java.util.Scanner;	//Scanner 호출

public class IfPractice_02 {
	public static void main(String[] args) {
		
		//입력한 정숫값이 양수인지 음수인지 0인지 판단
		
		Scanner scan=new Scanner(System.in);	//Scanner 객체 생성
		
		System.out.print("정수를 입력하세요 : ");
		
		int n=scan.nextInt();	//뒤에 사용한 자료형에 맞는 값을 받을 수 있음.
		
		if(n>0)
			System.out.println("이 수는 양수");	//실행문이 한줄일 경우엔{}을 생략 가능
		else if(n<0)
			System.out.println("이 수는 음수");
		else
			System.out.println("이 수는 0");
	
	}
}
