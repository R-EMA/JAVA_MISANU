package novanitRUnnabe;

/*
nova nit = instanca objekta tipa Thread
može se uraditi na dva načina
1. implementacija interfejsa Runnable
2, proširivanje klase thread
*/


/* RUNNABLE

nakon kreiranja klase koja implementira interfejs RUnnABLE potrebno je napraviti instancu objekta tipa Thread

*/


public class Main {

	public static void main(String[] args) {
		// implementacija interfejsa runnable
		
		A a = new A(); // objekat klase koja  implemnriea interfejs runnable

		// obj klase Thread oblika Thread(Runnable objNIti, String imeNIti)
		//objNIti = instanca klase okona implementira interejs RUnnable. početak niiti.jedan obj može za više ovj Thread klase.
		Thread t1 = new Thread(a,"Nit1");
		Thread t2 = new Thread(a,"Nit2");
		Thread t3 = new Thread(a,"Nit3");
		
		t1.start(); //pokreće run metod kada će se izvršavati
		t2.start();
		t3.start();
		
		// 3 napravljene niti + 1 glavna nit = 4
		
		//System.out.println("\n\nbroj procesorskih jezgara " + Runtime.getRuntime().availableProcessors());



	}

}
