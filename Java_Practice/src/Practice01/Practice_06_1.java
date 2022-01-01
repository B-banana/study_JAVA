package Practice01;

public class Practice_06_1 {

	public static void main(String[] args) {
		// 곱셈표를 출력
		
		System.out.println("====곱셈표====");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++)
				System.out.printf("%3d", i*j);	//printf("출력서식", 내용) %d 오른쪽 정렬
			System.out.println();
		}
		
	}

}
