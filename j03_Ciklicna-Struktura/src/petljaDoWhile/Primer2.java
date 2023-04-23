package petljaDoWhile;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		// do while: 1na2+3na2+...
				
		int i=1, n, s = 0;
		
		Scanner ulaz = new Scanner(System.in);
					
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		//while
		while( i<=n) {
			s += Math.pow(i, 2);
			i+=2;
		}
		System.out.println("\nRezulat: " + s);
		
		// do while 
		i = 0;
		s = 0;
		do {
			if (i % 2 != 0) 
				s += Math.pow(i, 2);
			i++;
		} while( i <= n );
		System.out.println("\nRezulat: " + s);
		
		ulaz.close();

	}

}
