package whilee;

import java.util.Scanner;

public class Zadatak15 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednosti deljive brojem 3");
		int a = 3; /* za siguran ulazak u petlju jer je najmanji prirodni broj deljiv sa 3 */
		int suma = 0, brojac = 0;
		while (a % 3 == 0) {
			System.out.println("Unesite vrednost za a:");
			a = ulaz.nextInt();
			if (a > 5 && a < 20) {
				suma += a;
				brojac++;
			}			
		}
		if (brojac != 0) {
			double sr = (double) suma / brojac;
			System.out.println("Aritmetička sredina je " + sr);
		}
		else 
			System.out.println("Unete su neodgovarajuće vrednosti. ");
		
		ulaz.close();
	}
}