package Chapter07;

class Ex7_12 {
	class InstanceInner {
		int iv = 100;
		//static int cv = 100;	// 에러 static 변수를 선언할 수 있다.
		final static int CONST = 100;	//상수는 모든 내부 클래스에서 정의가 가능하다.
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	//static 클래스만 static 멤버를 정의 할 수 있다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300; //에러 static 변수를 선언 할 수 없다
			final static int CONST = 300;	//final static은 상수이므로 허용
		}
	}
	
	public static void main(String args[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
