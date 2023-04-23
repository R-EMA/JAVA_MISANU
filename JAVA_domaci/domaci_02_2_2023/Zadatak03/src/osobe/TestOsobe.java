package osobe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author emma
 * 
 * Zadatak 3. Podatke o osobi čine ime, datum rođenja i adresa stanovanja. 
 * Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa. 
 * Zaposlen je osoba za koju se dodatno zna naziv firme i naziv odeljenja u kome radi. 
 * Napisati klase koje omogućavaju unificiranu obradu podataka o nabrojanim kategorijama osoba.
 * Predvideti unošenje podataka u objekte čitanjem s glavnom ulaza i sastavljanjem tekstualnog opisa objekata. 
 * Napisati main klasu za ispitivanje navedenih klasa.
 * 
 * max pojednostavljena verzija
 * omogućen unos podataka sa tastature kroz Main
 *
 */

public class TestOsobe {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Osoba janeDoe = new Osoba("Jane Doe","01.01.1990","unknown");
		Osoba osoba = new Osoba();
		String zanimanje = "4"; // Zašto String? - Da bi se sprečile greške unosa :)
		
		//info of janeDoe
		janeDoe.prikaziOsobu();
		
		//upoznavanje sa drugom osobom kroz unos vrednosti
		System.out.print("\nIme: ");
		osoba.setIme(bf.readLine());
		System.out.print("Datum rođenja (dd.mm.yyyy): ");
		osoba.setDatumRodjenja(bf.readLine());
		System.out.print("Adresa stanovanja: ");
		osoba.setAdresa(bf.readLine());
		System.out.print("Status ( 1 - ucenik/student; 2 - zaposlen; 3 - oba; 4 - ostalo):  ");
		zanimanje = bf.readLine();
		System.out.println("");
		switch(zanimanje) {
			case "1":
				// ucenik-student
				Djak djak1 = new Djak(osoba);
				System.out.print("Naziv škole: ");
				djak1.setSkola(bf.readLine());
				System.out.print("Razred: ");
				djak1.setRazred(Integer.parseInt(bf.readLine()));
				djak1.prikaziOsobu();
				djak1.prikaziDjaka();
				break;
			case "2":
				// zaposleni
				Zaposleni radnik1 = new Zaposleni(osoba);
				System.out.print("Naziv preduzeća: ");
				radnik1.setNazivFirme(bf.readLine());
				System.out.print("Razred: ");
				radnik1.setNazivOdeljenja(bf.readLine());
				radnik1.prikaziOsobu();
				radnik1.prikaziZaposlenog();
				break;
			case "3":
				// radi i uci   
				Djak djak = new Djak(osoba);
				Zaposleni radnik = new Zaposleni(osoba);
				System.out.print("Naziv škole: ");
				djak.setSkola(bf.readLine());
				System.out.print("Razred: ");
				djak.setRazred(Integer.parseInt(bf.readLine()));
				System.out.print("Naziv preduzeća: ");
				radnik.setNazivFirme(bf.readLine());
				System.out.print("Naziv odeljenja: ");
				radnik.setNazivOdeljenja(bf.readLine());
				djak.prikaziOsobu();
				djak.prikaziDjaka();		
				radnik.prikaziZaposlenog();
				break;
			case "4":
				// neizjašnjeno ili
			default:
				// pogrešan unos
				osoba.prikaziOsobu();	
				System.out.print("Zanimanje:       nepoznato");
		}		

	}

}
