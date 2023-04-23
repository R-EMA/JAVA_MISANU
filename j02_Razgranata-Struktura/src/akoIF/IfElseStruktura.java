package akoIF;

import java.io.*;

public class IfElseStruktura {
	public static void main(String[] args) throws Exception {
		double x, y;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		if (x >= 0)
			y = x;
		else
			y = -x;
		
		/*
		 * 
		 * Zamena za if ... else ... (ternarna struktura) - ternarni (uslovni) operator ?:
		 * y = (x >= 0) ? x : -x;   
		 *  
		*/
		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
	}
}