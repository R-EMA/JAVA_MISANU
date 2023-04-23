package akoIF;

import java.util.Scanner;

public class Kupovina {
	
	public static void main(String args[]) {
		
		System.out.println("Primer kupovine kao rezultat nesporazuma");
		
		boolean jaje = false;
		String rezultat = "";
		Scanner sc = new Scanner(System.in);
				
		System.out.println("*** Zadatak: ");
		System.out.print("Idi u prodavnicu i kupi margarin. ");
		System.out.println("Ako ima jaja, kupi 10. ");
		
		System.out.println("\n*** Kupovina: ");
		System.out.print("Da li ima jaja u prodavnici (uneti true ili false)? ");
		jaje = sc.nextBoolean();
		if(jaje == true) 
			rezultat = "10 margarina";
		else 
			rezultat = "1 margarin";
			
		System.out.println("\n*** Rezulat kupovine");
		System.out.println("Kupi-o/la sam " + rezultat + ".");
		
		System.out.println("\n===========================================");
		System.out.println(" \"Ispravka\" zadatka");	// samo je obuhvaćena razlika	
		if(jaje == true) 
			rezultat = "1 margarin i 10 jaja";		
		System.out.println("*** Rezulat kupovine");
		System.out.println("Kupi-o/la sam " + rezultat + ".");
		
		sc.close();
		
	}
	
}
