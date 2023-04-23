package dan2;

public class Main {

	public static void main(String[] args) {
		// 
		
		Box b = new Box();
		b.duzina = 10;
		b.sirina = 15;
		b.visina = 20;
		
		double zapremina = b.duzina * b.sirina * b.visina;
		
		System.out.println("Zapremina kvadra je: " + zapremina);
				

	}

}
