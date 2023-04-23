package akoIF2;

import java.util.Scanner;

public class Primer2 {
	
	public static void main(String[] args) {
		
		// deljivost brojem 2 i 3
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.print("Unesite jedan ceo broj ");
		
		broj = sc.nextInt();
		
		if ( broj % 2 == 0 && broj % 3 == 0 ) {
			
			System.out.println("Uneti broj je deljiv i brojem 2 i brojem 3.");
			
		}
		
			
		if ( broj % 2 != 0 || broj % 3 != 0 ) {
			
			System.out.println("Uneti broj nije deljiv ili brojem 2 ili brojem 3.");
			
		}
		
	}

}


