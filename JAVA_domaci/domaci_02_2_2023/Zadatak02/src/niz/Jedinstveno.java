package niz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author emma
 * 
 * Zadatak 2.
 * Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 1234567
 *
 */

public class Jedinstveno {

	public static void main(String[] args) {
		//izbacivanje duplikata iz datog niza
		/*
		 * Pošto je potrebno promeniti dužinu niza, koristim dinamički niz (array list).
		 * Program zadržava prva pojavljivanja vrednosti, a sva ostala briše, ...
		 * tako da se zadržava (prividan) redosled elemenata 
		 * početno stanje: 1 2 3 2 1 4 5 6 5 7
		 * treba obrisati: 1 2 3 2* 1* 4 5 6 5* 7  
		 * 		(označeni zvezdicom: druga (n-ta) pojavljivanja brojeva 1, 2 i 5)
		 * očekivan rezultat: 1 2 3 4 5 6 7
		*/
		
		List<Integer> ai = new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,4,5,6,5,2,7));
		int aiSize = ai.size(),	// duzina liste
			tmp;				// pomoćna promenljiva, vrednost trenutnog člana liste	
		

		System.out.println("Početni niz:              " + ai);
		
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
