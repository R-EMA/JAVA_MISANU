package dan3;

public class Main {

	public static void main(String[] args) {
		// simulacija Math metoda za računanje apsolutne vrednosti broja
		Abs a1 = new Abs(-5);
		Abs a2 = new Abs();
		
		System.out.println("Apsolutna vrednost broja " + a1.getX() + " je " + a1.abs());
		System.out.println("Apsolutna vrednost broja " + a2.getX() + " je " + a2.abs());
		a1.setX(0);
		a2.setX(8);
		System.out.println("Apsolutna vrednost broja " + a1.getX() + " je " + a1.abs());
		System.out.println("Apsolutna vrednost broja " + a2.getX() + " je " + a2.abs());
	}

}
