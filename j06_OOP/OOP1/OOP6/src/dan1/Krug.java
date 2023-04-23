package dan1;

public class Krug {
	
	private double poluprecnik;
	
	Krug(double pr) {
		poluprecnik = pr;
		System.out.println("Kreiran je krug poluprečnika " + poluprecnik);
	}
	
	public double povrsina() {
		return 3.14 * poluprecnik * poluprecnik;
	}

}
