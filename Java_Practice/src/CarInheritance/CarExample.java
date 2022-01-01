package CarInheritance;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();	//Car 객체 생성
		
		for(int i=1; i<=5; i++) {
			
			int problemLocation = car.run();	//Car객체가 run()메소드를 실행하며 리턴값을 받아옴
			
			switch(problemLocation) {
			
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2 :
					System.out.println("앞왼쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.backLeftrTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4 :
					System.out.println("앞왼쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("---------1회전 완료----------");
	
		}
		
	}

}
