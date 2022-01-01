package Practice01;

public class Practice_02 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + ... 일 때 합이 100이상이 될때의 수

		int num=0;	//초기값
		int total=0;
		
		while(true) {
			num++;	//무한으로 돌아감 첫번째때 num=1 됨
			if(num%2 == 0)	//짝수일때 true
				total -= num;
			else
				total += num;
			
			if(total >=100)
				break;
		}
		System.out.println(num);
		
	}

}
