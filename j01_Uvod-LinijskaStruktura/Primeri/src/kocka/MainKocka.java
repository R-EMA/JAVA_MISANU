package kocka;

import java.io.*; 

/**
 * 
 * @author emma
 * 
 * površina i zapremina kocke
 *
 */

public class MainKocka {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		double a, p, v;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Unesite vrednost stranice a: ");
		a = Double.parseDouble(ulaz.readLine()); 
		p = 6*a*a;
		v = a*a*a;
		System.out.println("Za stranicu veličine " + a + " površina kocke je " + p + ", a zapremina " + v);

	}

}
