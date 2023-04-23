package akoIFuIF;

import java.util.Scanner;

public class SedmiDan2 {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int dan, mesec, godina; 
		int maxd = 0; // maksimalni broj dana u mesecu, koristi se kod računanja
				
		// unos i provera unosa
		System.out.print("Unesite godinu: ");
		godina = sc.nextInt();
		if (godina < 1) {
			godina = 0;
			System.out.println("Pogrešan unos godine.");
		}
		
		System.out.print("Unesite mesec u godini (1-12): ");
		mesec = sc.nextInt();
		if (mesec < 1 || mesec > 12) {
			
			System.out.println("Pogrešan unos. Vrednost " + mesec + " nikako ne može predstavljati mesec u godini");
			mesec = 1;
			godina = 0;	
		}
		else {
			switch (mesec) {
			
				case 1, 3, 5, 7, 8, 10, 12: {
					maxd = 31;
					break;
				}
				case 4, 6, 9, 11: {
					maxd = 30;
					break;
				}
				case 2: {
					if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0 ) {
						maxd = 29;
					}
					else {
						maxd = 28;
					}
				}
			}
				
		System.out.print("Unesite dan u mesecu (1-29,30,31): ");
		dan = sc.nextInt();
		
		
		
		if (dan < 1 || dan > 31) {			
			System.out.println("Pogrešan unos. Vrednost " + dan + " nikako ne može predstavljati dan u mesecu");
			dan = 1;
			godina = 0;
		}
		
		
		System.out.println("Početna vrednost: " + dan + "." + mesec + "." + godina + ".");
		
		// obrada podataka, tj uvećanje "datuma" za 7 dana i prikaz rezultata
		if (godina > 0) {
			dan = dan + 7;			
			if (dan == maxd ) {
				dan = 1;
				mesec = mesec + 1;
			}
			else if (dan > maxd) {
				dan = dan - maxd;
				mesec = mesec + 1;
			}
			
			if (mesec > 12) {
				mesec = 1;
				godina = godina + 1;
			}
			
			System.out.println("Za sedam dana biće: " + dan + "." + mesec + "." + godina + ".");
			
			sc.close();
		}
		
	}

} }
