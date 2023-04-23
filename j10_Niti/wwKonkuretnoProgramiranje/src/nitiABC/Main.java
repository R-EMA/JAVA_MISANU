package nitiABC;

public class Main {

	public static void main(String[] args) {
		// više klasa niti
		
		A a = new A("nitA");
		B b = new B("nitB");
		C c = new C("nitC");
		
		a.start();
		b.start();
		c.start();

	}

}
