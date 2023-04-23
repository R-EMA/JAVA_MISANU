package akoSwitch;

import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {
		// ispituje da li je isti dan u sedmici
		
		Scanner sc = new Scanner(System.in);
		
		int k1, k2, k3; // prirodni brojevi koji se unose
			
		System.out.println("Uneti 3 prirodna broja: 1-366 ");
		System.out.print("k1 = ");		
		k1 = sc.nextInt();
		
		System.out.print("k2 = ");		
		k2 = sc.nextInt();
		
		System.out.print("k3 = ");		
		k3 = sc.nextInt();
		
		if ( ( k1 < 1 || k1 > 366 ) || ( k2 < 1 || k2 > 366 ) || ( k3 < 1 || k3 > 366 ) ) {
			System.out.println("Neka od unetih vrednosti ne predstavlja dan u godini!");
		}
		else {
			if ( (k1 - k2) % 7 == 0 && (k1 - k3) % 7 == 0 && (k2 - k3) % 7 == 0 ) {	
				System.out.println("Navedene vrednosti predstavljaju iste dane u sedmici");
			}
			else {
				System.out.println("Navedene vrednosti ne predstavljaju iste dane u sedmici");
			}
		}		
	
			
		sc.close();

	}
	
	
}
