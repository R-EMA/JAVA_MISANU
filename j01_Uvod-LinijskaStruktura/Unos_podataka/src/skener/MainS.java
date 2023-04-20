package skener;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * Jednostavna primena Scanner-a za unos podataka
 * (int i String)
 *
 */

public class MainS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("\nKako se zovete: ");
		String ime = "IME";
		ime = sc.nextLine();
		System.out.println("Vi se zovete " + ime);
		
		System.out.print("Koliko imate godina: ");
		int brojGodina = sc.nextInt();
		System.out.println("\nVi imate " + brojGodina + " godina");
		
		sc.close();

	}

}
