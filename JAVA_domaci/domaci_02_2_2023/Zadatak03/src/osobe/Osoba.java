package osobe;

/**
 * 
 * @author emma
 * 
 * Zadatak 1. - Klasa Osoba
 * Podatke o osobi čine ime, datum rođenja i adresa stanovanja.
 * 
 * max pojednostavljena verzija
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
	
}
