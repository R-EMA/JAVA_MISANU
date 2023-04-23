package akoSwitch;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		// ukupan kapacitet kondezatora
		
		Scanner sc = new Scanner(System.in);
		
		byte veza; // tip veze kondezatora
		double c1, c2; // kondezatori
		double kapacitet = 0.0d; // ukupan kapacitet kondezatora
		
		
		System.out.print("Unesite kapacitet kondezatora C1 (nF) .... ");		
		c1 = sc.nextDouble();
		
		System.out.print("Unesite kapacitet kondezatora C2 (nF) .... ");		
		c2 = sc.nextDouble();
		
		System.out.print("Unesite tip veze kondezatora (1 - redna, 2 - paralelna) .... ");		
		veza = sc.nextByte();
		
		switch(veza) {
		
			case 1: 
			{
				kapacitet = c1*c2/(c1+c2);
				System.out.print("Redno vezani kondezatori kapaciteta " + c1);
				System.out.println(" i " + c2 + " daju ukupan kapacitet " + kapacitet);
				break;
			}
			
			case 2: 
			{
				kapacitet = c1+c2;
				System.out.print("Paralelno vezani kondezatori kapaciteta " + c1);
				System.out.println(" i " + c2 + " daju ukupan kapacitet " + kapacitet);
				break;
			}
			
			
			default: 
			{
				System.out.println("Unet je pogrešan tip veze kondezatora! ");
				break;
			}
		}
		
		
		// isto sa if ....		
		System.out.println("\n--------------------------------");
		
		if (veza == 1) 
		{
			kapacitet = c1*c2/(c1+c2);
			System.out.print("Redno vezani kondezatori kapaciteta " + c1);
			System.out.println(" i " + c2 + " daju ukupan kapacitet " + kapacitet);
			
		}		
		else if (veza == 2) 
		{
			kapacitet = c1+c2;
			System.out.print("Paralelno vezani kondezatori kapaciteta " + c1);
			System.out.println(" i " + c2 + " daju ukupan kapacitet " + kapacitet);
			
		}	
		
		else 
		{
			System.out.println("Unet je pogrešan tip veze kondezatora! ");
			
		}
	
		
		
		sc.close();

	}
	
	
}
