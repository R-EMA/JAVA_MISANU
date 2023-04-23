package dan1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer6 {

	public static void main(String[] args) throws Exception {
		// proizvod cifara članova niza

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite broj članova niza: ");
		int n = Integer.parseInt(bf.readLine());
		int niz[] = new int[n];
		long p = 0L;
		int nc = 0;

		// punjenje niza:
		System.out.println("Unesite " + n + " prirodn-a/ih broj-a/eva");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = Integer.parseInt(bf.readLine());
		}

		// obrada i prikaz rezultata
		for (int i = 0; i < n; i++) {
			p = 1;
			nc = niz[i];
			while (nc > 0) {
				p *= (nc % 10);
				nc /= 10;
			}
			System.out.println("Proizvod cifara člana niza " + niz[i] + " je " + p);
		}
	}

}
