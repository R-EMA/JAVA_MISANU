package zapremina;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * konvertovanje galon -> litar
 *
 */

public class MainGL { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner (System.in); 
		System.out.print("Unesite zapreminu u galonima: "); 
		double g = input.nextDouble(); 
		System.out.println("Zapremina u litrima je: " + (g * 4.54)); 
		
		input.close();
	} 
	
}