package podrazumevano;

/**
 * 
 * @author emma
 * 
 * implicitna (podrazumevana) konverzija tipova podataka
 * ovde: int -> double (dodaje .0 // decimale)
 *
 */

public class MainImpl {

	public static void main(String[] args) {
		
		int i = 10; 
		double d = i; 
		
		System.out.println("i " + i); 
		System.out.println("d " + d);

	}

}
