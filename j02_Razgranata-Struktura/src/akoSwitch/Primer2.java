package akoSwitch;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		// dani u nedelji, switch
		
		Scanner sc = new Scanner(System.in);
		
		int rbDan;
		
		System.out.print("Uneti redni broj dana u sedmici .... ");
		
		rbDan = sc.nextInt();
		
		switch(rbDan) {
		
			case 1: 
			{
				System.out.println("Ponedeljak ");
				break;
			}
			
			case 2: 
			{
				System.out.println("Utorak ");
				break;
			}
			
			case 3: 
			{
				System.out.println("Sreda ");
				break;
			}
			
			case 4: 
			{
				System.out.println("Četvrtak ");
				break;
			}
			
			case 5: 
			{
				System.out.println("Petak ");
				break;
			}
			
			case 6: 
			{
				System.out.println("Subota ");
				break;
			}
			
			case 7: 
			{
				System.out.println("Nedelja ");
				break;
			}
			
			default: 
			{
				System.out.println("Uneta je nedogovarajuća vrednost! ");
				break;
			}
		}
		
		
		sc.close();

	}
	
	
}
