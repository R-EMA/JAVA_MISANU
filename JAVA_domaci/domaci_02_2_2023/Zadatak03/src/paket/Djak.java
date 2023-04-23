package paket;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author emma
 * 
 * Zadatak 1. - Klasa Djak
 * Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa. 
 * 
 * pojednostavljenje:
 * škola - kao jedan podataka (bez dodatnih podataka npr da li je reč o osnovnoj ili srednjoj školi)
 * razred - vrednosti od 1 do 8
 */

public class Djak extends Osoba {
	
	private String skola;
	private int razred;
	
	public Djak() {
		
	}
	
	public Djak(String ime, String datum, String adresa, String skola, int razred) {
		super(ime, datum, adresa);
		this.skola = skola;
		this.razred = razred;
	}
	
	public Djak(Osoba o, String skola, int razred) {
		super(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		this.skola = skola;
		this.razred = razred;
	}
	
	// metod za unos/ažuriranje svih podataka o osobi, sličan je konstruktoru
	public void setDjak(String ime, String datum, String adresa, String skola, int razred) {
		super.setOsoba(ime,datum,adresa);
		this.skola = skola;
		this.razred = razred;
	}
	
	public void setDjak(Osoba o, String skola, int razred) {
		super.setOsoba(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		this.skola = skola;
		this.razred = razred;
	}
	
	// metod za unos/ažuriranje svih podataka o osobi, unos sa tastature
	public void setDjak() throws Exception {		
		super.setOsoba();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Škola: ");
		this.skola = bf.readLine();
		
		System.out.print("Razred: ");
		this.razred = Integer.parseInt(bf.readLine());
	}
	
	public void setDjak(Osoba o) throws Exception  {
		super.setOsoba(o.getIme(),o.getDatumRodjenja(), o.getAdresa());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Škola: ");
		this.skola = bf.readLine();
		
		System.out.print("Razred: ");
		this.razred = Integer.parseInt(bf.readLine());
		
	}
	
	//geteri i seteri Đaka
	public String getSkola() {
		return skola;
	}

	public void setSkola(String skola) {
		this.skola = skola;
	}

	public int getRazred() {
		return razred;
	}

	public void setRazred(int razred) {
		this.razred = razred;
	}

	
	// metod za prikaz podataka o djaku
	public void prikaziDjaka() {
		super.prikaziOsobu();
		System.out.println(				
				"Škola:           " + skola + 
				"\nRazred:          " + razred
		);
	}	
	
		
}
