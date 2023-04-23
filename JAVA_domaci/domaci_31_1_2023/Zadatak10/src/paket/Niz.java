package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 10.
 * Napisati program koji omogućuje unos 10 brojeva unutar niza, traženog broja, 
 * a zatim je potrebno ispisati koliko puta se traženi broj pojavljuje u nizu.
 * 
 * U cilju pojednostavljenja unos je ograničen na cele brojeve, 
 * ali radiće i sa float i double (naravno, kada se promeni deklaracija niza i traženog broja u float, odnosno double)
 *
 */

import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {
		// prebrojavanje ponavljanja broja
		// uzete su u obzir samo "pune" vrednosti elemenata niza
		// može da se usloži ako bi se gledalo i unutar vrednosti elemenata
		// 12 ->   123 12 18 453  312 12   ->  2 puta (12,12), => puta (123,12,312,12)
		
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[10];
		int broj, 				// traženi broj
			brPonavljanja = 0;	// broj pojavljivanja traženog broja u nizu
		
		System.out.println("Unesite 10 celih brojeva: ");
		for(int i=0; i<10; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = sc.nextInt();
		}
		System.out.print("\nUnesite traženi broj: ");
		broj = sc.nextInt();
		
		System.out.print("\n U nizu [ ");
		for(int i : niz) {
			System.out.print(i + " "); 
			if( broj == i )
				brPonavljanja++;			
		}
		System.out.print("]  vrednost " + broj + " se pojavljuje " + brPonavljanja + " puta. ");
		
		sc.close();

	}

}
