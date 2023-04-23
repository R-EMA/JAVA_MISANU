package p1;

import java.util.Scanner;

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
		a = 3.14 * r * r;
		System.out.println("Površina kruga poluprečnika " + r + " iznosi " + a);
		
		sc.close();
		

	}

}
