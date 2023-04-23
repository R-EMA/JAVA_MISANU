package petljaFor;

public class Primer4 {

	public static void main(String[] args) {
		// zbir kvadrata prirodnih brojeva od 15 do 25
		// kvadrati prirodnih brojeva od 15 do 25
		
		int zbir = 0;
		
		for(int i = 15; i <= 25; i++) {
			zbir = zbir + i*i;
			System.out.println("Kvadrat broja " + i + " iznosi " + i*i);
		}
		System.out.println("\nZbir kvadrata prirodnih brojeva od 15 do 25 iznosi " + zbir);

	}

}
