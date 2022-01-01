package Practice01;

import java.util.Scanner;

public class IfPractice_01 {

	public static void main(String[] args) {
		// 3개의 정숫값을 입력하고 최댓값을 구함.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
			int a=Integer.parseInt(scan.next());
		System.out.print("b의 값 : ");
			int b=Integer.parseInt(scan.next());
		System.out.print("c의 값 : ");
			int c=Integer.parseInt(scan.next());
			
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		System.out.println("최대값은" + max + "입니다");
		

	}

}
