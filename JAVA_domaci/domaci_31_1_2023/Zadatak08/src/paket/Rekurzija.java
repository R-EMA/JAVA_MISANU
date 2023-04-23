package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 8.
 * Koristeći rekurzivan postupak izračunati sumu svih cifara unetog broja.
 *
 */

import java.util.Scanner;


public class Rekurzija {
	
	public static int zbirCifara(int n) {
		
		int cifra, zbir = 0;
		
		if(n > 0) {
			cifra = n % 10;
			n = n / 10;
			zbir = cifra + zbirCifara(n);
		}
	
		return zbir;
		
	}

	public static void main(String[] args) {
		// zbir cifara uz pomoć rekurzije
		
		Scanner sc = new Scanner(System.in);
		int broj, rezultat;
		
		// unos broja za koji se računa zbir cifara
		System.out.print("Unesite pozitivan ceo broj (0-9999): ");
		broj = sc.nextInt();
		
		//računanje zbira cifara (poziv fje) i prikaz rezultata
		rezultat = zbirCifara(broj);
		System.out.println("\n" + rezultat + " je zbir cifara broja " + broj);
	
		sc.close();
	}

}
