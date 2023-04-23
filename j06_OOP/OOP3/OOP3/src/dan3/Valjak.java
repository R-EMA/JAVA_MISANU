package dan3;

public class Valjak {
	
	private double r;
	private double h;
	
	Valjak(double r, double h) {
		this.r = r;
		this.h = h;	
	}
	
	public double getR() {
		return r;
	}
	
	public double getH() {
		return h;
	}
	
	public void ispisi() {
		System.out.println("Valjak visine " + h + " ima poluprečnik " + r);
	}
	
	public double zapremina() {
		return Math.PI * r*r*h; // V = r2PI * H
	}
	
	public double povrsina() {
		return 2*r*Math.PI*(r+h);   // P= 2r2π + 2rπ • H = 2rπ(r+H)
	}

}
