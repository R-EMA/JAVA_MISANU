package dan1;

public class Krug {
	
	//korisnički konstruktor
	
	private int poluprecnik;
	
	// konstruktor
	Krug() {
		System.out.println("Kreiran je novi krug inicijalne vrednosti poluprečnika 10!");
		poluprecnik = 10;
	}
	
	public void setPoluprecnik(int pr) {
		poluprecnik = pr;
	}
	
	public int getPoluprecnik() {
		return poluprecnik;
	}
	
	public double povrsina() {
		return 3.14 * poluprecnik * poluprecnik;
	}

}
