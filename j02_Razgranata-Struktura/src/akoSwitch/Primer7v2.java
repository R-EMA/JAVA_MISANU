package akoSwitch;

import java.util.Scanner;

public class Primer7v2 {

	public static void main(String[] args) {
		// ispituje da li je isti dan u sedmici i koji je dan
		
		Scanner sc = new Scanner(System.in);
		
		int rbDan; // dan u sedmici: 1 .. 7
		int ostatak; // ostatak pri deljenju
		int k1, k2, k3; // dani u sedmici
		
		for(int i=1; i<366; i++) {
			System.out.println(i + " % 7 = "+ (i % 7) );
		}
		
		
		System.out.print(" Unesite koji je dan u sedmici 01. januar: " );
		rbDan = sc.nextInt();
		
		System.out.println("Uneti 3 prirodna broja: 1-366 ");
		
		System.out.print("k1 = ");		
		k1 = sc.nextInt();
		
		System.out.print("k2 = ");		
		k2 = sc.nextInt();
		
		System.out.print("k3 = ");		
		k3 = sc.nextInt();
		
		if ( (k1 - k2) % 7 == 0 && (k1 - k3) % 7 == 0 && (k2 - k3) % 7 == 0 ) 
		//if( k1 % 7 == k2 % 7 && k2 % 7 == k3 % 7 && k1 % 7 == k3 % 7) 
		{
			ostatak = k1 % 7;
			System.out.println("Ostatak " + ostatak);
			ostatak = k1 % 7 + (rbDan-1);
			System.out.println("Ostatak " + ostatak);
		}
		else {
			System.out.println("Unete vrednosti ne predstavlaju iste dane u sedmicama.");
			ostatak = -1;
		}
		
		switch (ostatak) {
			
			case 1: {
				System.out.println("Ponedeljak");
				break;
			}
			case 2: {
				System.out.println("Utorak");
				break;
			}
			case 3: {
				System.out.println("Sreda");
				break;
			}
			case 4: {
				System.out.println("Četvrtak");
				break;
			}
			case 5: {
				System.out.println("Petak");
				break;
			}
			case 6: {
				System.out.println("Subota");
				break;
			}
			case 7: {
				System.out.println("Nedelja");
				break;
			}			
			default: {
				System.out.println("Nisu isti dan u sedmici.");
			}
		
		}
		
		
			
		sc.close();

	}
	
	
}
