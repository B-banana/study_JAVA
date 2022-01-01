package Chapter07;

class Outer {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	//인스턴스 클래스(InstanceInner)는 외부 클래스(Outer)의 인스턴스 멤버이기 때문에
	//인스턴스 변수 outerIv와 스태틱 변수 outerCv 모두 사용이 가능하다.
	class InstanceInner {
		int iiv = outerIv;	//외부 클래스의 private멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//int siv = outerIv ;	//스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근 할 수 없다.
		static int scv = outerCv;	//스태틱 클래스는 스태틱 멤버에는 접근 가능
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		//지역 클래스는 외부 클래스의 인스턴스 멤버와 스태틱 멤버 둘다 사용 가능
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)접근 가능
			int liv3 = lv;	//(JDK 1.8부터는 에러 아님)
			int liv4 = LV;	//ok 
		}
	}

}
