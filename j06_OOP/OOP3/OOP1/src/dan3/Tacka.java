package dan3;

public class Tacka {
	
	private double x;
	private double y;
	
	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void ispisi() {
		System.out.println("Koordinate tačke su: (x,y) = (" + x + " , " + y + ").");
	}
	
	// ovo se tražili ... konvertuje u ... string ... vraća TIP string
	public String ispisiXY() {
		return "(" + x + " , " + y + ").";
	}
	 

}
