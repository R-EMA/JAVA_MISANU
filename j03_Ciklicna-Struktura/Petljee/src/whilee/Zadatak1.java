package whilee;

import java.io.*;

public class Zadatak1 {
	public static void main(String[] args) throws Exception {
		// suma (1...n); 1/(n+1)
		double suma = 0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		System.out.println("for petlja");
		for (int i = 1; i <= n; i++)
			suma += (double) i / (i + 1);
		System.out.println("Dobijena vrednost sume je " + suma);
		
		System.out.println("while petlja");
		int i = 1; 
		suma = 0;
		while (i <= n) { 
			suma += (double)i / (i + 1); 
			i++; 
		} 
		System.out.println("Dobijena vrednost sume je " + suma);
		
		System.out.println("do while petlja");
		i = 1; 
		suma = 0;
		do { 
			suma += (double)i / (i + 1); 
			i++; 
		} while (i <= n);
		System.out.println("Dobijena vrednost sume je " + suma);
	}
}