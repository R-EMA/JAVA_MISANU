package akoIF2;

import java.util.Scanner;

public class Primer5 {
	
	public static void main(String[] args) {
		
		/* char pod tip: malo, veliko slovo, broj ili specijalni znak? zadatak 1 */
		
		Scanner sc = new Scanner(System.in);
		
		int znak;
		
		System.out.print("Unesite SAMO jedan znak .... ");
		
		znak = sc.next().charAt(0);
		
		if ( znak >= 'A' && znak <= 'Z') {
			
			System.out.println("Uneti znak " + (char) znak + " je veliko slovo.");
			
		} else if ( znak >= 'a' && znak <= 'z') {
			
			System.out.println("Uneti znak " + (char) znak + " je malo slovo.");
			
		
		} else if ( znak >= '0' && znak <= '9' ) {
			
			System.out.println("Uneti znak " + (char) znak + " je cifra.");			
		
		} else {
			
			System.out.println("Uneti znak " + (char) znak + " je specijalni znak.");	
		}		
			
		sc.close();
	}

}


