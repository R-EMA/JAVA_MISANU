package akoIF2;

import java.util.Scanner;

public class Primer1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.print("Unesite jedan ceo broj ");
		
		broj = sc.nextInt();
		
		if ( broj > 0 ) {
			
			System.out.println("Uneti broj je pozitivan.");
			
		}
		
		if ( broj < 0 ) {
			
			System.out.println("Uneti broj je negativan.");
			
		}
		
		
		if ( broj == 0 ) {
			
			System.out.println("Uneti broj je nula.");
			
		}
		
		

	}

}


