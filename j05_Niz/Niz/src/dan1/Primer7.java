package dan1;

import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {
		// zbir članova koji se završavaju sa 5

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj članova niza: ");
		int n = sc.nextInt();
		int s = 0;
		int niz[] = new int[n];

		// punjenje niza i računanje zbira
		System.out.println("Unesite članove niza:");

		for (int i = 0; i < n; i++) {
			// unos
			System.out.print("x[" + i + "] = ");
			niz[i] = sc.nextInt();
			// obrada
			if (niz[i] % 10 == 5) {
				s += niz[i];
			}
		}
		System.out.println("Zbir 5-tica iznosi " + s);

		sc.close();
	}

}
