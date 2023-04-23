package petljaDoWhile;

import java.util.Scanner;

public class Primer3 {
	public static void main(String[] args) {
		// (do) while: s = 1/k+n + ... k = fiksno,n = 0,1,2,...,n
		Scanner ulaz = new Scanner(System.in);
		int n, k;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		int i = 0;
		do {
			s = s + 2 / (double) (k + i);
			++i;
		} while (i <= n);
		System.out.println("Suma je " + s);
		ulaz.close();
	}
}
