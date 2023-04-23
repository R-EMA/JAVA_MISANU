package akoSwitch;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
		// samoglasnik i suglasnik
		
		Scanner sc = new Scanner(System.in);
		
		char znak;
		
		System.out.print("Unesite jedno slovo (ošisana latinica) .... ");
		
		znak = sc.next().charAt(0);
		
		switch(znak) {
		
			case 'a': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case 'A': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
						
			case 'e': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case 'E': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}			
			
			case 'i': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case 'I': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case 'o': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}			
						
			case 'O': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case 'u': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}	
			
			case 'U': 
			{
				System.out.println("Samoglasnik " + znak);
				break;
			}
			
			case '1': case '2': 
			{
				System.out.println("Broj (rekli smo slovo) " + znak);
				break;
			} 
			
			case '3', '4': 
			{
				System.out.println("Broj (rekli smo slovo) " + znak);
				break;
			}
				
			default: 
			{
				System.out.println("Suglasnik " + znak);
				break;
			}
		}
	
		
		sc.close();

	}
	
	
}
