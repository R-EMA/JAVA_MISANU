package trougao;

import java.io.*; 
import java.text.DecimalFormat; 

/**
 * 
 * @author emma
 * 
 * poluprečnici opisanog i upisanog kruga trougla
 *
 */
public class MainOUT { 
	public static void main(String[] args) throws Exception { 
		// a, b, c - stranice trougla 
		// s - poluobim trougla 
		// p - površina trougla 
		// R - poluprečnik opisanog kruga 
		// r - poluprečnik upisanog kruga 
		// d - rastojanje izmedju centra opisanog i upisanog kruga 
		double a, b, c, s, p, R, r, d;   
		DecimalFormat df = new DecimalFormat("#.##");   
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		// Unos podataka 
		System.out.print("Unesite vrednost za a: "); 
		a = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost za b: "); 
		b = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost za c: "); 
		c = Double.parseDouble(ulaz.readLine());
		// Izračunavanje vrednosti 
		s = (a + b + c) / 2; 
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		R = a * b * c / (4 * p); 
		r = a * b * c / (2 * R * s); 
		d = Math.sqrt(Math.abs(R * (R - 2 * r))); 
		// Štampanje rezultata 
		System.out.println("R = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d)); 
		
	} 
	
}



