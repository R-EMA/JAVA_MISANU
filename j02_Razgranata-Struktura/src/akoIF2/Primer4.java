package akoIF2;

import java.util.Scanner;

public class Primer4 {
	
	public static void main(String[] args) {
		
		/* rešavanje funkcije, zadatak 3 */
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		byte y = 0;
		
		System.out.print("Unesite vrednost za broj x .... ");
		
		x = sc.nextByte();
		
		if ( x < 0) {
			
			y = -1;
			
		} else if ( x == 0 ) {
			
			y = 0;
			
		
		} else if ( x >0 ) {
			
			y = 1;		
		
		} 
		
		System.out.println(" Za uneto x = " + x + " y = " + y);
			
		sc.close();
	}

}


