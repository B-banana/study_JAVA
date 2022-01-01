package Practice04;

class Outter2 {
	
	//방법1. 익명의 클래스
	//클래스 이름을 빼고 클래스를 바로 생성
	Runnable getRunnable(int i) {
		int num = 300;
		
		//익명 내부 클래스. Runnable 인터페이스 생성
		return new Runnable() {

			@Override
			public void run() {
				//num = 400; //에러 - 러너블은 인터페이스임
				//i = 10;	//즉 final이기 때문에 변수 재선언 선언 불가
				System.err.println(i);
				System.err.println(num);
			}
		};	//클래스 끝에 ; 표기
	}
	
	//방법 2
	//익명 내부 클래스를 변수에 대입
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};

}

public class AnonymousInner {
	
	public static void main(String[] args) {
		
		Outter2 out = new Outter2();	//외부 객체 생성
		Runnable runneralbe = out.getRunnable(10);	//익명 내부 클래스 객체 생성
		runneralbe.run();
		
		/*
		Outter2 out = new Outter2();	//외부 객체
		out.runner.run();	//인터페이스는 내부 static이므로 바로 호출
		*/
	}

}
