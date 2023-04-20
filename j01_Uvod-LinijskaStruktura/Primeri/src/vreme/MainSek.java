package vreme;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * pretvara protekle sekunde u formatu sat:min:sek
 *
 */
public class MainSek { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Proteklo sekundi: "); 
		int n = Math.abs(input.nextInt()); 
		int sat = n / 3600; 
		int sek1 = n % 3600; 
		int min = (int) (sek1 / 60); 
		int sek = sek1 % 60; 
		System.out.println("proteklo sati: " + sat); 
		System.out.println("minuta: " + min); 
		System.out.println("sekundi: " + sek); 
		
		input.close();
		
	} 

}