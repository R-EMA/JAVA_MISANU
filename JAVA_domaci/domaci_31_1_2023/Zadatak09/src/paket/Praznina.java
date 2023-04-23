package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 9.
 * Napisati program koji prebrojava “space” simbole.
 *
 */

import java.io.*;

public class Praznina {
	
	public static int spaceBlanks(String str) {
		int prazno = 0;
		int d = str.length();
		
		for(int i=0; i< d; i++) {
			if ( str.charAt(i) == ' ' )
				prazno++;
		}
		
		return prazno;
	}

	public static void main(String[] args) throws Exception {
		// prebrojavanje space blankova
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ulaz;
		int rezultat;
		
		System.out.println("Unesite neki tekst: ");
		ulaz = bf.readLine();
		
		//računanje i prikaz rezultata
		rezultat = spaceBlanks(ulaz);
		System.out.println("\nU \"" + ulaz + "\" ima " + rezultat + " SPACE simbola");		

	}

}
