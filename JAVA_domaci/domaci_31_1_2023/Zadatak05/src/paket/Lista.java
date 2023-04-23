package paket;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 * 
 * @author emma
 * 
 * Zadatak 5.
 * a) Kreirati dinamički niz.
 * b) Unutar niza dodati 10 imena, koristeći ugrađenu metodu.
 * c) Ispisati sadržaj niza.
 * d) Na poziciji 5 dodati novo ime.
 * e) Odštampati trenutni sadržaj niza.
 * f) Obrisati jedno ime.
 * g) Odštampati trenutni sadržaj niza
 *
 */

public class Lista {

	public static void main(String[] args) throws Exception {
		// dinamički niz ... ArrayList
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // za unos vrednosti
		
		// Kreiranje dinamičkog niza
		List<String> imena = new ArrayList<String>(); 
		
		// unos vrednosti
		System.out.println("Unesite 10 imena. ");
		for(int i=0; i < 10; i++) {
			System.out.print( (i+1) + ". ");
			imena.add(bf.readLine());
		}
		/*
		 * alternativno, moglo je i kao:
		 * 
		 * imena.add("Janko");
		 * imena.add("Marko");
		 * imena.add("Ana";
		 * 
		 * ... i tako ukupno 10 puta.
		 */
		
		// prikaz sadržaja niza primenom napredne for petlje
		System.out.print("\nImena: ");
		for(String ime : imena)
			System.out.print(ime + " ");
		
		// dodavanje imena na poziciji (indeksu) 5
		imena.add(5, "Petko");
		
		// prikaz sadržaja niza posle promene primenom napredne for petlje
		System.out.print("\nImena: ");
		for(String ime : imena)
			System.out.print(ime + " ");
		
		// brisanje jednog imena; briša sa 4te pozicije (index).
		imena.remove(4);
		/* kada treba obrisati konkretno ime (vrednost):
		 * 
		 * imena.remove("Petko");
		 */
		
		// prikaz sadržaja niza posle promene primenom napredne for petlje
		System.out.print("\nImena: ");
		for(String ime : imena)
			System.out.print(ime + " ");
		
	}

}
