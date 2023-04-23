package petljaWhile;

import java.util.Scanner;

public class Primer7 {
	public static void main(String[] args) {
		// while: suma max dvocifrenih brojeva koji se završavaju sa 8
		Scanner ulaz = new Scanner(System.in);
		int n, i = 1, s = 0;
		System.out.println("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		while (i <= n) {
			if (i % 10 == 8) {
				System.out.print(i + " ");
				s += i;
			}
			i++;
		}
		System.out.println("\nSuma je " + s);
		ulaz.close();
	}
}