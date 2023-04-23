package paket;

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
 * 
 * Komplikovana verzija (nije "ispeglano" do kraja; RADI)
 *
 */

public class TestOsobe {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Osoba osoba[] = new Osoba[3];
		Djak djak[] = new Djak[3];
		Zaposleni radnik[] = new Zaposleni[3];
		osoba[0] = new Osoba("Petar Petrović", "14.05.1987", "Beograd, Beogradska 85");
		osoba[1] = new Osoba("Jovan Jovanović", "01.01.2005.", "Čačak, Moravska 10");
		osoba[2] = new Osoba("Milka Mišić", "20.08.2007.", "Požarevac,Svetogorska 18");
		int status = 0;
		
		
		System.out.print("Molim Vas, izjasnite da li ste: ");
		System.out.println("1 - Djak \t 2 - Zaposlen-i/a \t 3 - Ostalo (neizjašnjeno)");
		
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print("\n" + osoba[i].getIme() + ", Vi ste? - ");
				status = Integer.parseInt(bf.readLine());
				
				switch(status) {
					case 1:
						// djak - ucenik - student
						djak[i] = new Djak();
						djak[i].setDjak(osoba[i]);
						djak[i].prikaziDjaka();
						break;
					case 2:
						// zaposleni
						radnik[i] = new Zaposleni();
						radnik[i].setZaposleni(osoba[i]);
						radnik[i].prikaziZaposlenog();
						break;
					case 3:
						// neizjašeno ili pogrešan unos koji može da se pretvori u int
					default:
						osoba[i].prikaziOsobu();					
				}
			}
			catch(NumberFormatException e) {
				// bilo koji unos koji ne može u int
				osoba[i].prikaziOsobu();
			}
		}
		
	}

}
