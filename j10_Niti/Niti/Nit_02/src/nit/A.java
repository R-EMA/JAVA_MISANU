package nit;

public class A implements Runnable{

	@Override
	public void run() {
		// ovo je što se izvršava
		System.out.println("A nit " + Thread.currentThread().getName());
	}

}
