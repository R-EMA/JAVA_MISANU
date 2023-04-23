package niti;

public class Arun implements Runnable {

	@Override
	public void run() {
		// ono što nit radi
		for(int i=0; i<5; i++)
			System.out.println(i + ".Sporedna nit A - implementacija interfejsa Runnable .... ");
		System.out.println(Thread.currentThread().getName()); //vraća podatke trenutne niti, ne mora da bude glavna
	}

}
