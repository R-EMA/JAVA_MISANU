package dan1;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// od datog celog trocifrenog broja napraviti najveći mogući
		
		int x, tmp, maxX = 999;
		int s, d, j; // cifre stotine, desetice i jedinice;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prirodni trocifreni broj: ");
		x = sc.nextInt();
		
		if (x < 0 || x > 999) {
			System.out.println("\nUneta je neodgovarajuća vrednost. Najveći prirodni trocifreni broj je 999.");
		}
		else {
			j = x % 10;
			d = (x / 10) % 10;
			s = x / 100;
			tmp = s;
			if(j > d) {
				tmp = j;
				j = d;
				d = tmp;
			}
			if(j > s) {
				tmp = j;
				j = s;
				s = tmp;
			}
			if (d > s) {
				tmp = d;
				d = s;
				s = tmp;
			}
			maxX = s * 100 + d * 10 + j;
			System.out.println("Uneta vrednost " + x + " krije najveći trocifreni broj " + maxX);
				
		}
		
		sc.close();

	}

}
