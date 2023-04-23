package dan1;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		double a, b, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dva broja ");
		System.out.print("a = ");
		a = sc.nextDouble();		
		System.out.print("b = ");
		b = sc.nextDouble();
		
		if( a >=0 ) {
			if ( 1 + Math.max(a,b) != 0) {
				y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
			}
			else {
				System.out.println("Greška! Deljenje nulom nije dozvoljeno.");
				y = 0;
			}
		}
		else {
			y = Math.min(a, b) / (Math.min(a*a, b*b) + 3);
		}
		System.out.println("Za a = " + a + " b = " + b + " dobija se y = " + y);

		
		sc.close();
	}

}
