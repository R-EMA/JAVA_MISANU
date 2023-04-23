package nit;

/**
 * 
 * kreiranje nove niti
 *
 */
public class Main {

	public static void main(String[] args) {
		// Runnable interfejs
		
		A a = new A(); //klasa niti 
		
		//nova nit, nije glavna
		Thread t1 = new Thread(a,"nit 1");
		Thread t2 = new Thread(a,"nit 2");
		Thread t3 = new Thread(a,"nit 3");
		System.out.println(t1 + " vs " + Thread.currentThread());
		
		//pokretanje niti:
		t1.start();
		t2.start();
		t3.start();
	}

}
