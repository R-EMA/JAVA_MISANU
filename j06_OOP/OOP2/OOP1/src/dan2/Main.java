package dan2;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		// provera pripadnosti klasi
		if(a instanceof A) {
			System.out.println("Objekat a je instanca klase A");
		}
		else {
			System.out.println("Objekat a nije instanca klase A");
		}
		
		if(b instanceof B) {
			System.out.println("Objekat b je instanca klase B");
		}
		else {
			System.out.println("Objekat b nije instanca klase B");
		}


	}

}
