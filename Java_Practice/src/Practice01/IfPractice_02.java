package Practice01;

import java.util.Scanner;	//Scanner ȣ��

public class IfPractice_02 {
	public static void main(String[] args) {
		
		//�Է��� �������� ������� �������� 0���� �Ǵ�
		
		Scanner scan=new Scanner(System.in);	//Scanner ��ü ����
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int n=scan.nextInt();	//�ڿ� ����� �ڷ����� �´� ���� ���� �� ����.
		
		if(n>0)
			System.out.println("�� ���� ���");	//���๮�� ������ ��쿣{}�� ���� ����
		else if(n<0)
			System.out.println("�� ���� ����");
		else
			System.out.println("�� ���� 0");
	
	}
}
