package dan1;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// a >=0  => y = min(a,b), inače y = 2min(a,b)
		
		double a, b, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dva broja ");
		System.out.print("a = ");
		a = sc.nextDouble();		
		System.out.print("b = ");
		b = sc.nextDouble();
		
		if (a >= 0 )
			y = Math.min(a, b);
		else
			y = 2*Math.min(a, b); 
		System.out.println("Za a = " + a + " b = " + b + " dobija se y = " + y);
		
		sc.close();

	}

}
