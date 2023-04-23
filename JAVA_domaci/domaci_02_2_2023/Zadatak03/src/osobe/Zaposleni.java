package osobe;

/**
 * 
 * @author emma
 * 
 * Zadatak 1. - Klasa Zaposleni
 * Zaposlen je osoba za koju se dodatno zna naziv firme i naziv odeljenja u kome radi.
 * 
 * 
 */

public class Zaposleni extends Osoba {
	
	private String nazivFirme;
	private String nazivOdeljenja;
	
	public Zaposleni() {
		
	}
	
	public Zaposleni(String ime, String datum, String adresa, String nazivFirme, String nazivOdeljenja) {
		super(ime,datum,adresa);
		this.nazivFirme = nazivFirme;
		this.nazivOdeljenja = nazivOdeljenja;
	}
	
	public Zaposleni(Osoba o, String nazivFirme, String nazivOdeljenja) {
		super(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		this.nazivFirme = nazivFirme;
		this.nazivOdeljenja = nazivOdeljenja;
	}
	
	public Zaposleni(Osoba o) {
		super(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
	}
	
	// geteri i seteri
	public String getNazivFirme() {
		return nazivFirme;
	}

	public void setNazivFirme(String nazivFirme) {
		this.nazivFirme = nazivFirme;
	}

	public String getNazivOdeljenja() {
		return nazivOdeljenja;
	}

	public void setNazivOdeljenja(String nazivOdeljenja) {
		this.nazivOdeljenja = nazivOdeljenja;
	}

	// metod za prikaz podataka o osobi
	public void prikaziZaposlenog() {
		//super.prikaziOsobu();
		System.out.println(
				"Naziv firme:     " + nazivFirme +
				"\nNaziv odeljenja: " + nazivOdeljenja
		);
	}

	
}
