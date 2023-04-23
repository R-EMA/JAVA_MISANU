package dan1;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		// provera da li tačka pripada pravouganiku
		// pristup: date su koordinate tačke i ...
		// ... 2 tačke pravouganika: gornji levi i donji desni ugao
		// početna tačka koordinatnog sistema nalazi se u gornjem levom uglu
		// kao pripadajuće vrednosti uzete su i vrednosti koje leže na obodu pravouganika
		
		double x, y; // tačka
		double x1, y1, x2, y2; // pravouganik
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koordinate tačke: ");
		System.out.print("x = ");
		x = sc.nextDouble();
		System.out.print("y = ");
		y = sc.nextDouble();
		
		System.out.println("Unesite koordinate tačke pravouganika u njegovom gornjem levom uglu: ");
		System.out.print("x1 = ");
		x1 = sc.nextDouble();
		System.out.print("y1 = ");
		y1 = sc.nextDouble();
		
		System.out.println("Unesite koordinate tačke pravouganika u njegovom donjem levom uglu: ");
		System.out.print("x2 = ");
		x2 = sc.nextDouble();
		System.out.print("y2 = ");
		y2 = sc.nextDouble();
		
		if ( (x >= x1 && x <= x2) && (y >= y1 && y <= y2) ) 
			System.out.println("Tačka (" + x + "," + y + ") pripada zadatom pravouganiku");
		else
			System.out.println("Tačka (" + x + "," + y + ") ne pripada zadatom pravouganiku");

		sc.close();
	}

}
