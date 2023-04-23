package osobe;

/**
 * 
 * @author emma
 * 
 * Zadatak 1. - Klasa Djak
 * Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa. 
 * 
 * max pojednostavljeno
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
	
	public Djak(Osoba o) {
		super(o.getIme(),o.getDatumRodjenja(), o.getAdresa());	
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
		//super.prikaziOsobu();
		System.out.println(				
				"Škola:           " + skola + 
				"\nRazred:          " + razred
		);
	}	
	
		
}
