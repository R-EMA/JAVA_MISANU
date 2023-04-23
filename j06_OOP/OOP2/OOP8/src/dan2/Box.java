package dan2;

public class Box {
		
	private double duzina;
	private double sirina;
	private double visina;
	
	Box() {
		duzina = 10;
		sirina = 10;
		visina = 10;
	}
	
	Box(double duzina, double sirina, double visina) {
		this.duzina = duzina;
		this.sirina = sirina;
		this.visina = visina;
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
