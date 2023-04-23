/**
 * 
 */
package paket;

/**
 * @author emma
 * 
 * Zadatak 1.
 * Napisati program koji će generisati i ispisati po jedan broj sledećih tipova: 
 * Int, Float, Boolean, Double, Byte.
 *
 */
public class Main {

	public static void main(String[] args) {
		// numbers & booleans
		
		// deklaracije sa inicijalizacijama
		byte xByte = 8; // Byte
		int xInt = 88; // Int-eger
		long xLong = 888L; // Long
		float xFloat = 88.88f; // Float
		double xDouble = 88.88e3d; // Double
		boolean xBool = true; // Boolean 
		
		// prikaz
		System.out.println("Byte:    " + xByte);
		System.out.println("Integer: " + xInt);
		System.out.println("Long:    " + xLong);
		System.out.println("Float:   " + xFloat);
		System.out.println("Double:  " + xDouble);
		System.out.println("Boolean: " + xBool);
		
	}

}
