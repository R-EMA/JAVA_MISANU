package paketi3;

public class Main {
	
	public static void main(String[] args) {
		// nasledjivanjeeee
		
		A a = new A("Mika");
		a.info();
		
		B b = new B("Pera",15);
		b.info();
		
		B ab = new B(a, 18);
		ab.info();
		
		//izmene
		b.setIme("Perica");
		b.info();
		a.info();
		
		ab.setIme("Mikica");
		ab.info();
		a.info();
		b.info();
	
	}

}
