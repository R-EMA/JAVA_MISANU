package petljaDoWhile;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {
		// do while: suma 1/2 + 1/4 ...
		
		Scanner ulaz = new Scanner(System.in);
		
		// while...
		int i=1, n;
		double s = 0.0d;
		
		System.out.print("Unesite vrednost za n ");
		n = ulaz.nextInt();
		while(i<=n) {
			s += (double) 1 / (i*2);
			i++;
		}
		System.out.println("\nRezulat: " + s);
		
		// do while ...
		i = 1;
		s = 0;
		do {
			s += (double) 1 / (i*2);
			i++;
		} while (i<=n);
		System.out.println("\nRezulat: " + s);
		
		// for ...
		s = 0;
		for (int j=1; j<=n; j++) {
			s += (double) 1 / (j*2);
		}
		System.out.println("\nRezulat: " + s);
		ulaz.close();

	}

}
