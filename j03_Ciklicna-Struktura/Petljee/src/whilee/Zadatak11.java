package whilee;

import java.text.DecimalFormat;

public class Zadatak11 {

	public static void main(String[] args) {
		
		double y = 0.0d;
		int i = 1;
		System.out.printf("\t%2s\t%4s\t%6s%n", "R.Br.","x","y");
		for (double x = 1.0d; x <= 2.0; x+=0.2) {
			y = x + 2.5*x*x*x/(x-2.8);
			System.out.printf("\t%-2d\t%1.2f\t%3.2f\n",i,x,y);
			i++;
		}
		
		// while
		System.out.println("\n\n");
		y = 0.0; 
		double x = 1.0; 
		i = 0; 
		DecimalFormat df = new DecimalFormat("#.##"); 
		// Štampanje zaglavlja 
		System.out.println("\tR.BR.\tX\tY(X)"); 
		while (x <= 2.0) { 
			// Izračunavanje vrednosti funkcije 
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8); 
			i++; 
			// Štampanje rezultata 
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y)); 
			x += 0.2; 
		}
		
		
	}

}


