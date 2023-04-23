package dan3;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// osoba
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Osoba o1 = new Osoba();
		
		System.out.print("Ime: ");
		o1.ime = bf.readLine();		
		System.out.print("Datum rođenja: ");
		o1.datum = bf.readLine();
		System.out.print("Adresa stanovanja: ");
		o1.adresa = bf.readLine();
		
		o1.ispisi();
	}

}
