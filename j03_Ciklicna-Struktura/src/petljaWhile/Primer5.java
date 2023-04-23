package petljaWhile;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		// brojevi deljivi sa a
		int i=1, a, n;
		Scanner ulaz = new Scanner(System.in);
		
		System.out.print("Unesite broj sa kojim se deli: ");
		a = ulaz.nextInt();
		System.out.print("Unesite broj prirodnih brojeva čija se deljivost brojem A proverava: ");
		n = ulaz.nextInt();
		
		while(i<=n) {
			if(i % a == 0)
				System.out.println(i);
			i++;
		}
		
		ulaz.close();

	}

}
