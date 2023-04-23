package petljaFor;

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		// brojevi deljivi sa 3 u zadatom intervalu
		
		Scanner sc = new Scanner(System.in);
		int n, m, tmp;
		
		System.out.print("Unesite prvu vrednost intervala: ");
		n = sc.nextInt();
		System.out.print("Unesite poslednju vrednost intervala: ");
		m = sc.nextInt();
		
		//I način
		for(int i=n;;) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(n > m) {
				i--;
				if( i < m) {
					break;
				}
			}
			else {
				i++;
				if( i > m) {
					break;
				}
			}
		}
		
		
		//II način
		System.out.println(" ");
		if (m < n) {
			tmp = n;
			n = m;
			m = tmp;
		}
		
		for(int i = n; i <= m; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		

	}

}
