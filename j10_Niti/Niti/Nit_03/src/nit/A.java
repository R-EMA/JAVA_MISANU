package nit;

public class A extends Thread {
	
	public A(String s) {
		super(s); //nasleđivanje Thread konstruktora koji prihvata naziv niti
	}
	
	public void run() {
		System.out.println("A nasleđuje Thread. " + Thread.currentThread().getName());
	}

}
