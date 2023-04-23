package nit;

/**
 * uvod u konkuretno i višenitno programiranje
 */

public class Main {

	public static void main(String[] args) {
		// demonstracija niti
		
		Thread t = Thread.currentThread(); //kreiranj trenutne (ako je prva, onda je glavna)
		System.out.println("Trenutna nit: " + t); // prikaz informacije o trenutno niti
		/*
		 * izlaz
		 * (#1, main,5,main)
		 * #1 - rb niti (nema ga u svim verzijama)
		 * main - ime niti. main je podrazumevano ime glavne niti
		 * 5 - prioritet niti, podrazumevana vrednost
		 * main - ime grupe kojoj nit pripada
		 */
		
		t.setName("Moja Glavna Nit");
		System.out.println("Naziv glavne niti:        " + Thread.currentThread().getName());
		System.out.println("Nazi glavne niti - objekat Thread: " + t.getName());
		// prioritet
		System.out.println("Prioritet trenutne niti:    " + Thread.currentThread().getPriority());

	}

}
