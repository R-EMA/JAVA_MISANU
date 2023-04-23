package predmeti;

//import java.text.DecimalFormat;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - klasa Sfera
 * Sfera je predmet zadat poluprečnikom. 
 * Predvideti inicijalizaciju zadatim vrednostima parametara (podrazumevano 1), 
 * ..., izračunavanje zapremine, ...,  
 * čitanje predmeta sa glavnog ulaza i sastavljanja tekstualnog opisa predmeta. 
 *
 */

public class Sfera extends Predmet {
	
	private double r; // poluprečnik sfere
	
	public Sfera() {
		this.r = 1;
		super.oznakaPredmeta = 'S';
	}
	
	public Sfera(double r)  {
		this.r = r;
		super.oznakaPredmeta = 'S';
	}
		 
	// geter i seter za poluprečnik sfere 
	public double getR() {
		return r; //m
	}

	public void setR(double r) {
		this.r = r; //m
	}
	
	//racunanje zapremine sfere
	public double izracunajZapreminu() {
		return (4.0/3.0) * Math.pow(r, 3) * Math.PI; //m3
	}

	@Override
	public String opisiPredmet() {
		
		double zapremina = this.izracunajZapreminu();
		double masa = super.izracunajTezinu(zapremina);
		
		return super.opisiPredmet() + 
				"Poluprečnik:       " + super.df.format(this.r) + " m \n" +
				"Zapremina:         " + super.df.format(zapremina) + " m3 \n" +
				"Težina:            " + super.df.format(masa) + " kg";
	}	

}
