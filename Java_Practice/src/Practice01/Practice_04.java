package Practice01;

import java.util.Scanner;

public class Practice_04 {

	public static void main(String[] args) {
		// 1���� n������ ���� �� ���ϱ�
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� �Է� : ");
		
		int n=scan.nextInt();
		
		int sum=0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println("���� : " + sum);
	}

}
