package paket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author emma
 * 
 * Zadatak 1. - Klasa Osoba
 * Podatke o osobi čine ime, datum rođenja i adresa stanovanja.
 * 
 * pojednostavljenje:
 * ime: kao jedan podatak (u praksi t bi bila dva (tri): ime i prezime (srednje ime-ime roditelja)
 * datum rodjenja: čuva se kao string, od korisnika se očekuje da unese vrednost u formatu dd.mm.yyyy
 * (u prvoj fazi bez kontrole ispravnosti unosa)
 * adresa stanovanja: kao jedan podatak (u praksi to bi bila tri: mesto, ulica i broj)
 *
 */

public class Osoba {
	
	private String ime;
	private String datumRodjenja;
	private String adresa;
	
	public Osoba() {
		
	}
	
	public Osoba(String ime, String datum, String adresa) {
		this.ime = ime;
		this.datumRodjenja = datum;
		this.adresa = adresa;
	}
	
	// metod za unos/ažuriranje svih podataka o osobi, sličan je konstruktoru
	public void setOsoba(String ime, String datum, String adresa) {
		this.ime = ime;
		this.datumRodjenja = datum;
		this.adresa = adresa;
	}
	
	// metod za unos/ažuriranje svih podataka o osobi, unos sa tastature
	public void setOsoba() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean boolRes = false;
		String dateInput;
		
		System.out.println("\nUnesite podatke o osobi: ");
		
		System.out.print("Ime osobe: ");
		this.ime = bf.readLine();
		
		do {
			System.out.print("Datum rođenja (dd.mm.yyyy): ");
			dateInput = bf.readLine();;
			boolRes = this.proveriDatum(dateInput);
		} while(boolRes);
		this.datumRodjenja = dateInput;

		System.out.print("Adresa stanovanja: ");
		this.adresa = bf.readLine();		
	}	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	// metod za prikaz podataka o osobi
	public void prikaziOsobu() {
		System.out.println(
				"\nIme:             " + ime +
				"\nDatum rođenja:   " + datumRodjenja + 
				"\nAdresa:          " + adresa
		);
	}
	
	//pomoćni metod za proveru datuma
	private boolean proveriDatum(String datum) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); 
			Date dds = sdf.parse(datum);
		}
		catch(ParseException e) {
			return true;
		}		
		return false;
	}

}
