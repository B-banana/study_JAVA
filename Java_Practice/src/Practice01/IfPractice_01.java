package Practice01;

import java.util.Scanner;

public class IfPractice_01 {

	public static void main(String[] args) {
		// 3���� �������� �Է��ϰ� �ִ��� ����.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : ");
			int a=Integer.parseInt(scan.next());
		System.out.print("b�� �� : ");
			int b=Integer.parseInt(scan.next());
		System.out.print("c�� �� : ");
			int c=Integer.parseInt(scan.next());
			
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		System.out.println("�ִ밪��" + max + "�Դϴ�");
		

	}

}
