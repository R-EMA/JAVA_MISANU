package tacke;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * rastojanje dve tačke u 2D koordinatom sistemu
 *
 */

public class MainT { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Unesite koordinate tačke M: "); 
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		System.out.println("Unesite koordinate tačke N: "); 
		double x2 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); 
		System.out.println("Rastojanje između tačaka M (" + x1 + "," + y1 + ") i N (" + x2 + "," + y2 + ") je " + d);
		
		input.close();
		
	} 
	
}