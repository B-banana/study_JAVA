package Practice01;

public class CarGame {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setColor("Red");
		c1.setModel("Hyundai Sonata");
		c1.setPower(180);
		
		Car c2 = new Car("Blue", "BMW 520", 201);
		
		c1.go();
		c2.go();		

	}

}
