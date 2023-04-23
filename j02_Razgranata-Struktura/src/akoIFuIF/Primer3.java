package akoIFuIF;

import java.util.Scanner;

public class Primer3 {
	
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
		
			case 'e', 'E': {
				System.out.println("Možete voziti Kamion sa prikolicom.");
				
			}
			case 'd', 'D': {
				System.out.println("Možete voziti Autobus.");
				
			}
			case 'c', 'C': {
				System.out.println("Možete voziti Kamion.");
				
			}
			case 'b', 'B': {
				System.out.println("Možete voziti Automobil.");
				break;
			}
			case 'a', 'A': {
				System.out.println("Možete voziti Motor.");
				break;
			}
			default: {
				System.out.println("Pogrešan unos.");
			}
		
		}
		
		sc.close();

	}

}
