package vozila;

import java.text.DecimalFormat;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - apstraktna klasa Vozilo
 * Apstraktno vozilo ima zadatu sopstvenu težinu. 
 * Može da se odredi ukupna težina i vučna sila vozila i da se sastavi tekstualni opis vozila. 
 * Vučna sila predstavlja težinu terete koji vozilo može da povuče.
 *
 */

public abstract class Vozilo {
	
	protected double tezinaVozila;
	protected double vucnaSila;
	protected DecimalFormat df = new DecimalFormat("##0.00");
	
	public Vozilo() {}
	
	public Vozilo(double t) {
		this.tezinaVozila = t;
	}

	public double getVucnaSila() {
		return vucnaSila;
	}
	public void setVucnaSila(double vucnaSila) {
		this.vucnaSila = vucnaSila;
	}
	
		
	public double getTezinaVozila() {
		return tezinaVozila;
	}
	public void setTezinaVozila(double tezinaVozila) {
		this.tezinaVozila = tezinaVozila;
	}

	//ukupna tezina vozila je zbir njegove tezine i tezine pridruzenih vozila i tereta (ako postoji)
	public abstract double ukupnaTezina();
	
	public abstract String toString();

}
