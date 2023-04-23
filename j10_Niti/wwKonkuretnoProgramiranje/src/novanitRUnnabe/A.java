package novanitRUnnabe;



public class A implements Runnable {
	
	// definiše šta će run izvršavati
	public void run() {
		for(int i=0; i<10; i++)
			System.out.print(" " + i + ". " + Thread.currentThread().getName());
		System.out.println("");
	}

}
