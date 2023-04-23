package novanitThread;

public class Main {

	public static void main(String[] args) {
		// proširivanje klase thread
		
		A a1 = new A(" Nit-01");
		A a2 = new A(" Nit-02");
		A a3 = new A(" Nit-03");
		
		a1.start(); //početak izvršavanja niti pozivanjem metoda run
		a2.start();
		a3.start();
	}

}
