package petljaFor;

import java.util.Scanner;

public class Primer14 {
	
	public static void main(String[] args) {
		
		// aritmetička sredina unetih parnih brojeva
		
		Scanner sc = new Scanner(System.in);
		
		int br, broj, zbir = 0, par = 0;
		
		System.out.print("Za koliko brojeva želite da izračunate aritmetičku sredinu? ");
		br = sc.nextInt();
		
		for (int i = 1; i <= br; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = sc.nextInt();
			if (broj % 2 == 0) {
				zbir += broj;
				par++;
			}			
		}
		System.out.println("\nAritmetička sredina unetih brojeva je " + (float) zbir/par);
		
		sc.close();
	}

}
