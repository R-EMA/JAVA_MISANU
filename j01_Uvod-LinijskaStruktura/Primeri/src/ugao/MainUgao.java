package ugao;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * sinus i kosinus ugla
 *
 */
public class MainUgao { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Unesite vrednost ugla u radijanima: "); 
		double x=input.nextDouble(); 
		System.out.println("Sinus zadatog ugla je: " + Math.sin(x)); 
		System.out.print("Kosinus zadatog ugla je: " + Math.cos(x)); 
		
		input.close();
	} 
}