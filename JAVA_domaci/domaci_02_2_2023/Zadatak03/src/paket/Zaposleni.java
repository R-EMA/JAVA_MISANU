package paket;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
	
	// metod-i za unos slični konstruktorima
	public void setDjak(String ime, String datum, String adresa, String nazivFirme, String nazivOdeljenja) {
		super.setOsoba(ime,datum,adresa);
		this.nazivFirme = nazivFirme;
		this.nazivOdeljenja = nazivOdeljenja;
	}
	
	public void setZaposleni(Osoba o, String nazivFirme, String nazivOdeljenja) {
		super.setOsoba(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		this.nazivFirme = nazivFirme;
		this.nazivOdeljenja = nazivOdeljenja;
	}
	
	// metod za unos/ažuriranje svih podataka o osobi, unos sa tastature
	public void setZaposleni() throws Exception {		
		super.setOsoba();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Naziv firme: ");
		this.nazivFirme = bf.readLine();
		
		System.out.print("Naziv odeljenja: ");
		this.nazivOdeljenja = bf.readLine();
	}
	
	public void setZaposleni(Osoba o) throws Exception {
		super.setOsoba(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Naziv firme: ");
		this.nazivFirme = bf.readLine();
		
		System.out.print("Naziv odeljenja: ");
		this.nazivOdeljenja = bf.readLine();
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
		super.prikaziOsobu();
		System.out.println(
				"Naziv firme:     " + nazivFirme +
				"\nNaziv odeljenja: " + nazivOdeljenja
		);
	}

	
}
