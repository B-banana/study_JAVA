package Practice04;

class OuterClass {
	
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass;	
	//변수접근 호출. 내부 클래스 자료형 변수를 먼저 선언

	
	//non static
	class InClass {
		
		int inNum = 100;
		//해당 클래스가 non-static이므로 static으로 정의된
		//sNum은 사용 할수 없음. 또한 클래스 내부에서 
		//static insNum과 같이도 정의 할수 없음
		//static을 사용하려면 클래스도 static이여야 하므로
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(inNum);
			System.out.println("OutClass num : " + num + "(외부 인스턴스(heap) 멤버변수)");
			System.out.println("OutClass num : " + sNum + "(외부 전역(Data) 멤버변수)");
			System.out.println("inClass num : " + inNum + "(내부 인스턴스(heap) 멤버변수)");
			
		}	//inTest
		
	}	//InClass
	
	//=================================
	
	//생성자 : this로 멤버변수 초기화 / 또 다른 객체를 초기화 함
	//변수 접근 호출. 외부 클래스의 디폴트 생성자
	//외부 클래스가 생성된 후에 내부 클래스가 생성
	public OuterClass() {
		inClass = new InClass();
	}
	
	//내부 클래스 기능을 호출하기 위한 메소드
	public void usingClass() {
		inClass.inTest();
	}
	
	//==================================
	
	//내부 정적 클래스
	static class InStaticClass {
		
		int inNum = 100;	//자기 내부 필드에서 만드는것은 그냥 가능
		static int sinNum = 200;	//필드에서 정적은 정적 변수 사용 가능
		
		void inTest() {
			
			//num = 200 //에러 : 사용 메모리가 다름.
			//클래스가 static은 Data 메모리를 사용하나 인터스턴스는 heap메모리 영역을 사용
			inNum = 100;
			sinNum = 210;	//해당 클래스에서 생성한 멤버변수는 그냥 사용 가능
			sNum = 300; //외부 static으로 정의된 변수도 사용 가능
			System.out.println("InStaticClass inNum : " + inNum + "(내부 인스턴스 변수)");
			System.out.println("InStaticClass sinNum : " + sinNum + "(내부 static 변수)");
			System.out.println("InStaticClass sNum : " + sNum + "(외부 static 변수)");
			//System.out.println("InStaticClass sNum : " + num + "(외부 외부 변수");
			//에러
			
		}	
		
		//내부 static 클래스의 static 메소드
		static void sTest() {
			
			//num += 10; //static이므로 당연히 사용 불가
			//inNum += 10;	//위와 동일
			sinNum = 300;
			sNum = 310;	//static이면 전부 사용 가능
			
			System.out.println("InStaticClass sinNum : " + sinNum + "(내부 static)");
			System.out.println("OuterClass sNum : " + sNum + "(외부 static)");			
			
		}
			
	}
	
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		//1. Non-static인 경우 객체를 만들어서 사용해야 함.
		//(인스턴스 내부 클래스)
		OuterClass outClass = new OuterClass();	//외부 클래스 객체 생성
		OuterClass.InClass inClass = outClass.new InClass();
		System.out.println("일반 내부 클래스의 일반 메서드 호출");
		inClass.inTest();
		System.out.println();
		
		//2. private으로 변수 접근시 호출
		//(지역 내부 클래스)
		OuterClass outClass1 = new OuterClass();	//외부 클래스 생성
		System.out.println("private으로 변수 접근시 호출");
		outClass1.usingClass();	//외부 클래스가 생성되면서 내부 클래스가 생성됨
		//그 후 생성된 외부클래스로 내부 클래스를 해당 메소드를 호출후 사용.
		System.out.println();
		
		//3. static 내부 클래스
		//(외부 클래스 객체 없이 사용이 가능)
		OuterClass.InStaticClass inStaticClass = new OuterClass.InStaticClass();
		System.out.println("정적 내부 클래스의 일반 메서드");
		inStaticClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 static 메서드 호출");
		inStaticClass.sTest();
		//static이 들어간 메소드도 사용이 가능한다는 뜻
		
		System.err.println("=클래스명으로도 접근 가능");
		OuterClass.InStaticClass.sTest();
		//즉 내부 스태틱과, 그 스태틱 메소드라면 외부 클래스 객체를 생성하지 않아도 바로 호출해서 사용이 가능하다는 뜻
	}
}
