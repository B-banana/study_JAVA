package Practice01;

import java.util.Scanner;

public class Practice_03 {

	public static void main(String[] args) {
		// 피보나치 수열의 n번째 수가 무엇인지 구하기.
		// 피보나치 수열 : 앞의 두 수의 합이 그 수열의 값이 됨.
		// 항의 시작은 0 1 로 정의함.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("피보나치 수열의 몇번째 값을 찾습니까?");
		int n;
		n=scan.nextInt();
		
		long num1=0;
		long num2=1;
		long numN=0;
		int i;
		
		if(n >= 3) {
			for(i=0; i<n-2; i++) {
				numN = num1 + num2;
				num1 = num2;
				num2 = numN;
			}	
			System.out.println(n + "번째는 " + numN + "이다요");
		}else if(n == 1) {
			System.out.println(num1);
		}else if(n == 2) {
			System.out.println(num2);
		}else
			System.out.println("잘못된 값");
		
		
		
	}
			
}

