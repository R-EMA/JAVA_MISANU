package adapter;

public class Main {
	
	static void testPatka(Patka patka) {
	    patka.kvace();
	    patka.leti();
	}

	public static void main(String[] args) {
		DivljaPatka patka = new DivljaPatka();
		Curka curka = new DivljaCurka();

		//umpotavamo Curku u CurkaAdapter zahvaljujući kome će izgledati kao Patka
		Patka curkaAdapter = new CurkaAdapter(curka);

		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
		
		//test patka
		System.out.println("test patke");
		testPatka(patka);
		
		//ćurka kao patka
		System.out.println("Ćurka kao patka");
		testPatka(curkaAdapter); // metod test patka ne zna da mu je podmetnuta ćurka

	}

}
