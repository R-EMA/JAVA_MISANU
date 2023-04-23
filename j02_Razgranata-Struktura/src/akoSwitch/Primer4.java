package akoSwitch;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {
		// kvadranti i moguće vrednosti koordinata
		
		Scanner sc = new Scanner(System.in);
		
		int kvadrant;
		
		System.out.print("Uneti broj kvadranta .... ");
		
		kvadrant = sc.nextInt();
		
		switch(kvadrant) {
		
			case 1: 
			{
				System.out.println("Koordinate x i y su pozitivne. ");
				System.out.println("Kvadrant " + kvadrant + " zahvata ugao 0-90 stepeni");
				break;
			}
			
			case 2: 
			{
				System.out.println("Koordinata x je negativna, a koordinata y pozitivna. ");
				System.out.println("Kvadrant " + kvadrant + " zahvata ugao 90-180 stepeni");
				break;
			}
			
			case 3: 
			{
				System.out.println("Koordinate x i y su negativne. ");
				System.out.println("Kvadrant " + kvadrant + " zahvata ugao 180-270 stepeni");
				break;
			}
			
			case 4: 
			{
				System.out.println("Koordinata x je pozitivna, a koordinata y je negativna. ");
				System.out.println("Kvadrant " + kvadrant + " zahvata ugao 270-360 (0) stepeni");
				break;
			}
					
			default: 
			{
				System.out.println("Uneta je nedogovarajuća vrednost kvadranta! ");
				break;
			}
		}
		
		// sve isto ali sa if ...
		
		if (kvadrant == 1)
		{
			System.out.println("Koordinate x i y su pozitivne. ");
			System.out.println("Kvadrant " + kvadrant + " zahvata ugao 0-90 stepeni");
			
		}
		
		else if (kvadrant == 2)
		{
			System.out.println("Koordinata x je negativna, a koordinata y pozitivna. ");
			System.out.println("Kvadrant " + kvadrant + " zahvata ugao 90-180 stepeni");
			
		}
		
		else if (kvadrant == 3)
		{
			System.out.println("Koordinate x i y su negativne. ");
			System.out.println("Kvadrant " + kvadrant + " zahvata ugao 180-270 stepeni");
			
		}
		
		else if (kvadrant == 4)
		{
			System.out.println("Koordinata x je pozitivna, a koordinata y je negativna. ");
			System.out.println("Kvadrant " + kvadrant + " zahvata ugao 270-360 (0) stepeni");
			
		}
		
		else 
		{
			System.out.println("Uneta je neodgovarajuća vrednost kvadranta! ");
			
		}
		
		sc.close();
		
		

	}
	
	
}
