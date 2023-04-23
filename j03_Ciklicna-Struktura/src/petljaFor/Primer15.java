package petljaFor;

import java.util.Scanner;

public class Primer15 {
	
	public static void main(String[] args) {
		
		// aritmetička sredina unetih parnih brojeva
		
		Scanner sc = new Scanner(System.in);
		
		int nula, negativan, pozitivan, broj;
		nula = negativan = pozitivan = 0;
		
		System.out.println("Unesite 10 proizvoljnih celih brojeva ");
				
		for (int i = 1; i <= 10; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = sc.nextInt();
			if (broj > 0) {
				pozitivan++;
			}	
			else if (broj < 0) {
				negativan++;
			}
			else {
				nula++;
			}
		}
		
		System.out.println("Uneli ste " + pozitivan + " vrednosti većih od nule.");	
		System.out.println("Uneli ste " + negativan + " vrednosti manjih od nule.");	
		System.out.println("Uneli ste " + nula + " vrednosti jednakih nuli.");	
		
		sc.close();
	}

}
