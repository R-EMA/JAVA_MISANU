package paketi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		// deklaracija + inicijalizacija arraylist
		// primeri za int
		
		//standardno, element po element
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		for(int i=4;i<=10;i++) {
			l1.add(i);
		}
		System.out.println("Lista l1: " + l1);
		//standardno, prilagođeno
		List<Integer> l2 = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(1);
				add(2);
				add(3);
				for(int i=4;i<=10;i++) {
					add(i);
				}
			}
		};
		System.out.println("Lista l2: " + l2);
		
		//niz u array list
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Lista l3: " + l3);

		//niz u array list - drugi način
		List<Integer> l4 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Lista l4: " + l4);

		//kreiranje liste iz postojećeg niza: Integer, Float, Double, String, Long, Boolean, ...
		Integer[] n = {1,2,3,4,5,6,7,8,9,10};
		 
        List<Integer> l5 = new ArrayList<Integer>(); 
        Collections.addAll(l5, n);
		System.out.println("Lista l5: " + l5);

		List<Integer> l6 = new ArrayList<Integer>(Arrays.asList(n));
		System.out.println("Lista l6: " + l6);
		
		List<Integer> l7 = new ArrayList<Integer>(List.of(n));
		System.out.println("Lista l7: " + l7);

	}

}
