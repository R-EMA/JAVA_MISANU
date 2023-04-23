package akoIFuIF;

import java.util.Scanner;


public class Primer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		int br1 = sc.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		int br2 = sc.nextInt();
		
		System.out.print("Unesite treći broj: ");
		int br3 = sc.nextInt();
		
		int najveciBroj = 0;
		
		if (br1 > br2) {
			if (br1 > br3) {
				najveciBroj = br1;
			}
			else {
				najveciBroj = br3;
			}
		}
		else {
			if (br2 > br3) {
				najveciBroj = br2;
			}
			else {
				najveciBroj = br3;
			}			
		}
		
		System.out.println("Najveći broj je: " + najveciBroj);
		
		sc.close();

	}

}
