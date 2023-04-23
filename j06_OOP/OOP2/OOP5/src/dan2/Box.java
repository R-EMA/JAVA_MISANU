package dan2;

public class Box {
		
	private double duzina;
	private double sirina;
	private double visina;
	
	Box() {
		
	}
	
	
	Box(double d, double s, double v) {
		this.duzina = d;
		this.sirina = s;
		this.visina = v;
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
