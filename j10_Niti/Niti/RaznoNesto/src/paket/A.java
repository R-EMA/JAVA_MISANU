package paket;

public class A {
	
	private static int rb = 1;
	
	A() {
		System.out.println("Kreiran je objekat klase A br." + rb);
		rb++;
	}
	
	protected void finalize() {
		System.out.println("Obrisan je objekat klase A");
	}
	
	public void info() {
		System.out.println("hellooo");
	}

}
