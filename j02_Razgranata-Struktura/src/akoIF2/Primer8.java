package akoIF2;

import java.util.Scanner;

public class Primer8 {
	
	public static void main(String[] args) {
		
		/* ocenjivanje, zadatak 6  */
		
		Scanner sc = new Scanner(System.in);
		
		int bod, ocena;
		
		ocena = 0;
				
		System.out.print("Unesite broj osvojenih bodova na testu .... ");
		
		bod = sc.nextInt();
		
		if ( bod > 0 && bod <= 49 ) {
			
			ocena = 1;
			
		} else if (bod >= 50 && bod <= 60 ) {
			
			ocena = 2;
		} else if (bod >= 61 && bod <= 70 ) {
			
			ocena = 3;
		} else if (bod >= 71 && bod <= 80 ) {
			
			ocena = 4;
		} else if (bod >= 81 && bod <= 100 ) {
			
			ocena = 5;
		} else {
			
			System.out.println("Greška! Proverite unos.");
		}
		
		System.out.println("Učenik je ostvario " + bod + " bodova na testu i dobio je ocenu " + ocena);
		
		
		sc.close();
	}

}


