package inci;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * pretvaranje dužine izražene u inčima u cm
 *
 */
public class MainCI { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner (System.in); 
		System.out.print("Unesite dužinu u inčima: "); 
		double g = input.nextDouble(); 
		System.out.println("Dužina u centimetrima je : " + (g * 2.54)); 
		
		input.close();
		
	} 
	
}