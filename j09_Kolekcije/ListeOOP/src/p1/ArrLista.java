package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrLista {
	
	Scanner sc = new Scanner(System.in);
	
	List<Integer> brojevi = new ArrayList<Integer>();
	
	void unosBrojeva( ) {
		int num = 0;
		System.out.println("Za prekid unosa brojeva, uneti -1");
		while(true) {
			num = sc.nextInt();
			if(num == -1)
				return;
			this.brojevi.add(num);
		}
	}
	
	void ispisBrojeva() {
		System.out.println(brojevi);
	}

}
