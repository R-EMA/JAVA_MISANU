package pravouganik;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * računanje dijagonale pravouganika ako su poznate njegove stranice
 *
 */

public class MainPr { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Unesite vrednost stranice pravougaonika a: "); 
		double a = input.nextDouble(); 
		System.out.println("Unesite vrednost stranice pravougaonika b: "); 
		double b = input.nextDouble(); 
		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b)); 
		
		input.close();
	} 
	
}