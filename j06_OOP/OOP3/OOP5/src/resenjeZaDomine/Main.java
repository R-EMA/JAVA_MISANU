package resenjeZaDomine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Kreiranje objekata tj. domina */
		int a, b;
		System.out.println("Unesite vrednosti a i b za prvu dominu:");
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		Domina d1 = new Domina(a, b);

		System.out.println("\nUnesite vrednosti a i b za drugu dominu:");
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		Domina d2 = new Domina(a, b);

		sc.close();

		/* Štampanje izgleda domina */
		System.out.println("\nPrva domina: " + d1.tekstualniOpis());
		System.out.println("Druga domina: " + d2.tekstualniOpis());

		/* Koristimo metodu klase Domina `ista(Domina d)` koja vraća boolean vrednost */
		if (d1.ista(d2)) /* true znači da su domine identične */
			System.out.println("\nDomine " + d1.tekstualniOpis() + " i " + d2.tekstualniOpis() + " su identične.");
		else /* false znači da su domine različite */
			System.out.println("\nDomine " + d1.tekstualniOpis() + " i " + d2.tekstualniOpis() + " nisu identične.");

		/*
		 * Pozivamo metodu `okreni()` klase Domina, koja zamenjuje vrednosti za a i b
		 * domine i vraća ih glavnom programu
		 */
		d1.okreni();
		/*
		 * Štampamo novi izgled domine nakon okretanja pozivanjem metode klase Domina
		 * `d1.tekstualniOpis`
		 */
		System.out.println("\nOkrenuta prva domina izgleda ovako " + d1.tekstualniOpis());

		/* Okrećemo drugu dominu i štampamo je */
		d2.okreni();
		System.out.println("Okrenuta druga domina izgleda ovako " + d2.tekstualniOpis());

	}

}
