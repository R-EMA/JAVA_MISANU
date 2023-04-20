package trougao;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * provera da li duži mogu da čine stranice trougla
 *
 */

public class MainST {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite stranicu trougla x: ");
		int x = input.nextInt();
		System.out.print("Unesite stranicu trougla y: ");
		int y = input.nextInt();
		System.out.print("Unesite stranicu trougla z: ");
		int z = input.nextInt();
		boolean p = (x + y > z) && (x + z > y) && (y + z > x);
		System.out.println("p = " + p);
		
		input.close();
	}
}
