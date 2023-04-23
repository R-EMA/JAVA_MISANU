package akoSwitch;

import java.util.Scanner;

public class Primer6 {

	public static void main(String[] args) {
		// mini digitron: + - * /
		
		Scanner sc = new Scanner(System.in);
		
		double x, y; // operandi
		double z; // rezultat
		char op; // operator: +  - * /
		
		
		System.out.print("Unesite vrednost prvog broja .... ");		
		x = sc.nextDouble();
		
		System.out.print("Unesite vrednost drugog broja .... ");		
		y = sc.nextDouble();
		
		System.out.println("Unesite željenu matematičku operaciju: ");
		System.out.print("+ za sabiranje, - za oduzimanje, * za množenje i / za deljenje .... ");
		op = sc.next().charAt(0);
		
		System.out.println(""); // dodaje praznu liniju
		
		z = 0.0; // jer se ne računa (inicijalizuje) u svim slučajevima
		
		switch(op) {
		
			case '+': 
			{
				z = x + y;
				System.out.println(x + " " + op + " " + y + " = " + z);
				break;
			}
			
			case '-': 
			{
				z = x - y;
				System.out.println(x + " " + op + " " + y + " = " + z);
				break;
			}
			
			case '*': 
			{
				z = x * y;
				System.out.println(x + " " + op + " " + y + " = " + z);
				break;
			}
			
			case '/': 
			{
				if ( y != 0 ) {
					z = x / y;
					System.out.println(x + " " + op + " " + y + " = " + z);
					System.out.print("");
				}
				else {					
					System.out.println("Greška! Nije dozvoljeno deljenje nulom!");
				}
				
				break;
			}			
			
			default: 
			{
				System.out.println("Unet je pogrešan operator! ");
				break;
			}
		}
		
		
		// isto sa if ....		
		System.out.println("\n--------------------------------");
			
		if ( op == '+' ) 
		{
			z = x + y;
			System.out.println(x + " " + op + " " + y + " = " + z);
			
		}
		
		else if ( op == '-' ) 
		{
			z = x - y;
			System.out.println(x + " " + op + " " + y + " = " + z);
			
		}
		
		else if ( op == '*' ) 
		{
			z = x * y;
			System.out.println(x + " " + op + " " + y + " = " + z);
			
		}
		
		else if ( op == '/' ) 
		{
			if ( y != 0 ) {
				z = x / y;
				System.out.println(x + " " + op + " " + y + " = " + z);
			}
			else {			
				System.out.println("Greška! Nije dozvoljeno deljenje nulom!");
			}
			
		}			
		
		else 
		{
			System.out.println("Unet je pogrešan operator! ");
		
		}
			
			
		sc.close();

	}
	
	
}
