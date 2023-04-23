package d22092022;

import java.util.Scanner;

public class DigitronV1 {
	
	public static void main(String[] args) {
		
		/*
		 * Jednostavan digitron, primena aritmetičkih operacija
		 * nema kontrole grešaka
		 * nema naprednih funkcija i kontrole toka
		*/
		
		double x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		x = y = z = 1.00;
		
		System.out.println("=========================\nDigitron, verzija 1\n=========================");
		System.out.println("primena aritmetičkih operatora nad realnim tipom podataka");
		System.out.println("---------------------------------------------------------\n");
		System.out.println("Unesite vrednost prvog broja ");
		x = sc.nextDouble();
		System.out.println("Unesite vrednost drugog broja (različito od nule) ");
		y = sc.nextDouble();
		
		System.out.println("\nUneto je:    \t\tx = " + x + "   y = " + y);
		
		z = x + y;
		System.out.println("\nZbir \t\t\t x + y = " + z);
		z = x - y;
		System.out.println("Razlika \t\t x - y = " + z);
		z = x * y;
		System.out.println("Proizvod \t\t x * y = " + z);
		z = x / y;
		System.out.println("Količnik \t\t x / y = " + z);
		z = (int) x % (int) y;
		System.out.println("Ostatak pri deljenju \t x % y = " + z);
		
		x++;
		y--;
		System.out.println("\nInkrement ++ primenjen nad x => x = " + x);
		System.out.println("Dekrement -- primenjen nad y => y = " + y);
		
		System.out.println("\n\n--------------------");
		System.out.println("Ako vidite ovo, to znači da ste uneli ispravne brojeve. Hvala!");
		
	}

}
