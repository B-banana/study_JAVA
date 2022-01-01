package Practice01;

import java.util.Scanner;

public class Practice_04 {

	public static void main(String[] args) {
		// 1부터 n까지의 정수 합 구하기
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 입력 : ");
		
		int n=scan.nextInt();
		
		int sum=0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println("합은 : " + sum);
	}

}
