package demo;

public class Rect {
	
	/*
	 * demonstracija rada sa pravouganikom
	 * definisanje (dimenzije)
	 * računanje površine
	 * računanje obima
	 * računanje dijagonale
	 * 
	 * i upotreba privatne statičke osobine kao brojača objekata
	 * (ovaj brojač dele svi konstruktori objekta i važi za jednu "sesiju", tj. jedno izvršavanje programa)
	 * 
	 */
	
	private double a; //dužina
	private double b; //širina
	private static int broj;  // brojač instanci
	
	//konstruktori
	Rect()   {
		System.out.println("Kreiran je " + (++broj) + ". pravougapnik.");
	}
	Rect(double a)   {
		// za kvadrat
		this.a = a;
		this.b = a;
		System.out.println("Kreiran je " + (++broj) + ". pravougaonik (kvadrat) stranice " + this.a + ".");

	}
	Rect(double a, double b)   {
		// za pravougaonik
		this.a = a;
		this.b = b;
		System.out.println("Kreiran je " + (++broj) + ". pravougaonik stranica " + this.a + " x " + this.b + ".");
	}
	
	//set-get a
	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return a;
	}
	//set-get b
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return b;
	}
	
	// površina
	public double povrsina() {
		return a*b;
	}
	
	// obim
	public double obim() {
		return 2*(a+b);
	}
	
	//dijagonala
	public double d() {
		return Math.sqrt(a*a + b*b);
	}
	
	//informacije o pravougaoniku
	public void info() {
		if (a == b)
			System.out.println("Dužina stranice kvadrata je " + a + ".");
		else
			System.out.println("Pravougaonik je dimenzija " + a + " x " + b + ".");
	}

}
