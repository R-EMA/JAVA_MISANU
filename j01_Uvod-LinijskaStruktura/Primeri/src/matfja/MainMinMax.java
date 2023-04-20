package matfja;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * matematičke funkcije Math.min (manja vrednost) i Math.min (veća vrednost)
 *
 */

public class MainMinMax {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		System.out.println("y = " + (5 + Math.max(a * a, b * b)));
		
		double y = (1-Math.min(a,b))/(1+Math.max(a,b));
		System.out.println(y);
		
		input.close();
	}
	
}