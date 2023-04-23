package p2;

/*
 * prva linija koda mora biti naziv pripadajućeg pameta
 * zatim ide importovanje paketa
 * pa klasa, jedna jedina
*/

import p1.Prva; // importovanje jedne klase iz korisničkog paketa; za sve može: import p1.*;

public class Main {

	public static void main(String[] args) {
		
		Prva p1 = new Prva();
		p1.pogled();

	}

}
