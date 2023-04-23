package p1;

import java.util.Scanner;
// import statičke vrednosti; import konstanti
import static java.lang.Math.PI;
public class Main {

	public static void main(String[] args) {
		//krug, površina
		
		Scanner sc = new Scanner(System.in);
		/*
		 * ako se Scanner ne importuje sa
		 * java.util.Scanner;
		 * ili sa, ako se više klasa uključuje iz java.util:
		 * java.util.*;
		 * 
		 * java.util.Scanner sc = new java.util.Scanner(System.in);
		 * tj. navodi se cela putanja
		 */
		double r, a;
		System.out.println("Unesite poluprečnik kruga: ");
		r = sc.nextDouble();
		a = PI * r * r; // kada je Math.PI importovano
		System.out.println("Površina kruga poluprečnika " + r + " iznosi " + a);
		
		sc.close();
		

	}

}
