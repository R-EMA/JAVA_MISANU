package dan2;

public class Box {
		
	private double duzina;
	private double sirina;
	private double visina;
	
	Box() {
		duzina = 1;
		sirina = 1;
		visina = 1;
	}
	
	Box(double duzina, double sirina, double visina) {
		this.duzina = duzina;
		this.sirina = sirina;
		this.visina = visina;
	}
	
	Box(double len) {
		duzina = sirina = visina = len;
	}
	
	Box(Box b) {
		this.duzina = b.duzina;
		this.sirina = b.sirina;
		this.visina = b.visina;
	}
	
	void initBox(double d, double s, double v) {
		this.duzina = d;
		this.sirina = s;
		this.visina = v;
	}
	
	void zapremina() {
		System.out.println("Zapremina kutije je: " + (this.duzina * this.sirina * this.visina));
	}
	

}
