package whilee;

import java.util.Scanner;

public class Zadatak4a {
	public static void main(String[] args) {
		// suma najviše 10 parnih brojeva ili dok korisnik ne unese nulu
		Scanner ulaz = new Scanner(System.in);
		int s = 0, i = 0;
		while (i < 10) {
			System.out.println("Unesite vrednost broja:");
			int br = ulaz.nextInt();
			if (br == 0) {
				System.out.println("Korisnik je uneo cifru 0");
				break;
			}
			else if (br % 2 == 0) {
				s += br;
				i++;
			}
		}
		System.out.println("Sumirano je " + i + " parnih brojeva.");
		System.out.println("i = " + i + " s = " + s);
		ulaz.close();
	}
}