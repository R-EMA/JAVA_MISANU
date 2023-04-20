package cifre;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * rastavljanje dvocifrenog broja na jedinice i desetice 
 * i računanje njihove razlike
 *
 */

public class MainDC { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Cifre dvocifrenog broja "); 
		System.out.println("Dvocifreni broj "); 
		int a = input.nextInt(); 
		int d, j; 
		d = a / 10; 
		j = a % 10; 
		System.out.println("broj = " + a + " " + "cifra jedinica = " + j +" " + "cifra desetica = " + d); 

		int razlika = Math.abs(d - j);
		System.out.println("broj = " + a + " " + " razlika desetice i jedinice = " + razlika); 
		
		input.close();
	} 
	
}