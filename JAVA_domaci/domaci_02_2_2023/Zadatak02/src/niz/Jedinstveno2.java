package niz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 
 * @author emma
 * 
 * Zadatak 2.
 * Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 1234567
 *
 * verzija sa unosom vrednosti. celobrojne pozitivne vrednosti.
 */

public class Jedinstveno2 {

	public static void main(String[] args) {
		//izbacivanje duplikata iz celobrojnog niza
				
		List<Integer> ai = new ArrayList<Integer>();
		int aiSize,	// duzina liste; brojač unosa
			tmp;				// pomoćna promenljiva, vrednost trenutnog člana liste	
		Scanner sc = new Scanner(System.in);
		
		/*unos podataka; 
		* unos prestaje kada korisnik unese  NEinteger vrednost, negativnu vrednost, 
		* 		ili ukupno 50 ispravnih vrednosti.		* 
		*/
		aiSize = 1; // aiSize kao brojač unosa
		System.out.println("\nUNESITE NIZ POZITIVNIH CELIH BROJEVA: ");
		System.out.println("(max 50 vrednosti; prekid unosa je neispravna vrednost)");
		tmp = 0;
		System.out.print("Vrednost " + aiSize + " = ");
		while(sc.hasNextInt()) {			
			tmp = sc.nextInt();					
			if( tmp < 0 ) {
				System.out.println("         Kraj unosa. Neispravna vrednost.");
				break;
			}			
			ai.add(tmp);
			aiSize++;		
			if( aiSize > 50 ) {
				System.out.println("         Kraj unosa. Prekoračen limit.");
				break;
			}
			System.out.print("Vrednost " + aiSize + " = ");
		} 
		sc.close();

		aiSize = ai.size(); // aiSize kao duzina liste.
		System.out.println("\nPočetni niz:              " + ai);
		
		//brisanje duplikata		
		for(int i=0; i < aiSize; i++) {
			tmp = ai.get(i);
			if( ai.indexOf(tmp) != i) {
				ai.remove(i);
				aiSize--; //smanjuje se broj članova
				i--; //vraća brojač unazad jer se "pomeraju" indeksi ulevo
			}
		}
	
		System.out.println("Niz očišćen od duplikata: " + ai);
		
	}

}
