package Practice01;

import java.util.Scanner;

public class Practice_05 {

	public static void main(String[] args) {
		//����� �Է��ϱ� (2�ڸ��� ����� �Էµ��� ���� ��� �� �Է� �䱸)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		int n;
		do {	//do-while�� ������ ���� �Է��� �����մϴ�.
		System.out.print("�Է� : ");
		n=scan.nextInt();
		} while(n < 10 || n > 99);
		
		System.out.println("�������� " + n + "���� �����Ǿ����ϴ�.");
		
	}

}
