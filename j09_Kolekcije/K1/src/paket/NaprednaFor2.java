package paket;

import java.util.Scanner;

public class NaprednaFor2 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int brojevi[] = new int[5];
		
		int i = 0;
		for(int clan : brojevi) {
			System.out.println("Unesite broj: ");
			brojevi[i] = sc.nextInt();	/* ovako samo osigurava da ne dođe do prekoračenja */	
			i++;
		}
				
		
		System.out.println("Elementi niza su:");
		for(int clan : brojevi )
			System.out.print(clan + "  ");	
		
		sc.close();
		
	}

}
