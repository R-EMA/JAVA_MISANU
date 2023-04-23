package dan3;

// apsolutna vrednost broja

public class Abs {
	
	private double x;
		
	Abs(double x) {
		this.x = x;
	}
	
	
	Abs() {} // ne radi ništa, "glumi" podrazumevani konstruktor; mogućnost da se ne unese vrednost
	
	public double abs() {
		if(x >= 0) 
			return x;
		else
			return x*(-1);
		/*
		 * Moglo je i samo: 
		 * return Math.abs(x);
		 */
	}
	
	//nije deo zadatka, pristup jer je osobina lokalna i jer je jedan konstruktor prazan
	public void setX(int x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
}
