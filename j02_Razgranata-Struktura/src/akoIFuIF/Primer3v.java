package akoIFuIF;

import java.util.Scanner;

public class Primer3v {
	
	/* 
	 * a -  Sa kategorijom A mozete voziti Auto.
	 * b - Sa kategorijom B mozete voziti Auto.
	 * c - Sa kategorijom C mozete voziti Auto, kamion.
	 * d - Sa kategorijom D mozete voziti Auto, kamion i autobus.
	 * e - Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom.
	 * ostalo - Neispravan unos.
	 * */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char kategorija; // kategorija vozačke: A, B, C; D

		System.out.print("Unesite kategoriju vozačke dozvole (A,B,C,D,E): ");
		
		kategorija = sc.next().charAt(0);
		
		switch(kategorija) {
		
			case 'a', 'A': {
				System.out.println("Sa A kategorijom možete voziti Motor.");
				break;
			}
			case 'b', 'B': {
				System.out.println("Sa B kategorijom možete voziti Automobil.");
				break;
			}
			case 'c', 'C': {
				System.out.println("Sa C kategorijom možete voziti Kamion i Automobil.");
				break;
			}
			case 'd', 'D': {
				System.out.println("Sa D kategorijom možete voziti Autobus, Kamion i Automobil.");
				break;
			}
			case 'e', 'E': {
				System.out.println("Sa D kategorijom možete voziti Kamion sa prikolicom, Autobus, Kamion i Automobil.");
				break;
			}
			default: {
				System.out.println("Pogrešan unos.");
			}
		
		}
		
		sc.close();

	}

}
