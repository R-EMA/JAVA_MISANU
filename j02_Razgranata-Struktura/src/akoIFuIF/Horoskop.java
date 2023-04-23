package akoIFuIF;

import java.util.Scanner;

public class Horoskop {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int dan, mesec; 
		String mesec1;
		int maxd = 0; // maksimalni broj dana u mesecu, koristi se kod računanja
		
		System.out.print("Unesite naziv meseca ");
		mesec1 = sc.nextLine();
		mesec1 = mesec1.toUpperCase();
						
		System.out.print("Unesite mesec u godini (1-12): ");
		mesec = sc.nextInt();
		if (mesec < 1 || mesec > 12) {
			
			System.out.println("Pogrešan unos. Vrednost " + mesec + " nikako ne može predstavljati mesec u godini");
			mesec = 1;			
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
					maxd = 28; // skoro svaka 4 je prestupa, ne zna se godina pa koristim 28 jer je češća vrednost
				}
			}
		}	
				
		System.out.print("Unesite dan u mesecu (1-29,30,31): ");
		dan = sc.nextInt();
		
		
		if ((dan < 1 || dan > 31) || dan > maxd) {			
			System.out.println("Pogrešan unos. Vrednost " + dan + " nikako ne može predstavljati dan u mesecu");
			dan = maxd;			
		}
				
		System.out.print("Za datum rođenja " + dan + "." + mesec + ". Vaš horoskopski znak je ");
		
		switch (mesec ) {
		
		case 1: {
			if (dan > 20) {
				System.out.println("VODOLIJA.");
			}
			else {
				System.out.println("JARAC.");
			}
			break;
		}
		
		case 2: {
			if (dan > 19) {
				System.out.println("RIBE.");
			}
			else {
				System.out.println("VODOLIJA.");
			}
			break;
		}
		
		case 3: {
			if (dan > 20) {
				System.out.println("OVAN.");
			}
			else {
				System.out.println("RIBE.");
			}
			break;
		}
		
		case 4: {
			if (dan > 20) {
				System.out.println("BIK.");
			}
			else {
				System.out.println("OVAN.");
			}
			break;
		}
		
		case 5: {
			if (dan > 21) {
				System.out.println("BLIZANCI.");
			}
			else {
				System.out.println("BIK.");
			}
			break;
		}
		
		case 6: {
			if (dan > 21) {
				System.out.println("RAK.");
			}
			else {
				System.out.println("BLIZANCI.");
			}
			break;
		}
		
		case 7: {
			if (dan > 22) {
				System.out.println("LAV.");
			}
			else {
				System.out.println("RAK.");
			}
			break;
		}
		
		case 8: {
			if (dan > 22) {
				System.out.println("DEVICA.");
			}
			else {
				System.out.println("LAV.");
			}
			break;
		}
		
		case 9: {
			if (dan > 23) {
				System.out.println("VAGA.");
			}
			else {
				System.out.println("DEVICA.");
			}
			break;
		}
		
		case 10: {
			if (dan > 23) {
				System.out.println("ŠKORPIJA.");
			}
			else {
				System.out.println("VAGA.");
			}
			break;
		}
		
		case 11: {
			if (dan > 22) {
				System.out.println("STRELAC.");
			}
			else {
				System.out.println("ŠKORPIJA.");
			}
			break;
		}
		
		case 12: {
			if (dan > 21) {
				System.out.println("JARAC.");
			}
			else {
				System.out.println("STRELAC.");
			}
			break;
		}
		default: {
			System.out.println("MARSOVAC_FOLIRANT");
		}
		
		}
		
		// isto to, ali sa nazivom meseca.
		System.out.print("\n\nZa datum rođenja " + dan + ". " + mesec1.toLowerCase() + " Vaš horoskopski znak je ");

		switch (mesec1) {
		
		case "JANUAR": {
			if (dan > 20) {
				System.out.println("VODOLIJA.");
			}
			else {
				System.out.println("JARAC.");
			}
			break;
		}
		
		case "FEBRUAR": {
			if (dan > 19) {
				System.out.println("RIBE.");
			}
			else {
				System.out.println("VODOLIJA.");
			}
			break;
		}
		
		case "MART": {
			if (dan > 20) {
				System.out.println("OVAN.");
			}
			else {
				System.out.println("RIBE.");
			}
			break;
		}
		
		case "APRIL": {
			if (dan > 20) {
				System.out.println("BIK.");
			}
			else {
				System.out.println("OVAN.");
			}
			break;
		}
		
		case "MAJ": {
			if (dan > 21) {
				System.out.println("BLIZANCI.");
			}
			else {
				System.out.println("BIK.");
			}
			break;
		}
		
		case "JUN": {
			if (dan > 21) {
				System.out.println("RAK.");
			}
			else {
				System.out.println("BLIZANCI.");
			}
			break;
		}
		
		case "JUL": {
			if (dan > 22) {
				System.out.println("LAV.");
			}
			else {
				System.out.println("RAK.");
			}
			break;
		}
		
		case "AVGUST": {
			if (dan > 22) {
				System.out.println("DEVICA.");
			}
			else {
				System.out.println("LAV.");
			}
			break;
		}
		
		case "SEPTEMBAR": {
			if (dan > 23) {
				System.out.println("VAGA.");
			}
			else {
				System.out.println("DEVICA.");
			}
			break;
		}
		
		case "OKTOBAR": {
			if (dan > 23) {
				System.out.println("ŠKORPIJA.");
			}
			else {
				System.out.println("VAGA.");
			}
			break;
		}
		
		case "NOVEMBAR": {
			if (dan > 22) {
				System.out.println("STRELAC.");
			}
			else {
				System.out.println("ŠKORPIJA.");
			}
			break;
		}
		
		case "DECEMBAR": {
			if (dan > 21) {
				System.out.println("JARAC.");
			}
			else {
				System.out.println("STRELAC.");
			}
			break;
		}
		default: {
			System.out.println("MARSOVAC_FOLIRANT. \n(pogrešan mesec)");
		}
		
		}

		sc.close();
		
	}

} 
