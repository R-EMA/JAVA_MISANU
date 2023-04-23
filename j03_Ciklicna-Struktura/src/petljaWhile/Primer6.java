package petljaWhile;

import java.util.Scanner;

public class Primer6 {
	public static void main(String[] args) {
		// while: zbir prirodnih brojeva od k do n (uključujući i granične vrednosti)
		Scanner ulaz = new Scanner(System.in);
		int i, k, n, suma = 0;
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		i = k;
		while (i <= n) {
			suma += i;
			i++;
		}
		System.out.println("Od " + k + " do " + n + " suma = " + suma);
		
		// varijana 2
		suma = 0;
		i = k;
		while (i <= n)
			suma += i++;
		System.out.println("Od " + k + " do " + n + " suma = " + suma);
		
		ulaz.close();
	}
}