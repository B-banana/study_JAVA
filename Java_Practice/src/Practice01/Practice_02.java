package Practice01;

public class Practice_02 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + ... �� �� ���� 100�̻��� �ɶ��� ��

		int num=0;	//�ʱⰪ
		int total=0;
		
		while(true) {
			num++;	//�������� ���ư� ù��°�� num=1 ��
			if(num%2 == 0)	//¦���϶� true
				total -= num;
			else
				total += num;
			
			if(total >=100)
				break;
		}
		System.out.println(num);
		
	}

}
