package petljaWhile;

import java.util.Scanner;

public class Primer3 {
	public static void main(String[] args) {
		// while ... suma reciprocnih vrednosti: 1/1 + 1/2 + ... + 1/n
		Scanner ulaz = new Scanner(System.in);
		int n, i = 1;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);
		
		// isto sa for ...
		s = 0;
		for (int j = 1; j<=n; j++ ) {
			s += (double) 1 / j;
		}
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);

		ulaz.close();
	}
}