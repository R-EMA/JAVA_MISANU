package akoIF2;

import java.util.Scanner;

public class Primer6 {
	
	public static void main(String[] args) {
		
		/* rešavanje funkcije, zadatak 4 */
		
		Scanner sc = new Scanner(System.in);
		
		Double x, y;
		
		System.out.print("Unesite vrednost za x .... ");
		
		x = sc.nextDouble();
		
		if ( x > -2 && x <= 2 ) {
			
			y = 5*x;
			
		} else if ( x >= 5 && x < 7 ) {
			
			y = 3*x - 1;
			
		
		} else {
			
			y = 1/x;	
		}	
		
		System.out.println(" Za uneto x = " + x + " vrednost funkcije y(x) = " + y);
			
		sc.close();
	}

}


