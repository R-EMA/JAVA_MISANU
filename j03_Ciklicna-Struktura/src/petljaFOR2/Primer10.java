package petljaFOR2;

import java.util.Scanner;

public class Primer10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double a, y = 0.0d;
		System.out.println("Unesite broj ponavljanja: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost broja a: ");
			a = input.nextDouble();
			
			if (a > 0)
				y = Math.sqrt(a);
			else
				y = a*a;
			System.out.println("Za unetu vrednost a = " + a + " dobija se y = " + y);
		}
		input.close();
	}
}