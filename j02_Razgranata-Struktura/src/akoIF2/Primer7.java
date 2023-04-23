package akoIF2;

import java.util.Scanner;

public class Primer7 {
	
	public static void main(String[] args) {
		
		/* prestupna godina, zadatak 5 */
		
		Scanner sc = new Scanner(System.in);
		
		int god;
		
		System.out.print("Unesite godinu (4 cifre) .... ");
		
		god = sc.nextInt();
		
		if ( (god % 4 == 0 && god % 100 !=0 ) || god % 400 == 0 ) {
			
			System.out.println("Godina " + god + " je prestupna.");
			
		} else {
			
			System.out.println("Godina " + god + " nije prestupna.");
	
		}	
		
		sc.close();
	}

}


