package bmi;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * računanje indeksa telesne mase
 *
 */

public class MainBMI { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		float x, y; 
		float bmi; 
				
		System.out.println("Vaša visina u metrima "); 
		x = input.nextFloat(); 
		System.out.println("Vaša težina u kilogramima "); 
		y = input.nextFloat(); 
		bmi = y/(x*x);
		System.out.println("Vaš BMI je = " + bmi); 
		
		input.close();
	}
}