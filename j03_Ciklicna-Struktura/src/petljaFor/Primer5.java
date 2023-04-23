package petljaFor;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		// faktorijel: f = 1*2*3*4*5*,...*n
		
		Scanner sc = new Scanner(System.in);
		int n;
		long faktor = 1L;
		
		System.out.println("Za koliko prirodnih brojeva želite da izračunate faktorijel? ");
		n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			faktor *= i;			
		}
		System.out.println("Faktorijel broja " + n + " je " + faktor);
	}

}
