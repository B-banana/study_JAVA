package Practice01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practice_01 {

	public static void main(String[] args) {
		//����ڷκ��� �ΰ��� ����(����,��)�� �Է¹޾� 
		//����(����)�ؼ� ��(����)������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int x, y;
		x=Integer.parseInt(JOptionPane.showInputDialog("ù��° �� �Է�"));
		y=Integer.parseInt(JOptionPane.showInputDialog("�ι�° �� �Է�"));
		
		int total=1;
		
		System.out.println("�Է¹��� ���� : " + x + ", " + y);
		
		if(x<y) {
			for(int i=x; i<=y; i++)
		{
			total *= i;
		}
		}else if(x>y) {
			for(int i=y; i<=x; i++)
			{
				total *= i;
			}
		}else {
			total=x;
		}
		
			System.out.println("�μ����� ������ ����" + total);
	}

}
