package petljaFor;

import java.util.Scanner;

public class Primer6 {

	public static void main(String[] args) {
		// računanje izraza S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)
		/*
		 	n = 2, m = 5
		 	S = n*(n+m)*(n+2m)*(n+3m)*(n+4m)*(n+5m) 
		 	  = 2*(2+5)*(2+2*5)*(2+3*5)*(2+4*5)*(2+5*5)
		 	  = 2*7*(2+10)*(2+15)*(2+20)*(2+25)
		 	  = 2*7*12*17*22*25
		 	  = 1696464
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		long s = 1L;
		
		System.out.print("Unesite vrednost prirodnog broja N: ");
		n = sc.nextInt();
		System.out.print("Unesite vrednost prirodnog broja M: ");
		m = sc.nextInt();
		s = n;
		for (int i = 1; i<=m; i++) {
			s = s * (n + i * m);
		}
		System.out.println("Vrednost izraza S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m) je " + s);

	}

}
