package petljaFor;

import java.util.Scanner;

public class Primer3 {
	
	public static void main(String[] args) {
		
		// sabiranje niza celih brojeva
		
		Scanner sc = new Scanner(System.in);
		
		int br, broj, zbir = 0;
		
		System.out.print("Koliko brojeva želite da sabirate? ");
		br = sc.nextInt();
		
		for (int i = 1; i <= br; i++) {
			System.out.print("\nUnesite " + i + ". broj: ");
			broj = sc.nextInt();
			zbir += broj;
		}
		System.out.println("\nZbir unetih brojeva je " + zbir);
		
		sc.close();
	}

}
