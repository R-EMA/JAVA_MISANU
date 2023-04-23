package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 7.
 * Programski kreirati fajl i upisati tekst: Ja sam programer!
 *
 */

import java.io.*;

public class Datoteka {

	public static void main(String[] args) throws IOException {
		// rad sa datotekama: upis i čitanje
		
		//DataInputStream dis = new DataInputStream(System.in); //veza sa tastaturom; ne treba jer se unosi tačno određen tekst
		FileOutputStream fos = new FileOutputStream("programer.txt"); // za upis
		FileInputStream fis = new FileInputStream("programer.txt"); // za čitanje, nije navedeno u zadatku
		//char ch; // upis, nw treba jer unos ide drugačije
		int ci; // čitanje		
		String ulaz = "Ja sam programer!"; //tekst za upis
		
		// pošto je dat tekst koji treba upisati može i ovako
		for(int i=0; i<ulaz.length(); i++) {
			fos.write(ulaz.charAt(i));
		}
		/*
		 * inače:
		 * 
		 * while ( ch = (char) dis.read() ) != '\n' ) //sve dok se ne pritisne enter
		 * 		fos.write( ch );
		 */
		
		// kontrolno čitanje datoteke
		while( (ci = fis.read()) != -1 ) {
			System.out.print((char) ci);
		}
		
		fos.close();
		fis.close();

	}

}
