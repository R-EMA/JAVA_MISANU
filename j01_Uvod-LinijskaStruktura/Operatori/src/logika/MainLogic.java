package logika;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * logički operatori u logičkom izrazu
 * 
 * && ili &  - logičko I (true+true -> true, sve ostalo false)
 * || ili | - logičko ILI (false+false -> false, sve ostalo true)
 * ! - logičko NE (true->false, false-> true)
 *
 */

public class MainLogic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za x: ");
		boolean x = input.nextBoolean();
		System.out.print("Unesite vrednost za y: ");
		boolean y = input.nextBoolean();
		
		//jednostruki
		boolean z = !(x & y) | x & y;
		System.out.println("y = " + z);
		
		//dvostruki
		z = !(x || y) && !x || y;
		System.out.println("y = " + z);
		
		/*logički operatori
		 * 
		 * jednostruki mogu da se koriste kada se zahteva provera vrednosti sa obe strane
		 * & |
		 * dvostruki se koriste kada se ne zahteva provera vrednosti druge strane
		 * && ||
		 * 
		*/
		
		input.close();
	}
}
