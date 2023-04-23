package dan1;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
		// unos i prikaz onih članova koji su susedni, a čiji zbir je paran broj
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj članova niza: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		int par = 0; // brojenje članova sa parnim zbirovima, parovi zbirova 
		int zbir = 0; // za računanje zbira 
		
		System.out.println("Unesite niz celih brojeva: ");
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		// prikaz niza
		System.out.print("U nizu: ");
		for(int i = 0; i < n; i++)
			System.out.print(x[i] + " ");
		// obrada i prikaz samo parnih zbirova (počinje od 1 zato što se unazad proverava)
		System.out.println("\n\tsusedni članovi: ");
		for(int i = 1; i < n; i++) {
			zbir = x[i-1] + x[i];
			if(zbir % 2 == 0) {
				par++;
				System.out.print("\t[" + x[i-1] +"," + x[i] + "] ... ( ");
				System.out.println(x[i-1] + " + " + x[i] + " = " + zbir + " )" );
			}
		}
		System.out.println("rezultuju parnim zbirom. Navedeni niz ima " + par + " odgovarajuć-a/ih parova.");
		
		sc.close();
 
	}

}
