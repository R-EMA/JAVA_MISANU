package liste;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		List<String> llist = new LinkedList<String>();
		
		llist.add("1");
		llist.add("2");
		llist.add("3");
		llist.add("4");
		llist.add("5");
		
		//list iterator
		ListIterator<String> itr = llist.listIterator();		
		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa.");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\nKretanje kroz listu od poslednjeg do prvog elementa.");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
	}

}
