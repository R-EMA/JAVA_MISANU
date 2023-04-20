package cifre;

import java.util.Scanner; 

/**
 * 
 * @author emma
 * 
 * rastavlja trocifren broj na jedinice, desetice i stotne
 * računa zbir cifara trocifrenog broja
 *
 */

public class MainTC { 
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Trocifren broj:"); 
		int broj = input.nextInt(); 
		int s, d, j, z; 
		s = broj / 100; // cifra stotica 
		d = (broj / 10) % 10; // cifra desetica 
		j = broj % 10; // cifra jedinica 
		System.out.println("broj = " + broj + ", cifra stotina = " + s + ", cifra desetica = " + d + ", cifra jedinica = " + j);
		z = s + d + j;
		System.out.println("Zbir cifara broja " + broj + " je " + z);
		
		input.close();
	}
}