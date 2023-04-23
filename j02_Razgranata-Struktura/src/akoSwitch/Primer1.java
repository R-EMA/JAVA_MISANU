package akoSwitch;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {
		// brojčana -> opisna ocena; switch
		
		Scanner sc = new Scanner(System.in);
		
		int ocena;
		
		System.out.print("Unesite ocenu .... ");
		
		ocena = sc.nextInt();
		
		switch(ocena) {
		
			case 5: 
			{
				System.out.println("Odličan. ");
				break;
			}
			
			case 4: 
			{
				System.out.println("Vrlo dobar. ");
				break;
			}
			
			case 3: 
			{
				System.out.println("Dobar. ");
				break;
			}
			
			case 2: 
			{
				System.out.println("Dovoljan. ");
				break;
			}
			
			case 1: 
			{
				System.out.println("Nedovoljan. ");
				break;
			}
			
			default: 
			{
				System.out.println("Uneta ocena ne postoji. ");
				break;
			}
		}
		
		// isto ali sa if ... 
		
		if (ocena == 5 ) {
			System.out.println("Odličan. ");			
		}
		else if (ocena == 4 ) {
			System.out.println("Vrlo dobar. ");			
		}
		else if (ocena == 3 ) {
			System.out.println("Dobar. ");			
		}
		else if (ocena == 2 ) {
			System.out.println("Dovoljan. ");			
		}
		else if (ocena == 1 ) {
			System.out.println("Nedovoljan. ");			
		}
		else {
			System.out.println("Uneta ocena ne postoji. ");			
		}
				
		sc.close();

	}
	
	
}
