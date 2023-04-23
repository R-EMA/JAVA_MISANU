package dan3;

public class Main {

	public static void main(String[] args) {
		// tačka
		
		Tacka t = new Tacka(10,5);
		
		System.out.println("x = " + t.getX());
		System.out.println("y = " + t.getY());
		
		t.ispisi();
		
		System.out.println(t.ispisiXY());

	}

}
