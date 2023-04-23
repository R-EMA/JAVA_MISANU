package dan4;

public class Tacka {
	
	int x, y;
	
	Tacka() {
		x = 0;
		y = 0;
	}
	
	Tacka(int x) {
		this.x = x;		
	}
	
	
	Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double dist() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double rastojanje(Tacka t) {
		return Math.sqrt(Math.pow(x-t.x,2) + Math.pow(x-t.x,2));
	}
	
	
	// da ne bih u main kucala više puta :)
	public void info() {
		System.out.println("Tačka (" + x + "," + y + ") je udaljena " + this.dist() + " jedinica od koordinatnog početka");
	}
	

}
