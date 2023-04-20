package trazeno;

/**
 * 
 * @author emma
 * 
 * primena cast operatora
 * eksplicitna (na zahtev) konverzija tipova podataka
 * ovde: double -> int (odbacuje decimale)
 *
 */

public class MainExpl {

	public static void main(String[] args) {
		double d = 10.82d; 
		
		int i = (int) d; 
		
		System.out.println("d " + d); 
		System.out.println("i " + i);

	}

}
