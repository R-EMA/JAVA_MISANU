package kolekcija;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Kolekcije {

	public static void main(String[] args) {
		// kolekcije, liste i povezane liste
		
		double arr[] = {-5.0, -4.0, -3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
		
		List<Double> larr = new ArrayList<Double>(); //lista
		List<Double> llarr = new LinkedList<Double>(); //linked list
		
		//punjenje obe liste istim podacima
		for(double clan : arr) {
			larr.add(clan);
			llarr.add(clan);
		}
		
		//"iteracija" for: petljom
		//System.out.printf("%8.2f%8.2f%8.2f",arr[i])
		//for(double clan : arr)
		

	}

}
