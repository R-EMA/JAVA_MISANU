package paket;

public class Main {

	public static void main(String[] args) {
		// primena jednostavne generičke klase A
		
		
		// integer
		A<Integer> intObj = new A<Integer>(100);
		// testmetoda
		intObj.prikaziTip();
		int vrednostIntObj = intObj.getOb();
		System.out.println("Vrednost: " + vrednostIntObj);
		
		
		// string
		A<String> strObj = new A<String>("tekst");
		strObj.prikaziTip();
		String vrednostStrObj = strObj.getOb();
		System.out.println("Vrednost: " + vrednostStrObj);

	}

}
