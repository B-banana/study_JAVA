package Practice01;

import java.util.Scanner;

public class Practice_03 {

	public static void main(String[] args) {
		// �Ǻ���ġ ������ n��° ���� �������� ���ϱ�.
		// �Ǻ���ġ ���� : ���� �� ���� ���� �� ������ ���� ��.
		// ���� ������ 0 1 �� ������.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�Ǻ���ġ ������ ���° ���� ã���ϱ�?");
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
			System.out.println(n + "��°�� " + numN + "�̴ٿ�");
		}else if(n == 1) {
			System.out.println(num1);
		}else if(n == 2) {
			System.out.println(num2);
		}else
			System.out.println("�߸��� ��");
		
		
		
	}
			
}

