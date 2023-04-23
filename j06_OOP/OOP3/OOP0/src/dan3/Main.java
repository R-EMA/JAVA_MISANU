package dan3;

public class Main {

	public static void main(String[] args) {
		// objekat iste klase kao argument konstruktora
		// preklapanje konstruktora
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(c1);
		
		System.out.println("c1. Površina kruga je: " + c1.area());
		System.out.println("c2. Površina kruga je: " + c2.area());

	}

}
