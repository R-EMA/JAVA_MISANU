package akoIF2;

import java.util.Scanner;

public class Primer3 {
	
	public static void main(String[] args) {
		
		// ispitati da li je broj pozitvan, negativan ili nula
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.print("Unesite jedan ceo broj ");
		
		broj = sc.nextInt();
		
		if ( broj > 0 ) {
			
			System.out.println("Uneti broj je pozitivan.");
			
		} else if ( broj < 0 ) {
			
			System.out.println("Uneti broj je negativan.");
			
		} else if (broj == 0 ){
			
			System.out.println("Uneti broj je nula.");
		} else {
			
			System.out.println("Pogrešan unos.");
		}		
			
		sc.close();
	}

}


