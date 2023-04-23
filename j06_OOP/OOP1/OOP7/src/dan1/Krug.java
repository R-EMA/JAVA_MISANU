package dan1;

public class Krug {
	
	private double poluprecnik;
	
	Krug() {
		System.out.println("Kreiran je podrazumevani krug poluprečnika 0");
		poluprecnik = 0.0;
	}

	Krug(double pr) {
		this.poluprecnik = pr;
		System.out.println("Kreiran je krug poluprečnika " + this.poluprecnik);
	}
	
	public double povrsina() {
		return 3.14 * poluprecnik * poluprecnik;
		/* moglo je i kao:
		 return 3.14 * this.poluprecnik * this.poluprecnik; */
	}
}
