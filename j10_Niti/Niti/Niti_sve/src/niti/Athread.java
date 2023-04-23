package niti;

public class Athread extends Thread {

		public Athread(String s) {
			super(s); //s = ime niti; nasleđivanje Thread konstruktora
		}
		
		public void run() {
			// ono što nit radi
			for(int i=0; i<5; i++)
				System.out.println(i + ".Sporedna nit A - proširenje klase Thread .... ");
			System.out.println(Thread.currentThread().getName()); //vraća podatke trenutne niti, ne mora da bude glavna
		}
}
