package dan1;

public class Main {

	public static void main(String[] args) {
		
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		
		r1.stopala = 14;
		r1.inchi = 9.5;
		
		r2.stopala = 19;
		r2.inchi = 5.5;
		
		System.out.println("Rastojanje 1; " + r1.stopala + "\'- " + r1.inchi + "-\'");
		System.out.println("Rastojanje 2; " + r2.stopala + "\'- " + r2.inchi + "-\'");
	}

}
