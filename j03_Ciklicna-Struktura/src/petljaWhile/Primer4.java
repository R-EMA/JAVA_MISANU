package petljaWhile;

import java.util.Scanner;

public class Primer4 {
	public static void main(String[] args) {
		// štampanje neparnih brojeva
		Scanner ulaz = new Scanner(System.in);
		int n;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		int i = 1;
		while (i <= n) {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		}
		ulaz.close();
	}
}