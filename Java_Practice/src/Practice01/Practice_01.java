package Practice01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practice_01 {

	public static void main(String[] args) {
		//사용자로부터 두개의 정수(시작,끝)를 입력받아 
		//시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

		int x, y;
		x=Integer.parseInt(JOptionPane.showInputDialog("첫번째 수 입력"));
		y=Integer.parseInt(JOptionPane.showInputDialog("두번째 수 입력"));
		
		int total=1;
		
		System.out.println("입력받은 값은 : " + x + ", " + y);
		
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
		
			System.out.println("두수간의 수들의 곱은" + total);
	}

}
