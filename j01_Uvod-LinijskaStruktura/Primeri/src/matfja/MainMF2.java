package matfja;

import java.io.*; 
import java.text.DecimalFormat; 

/**
 * 
 * @author emma
 * 
 * matematička funkcija
 *
 */
public class MainMF2 { 
	public static void main(String[] args) throws Exception { 
		// Deklarisanje podataka 
		double x, y, z, f; 
		DecimalFormat df = new DecimalFormat("#.##");   
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));   
		// Unos podataka 
		System.out.print("Unesite vrednost za x: "); 
		x = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost za y: "); 
		y = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost za z: "); 
		z = Double.parseDouble(ulaz.readLine()); 
		// Izracunavanje vrednosti funkcije f 
		f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);   
		// Stampanje rezultata 
		System.out.println("Vrednost funkcije f je " + df.format(f)); 
		
		// Izracunavanje vrednosti funkcije yy
		boolean yy = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;   
		// Stampanje rezultata 
		System.out.println("Vrednost funkcije yy je " + yy);
		
		
	}
}
