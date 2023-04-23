package stek;

public class Krug extends Oblik {
	private double poluprecnik;
	
	Krug(double r) {
		poluprecnik = r;
	}
	
	public double uzmiPovrsinu() {
		povrsina = Math.PI * poluprecnik * poluprecnik;
		return povrsina;
		//povrsina je nasleđena iz oblika
	}
}