package whilee;

import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		int znak = 1;
		double s = 0, s1 = 0;
		int i = 1;
		while (i <= n) {
			s += znak * i / (double) (i + 1);
			s1 += Math.pow(-1, i+1)*i/(i+1);
			znak = -znak;
			i++;
		}
		System.out.println("Suma s = " + s);
		System.out.println("Suma s1 = " + s1);
		ulaz.close();
	}
}