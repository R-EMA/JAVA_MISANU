package liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainListe {

	public static void main(String[] args) {
		// rad sa listama
		
		List<Integer> alista = new ArrayList<Integer>();
		List<Integer> llista = new LinkedList<Integer>();
		
		//punjenje liste, ovde o jednom trošku obe liste
		for(int i=1; i<=5; i++) {
			alista.add(i*10);
			llista.add(i*10);
		}
		
		//itaracija kroz liste, for napredna
		for(int a : alista) {
			System.out.print(a + " "); //arraylist
		}
		System.out.println("");
		for(int a : llista) {
			System.out.print(a + " "); //linkedlist
		}
		System.out.println("");
		
		//iterator, demonstracija nad arraylist
		Iterator<Integer> itr = alista.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println("");
		
		//list iterator, demonstracija nad linkedlist
		ListIterator<Integer> ltr = llista.listIterator();
		while(ltr.hasNext())
			System.out.print(ltr.next() + " ");
		System.out.println("");
		
		//list iterator, demonstracija nad arraylist uz promenu konekcije; vožnja unazad
		ltr = alista.listIterator(alista.size());
		while(ltr.hasPrevious())
			System.out.print(ltr.previous() + " ");
		System.out.println("");
		
		//array list to array
		Object[] niz = alista.toArray();
		for(Object n : niz)
			System.out.println(n);
	}

}
