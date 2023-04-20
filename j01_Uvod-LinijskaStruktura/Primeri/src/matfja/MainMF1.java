package matfja;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * matematička funkcija, primena ugrađenih matematičkih funkcija
 *
 */

public class MainMF1 { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
				
		double yy, xx;
		System.out.println("Ugao u radijanima ");
		xx = input.nextDouble();		
		yy = Math.sqrt((Math.exp(xx/2) + 1.2*Math.sin(2*xx))/(3.3*Math.cos(xx)-1.7*Math.exp(xx)));
		System.out.println("rezultat "+yy);
		
		input.close();
	}
}