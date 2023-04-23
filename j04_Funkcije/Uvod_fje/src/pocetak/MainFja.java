package pocetak;

/**
 * 
 * @author emma
 * 
 * JAVA funkcije - uvod
 *
 */

public class MainFja {

	// računanje kvadrata broja: x na 2, x*x
	public static int kvadratBroja(int x) {
		return x*x;
	}

	public static void main(String[] args) {
		// metodi
		
		int x = 10;
		
		// poziv metoda u .print*
		System.out.println("Kvadrat broja x=" + x + " je " + kvadratBroja(x));

	}
	
}

/*
 * 
 * JAVA kao potpuni OOP jezik nema funkcije smislu kako ih imaju proceduralni jezici
 * 
 * funkcija = metod unutar klase
 * 
 * funkcija može da prihvati jednu, ili više vrednosti
 * funkcija može da vrati jednu vrednost
 * funkcija uvek ima povratni tip (void ako ništa ne vraća)
 * 
 * # opšti primer definicije
 * TIP funkcija(tip param1, tip param2, ...) {
 * 		...
 * 		return izraz; // ako nešto vraća TIP(izraz) = TIP
 * }
 * 
 * # primeri poziva
 * funkcija(arg1,arg1, ...); // ako ne vraća vrednost
 * TIP n = funkcija(arg1,arg1, ...); // ako vraća vrednost 
 * 
 */
