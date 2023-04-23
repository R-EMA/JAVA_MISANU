/**
 * 
 */
package dan1;

/**
 * @author ema
 * 
 */

import java.io.*;

public class Zadatak2 {

	/**
	  * ako je a parno => b = (a-1) na 2
	  * ako je a neparno => b = 1/a
	  * a > 0, prirodan broj
	 */
	public static void main(String[] args) throws Exception {
		
		int a;
		double b;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite prirodan broj (ceo broj veći od nule): ");
		a = Integer.parseInt(bf.readLine());
		
		if ( a > 0 ) {
			if ( a % 2 == 0 ) 
				b = Math.pow(a-1, 2);
			else
				b = (double) 1/a;
			System.out.println("Za unetu vrednost " + a  + " rezultat je " + b);			
		}
		else {
			System.out.println("\nGreška! Niste uneli prirodan broj!");
		}
	}

}
