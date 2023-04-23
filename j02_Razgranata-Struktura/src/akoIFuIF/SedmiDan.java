package akoIFuIF;

import java.util.Scanner;

public class SedmiDan {
	
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
			mesec = 1;
			godina = 0;
			System.out.println("Pogrešan unos. Vrednost " + mesec + " nikako ne može predstavljati mesec u godini");
		}
				
		System.out.print("Unesite dan u mesecu: ");
		dan = sc.nextInt();
		if (dan < 1 || mesec > 31) {			
			System.out.println("Pogrešan unos. Vrednost " + dan + " nikako ne može predstavljati dan u mesecu");
			dan = 1;
			godina = 0;
		}
		else {			
			if (dan == 29 && mesec == 2 && ( (godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0 ) )  {
				System.out.println("Pogrešan unos. Vrednost " + dan + " nikako ne može predstavljati dan u mesecu");
				dan = 1;
				godina = 0;
			}
			else if (dan == 31 && ( mesec != 3 || mesec != 5 || mesec != 7 || mesec != 8 || mesec != 10 || mesec != 12)) {
				System.out.println("Pogrešan unos. Vrednost " + dan + " ne može predstavljati dan u mesecu");
				dan = 1;
				godina = 0;
			} 
		}
		
		System.out.println("Početna vrednost: " + dan + "." + mesec + "." + godina + ".");
		
		// obrada podataka, tj uvećanje "datuma" za 7 dana i prikaz rezultata
		if (godina > 0) {
			dan = dan + 7;
			if ( mesec == 2 ) {
				if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
					maxd = 29;
				}
				else {
					maxd = 28;
				}
			}
			else if ( mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) {
				maxd = 31;
			}
			else {
				maxd = 30;
			}
			if (dan == maxd ) {
				dan = 1;
				mesec = mesec + 1;
			}
			else if (dan > maxd) {
				dan = dan - maxd;
				mesec = mesec + 1;
			}
			// mesec
			if (mesec > 12) {
				mesec = 1;
				godina = godina + 1;
			}
			
			System.out.println("Za sedam dana biće: " + dan + "." + mesec + "." + godina + ".");
			
			sc.close();
		}
		
	}

}
