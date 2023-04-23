package nit;

public class Main {

	public static void main(String[] args) {
		// nit kreirana nasleđivanjem Thread klase
		
		A a1 = new A("nit 1");
		A a2 = new A("nit 2");
		A a3 = new A("nit 3");
		
		a1.start();
		a2.start();
		a3.start();

	}

}
