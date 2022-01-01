package Practice01;

public class forPractice_01 {

	public static void main(String[] args) {
		// 방정식 2x+4y=10의 모든 해를 구하시오
		// 단 x, y는 정수이고 각각의 범위는 0<=x,y<=10
		
	int x,y;
	
	for(x=0; x<=10; x++) {
		for(y=0; y<=10; y++) {
			if((2*x)+(4*y) == 10)
				System.out.println("x : " + x + ", y " +y);
		}
	}

	}

}