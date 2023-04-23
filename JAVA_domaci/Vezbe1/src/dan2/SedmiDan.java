package dan2;

import java.util.Scanner;

public class SedmiDan {

	public static void main(String[] args) {
		// simulacija datetime funkcije, promena datuma za sedam dana
		
		int d, m, y; // dan, mesec, godina
		int d1, m1, y1; // za sedam dana nova vrednost
		int maxD = 28; // maksimalni broj dana u mesecu
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite godinu: ");
		y = sc.nextInt();
		if (y > 0) {
			y1 = y;
			System.out.print("Unesite mesec: ");
			m = sc.nextInt();
			//provera ispravnosti meseca
			if ( m > 0 && m <=12 ) {
				m1 = m;
				System.out.print("Unesite dan: ");
				d = sc.nextInt();
				// provera ispravnosti dana 
				if (d > 0 && d <= 31) {
					switch (m) {
					case 1, 3, 5, 7, 8, 10, 12: {
						maxD = 31;
						break;
					}
					case 4, 6, 9, 11: {
						maxD = 30;
						break;
					}
					case 2: {
						if ( (y % 4 == 0 && y % 100 !=0) || y % 400 == 0 ) {
							maxD = 29;
						}
						else {
							maxD = 28;
						}
						break;
					}					
					}
					if (d <= maxD) {
						 System.out.println("Početni datum: " + d + "." + m + "." + y + ". godine");
						 d1 = d + 7;
						 if (d1 > maxD) {
							 d1 = d1 - maxD;
							 m1 += 1;
							 if (m1 > 12) {
								 m1 = 1;
								 y1 += 1;
							 }
						 }
						 System.out.println("Za sedam dana biće: " + d1 + "." + m1 + "." + y1 + ". godine");

					}
					else {
						System.out.println("Greška! " +  m + ". mesec u godini " + y + " ima manje od " + d + " dana.");
					}
				}
				else {
					System.out.println("Greška! Jedan mesec može da ima najviše 31 dan, a najmanja vrednost je 1.");
				}
			}
			else {
				System.out.println("Greška! U godini ima najviše 12 meseci, a najmanja vrednost je 1.");
			}
		}
		else {
			System.out.println("Greška! Godina mora da bude pozitivna i poželjno četvorocifrena.");
		}
		
		sc.close();
	}

}
