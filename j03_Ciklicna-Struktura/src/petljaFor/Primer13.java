package petljaFor;

import java.util.Scanner;

public class Primer13 {
	
	public static void main(String[] args) {
		
		// aritmetička sredina unetih brojeva
		
		Scanner sc = new Scanner(System.in);
		
		int br, broj, zbir = 0;
		
		System.out.print("Za koliko brojeva želite da izračunate aritmetičku sredinu? ");
		br = sc.nextInt();
		
		for (int i = 1; i <= br; i++) {
			System.out.print("\nUnesite " + i + ". broj: ");
			broj = sc.nextInt();
			zbir += broj;
		}
		System.out.println("\nAritmetička sredina unetih brojeva je " + (float) zbir/br);
		
		sc.close();
	}

}
