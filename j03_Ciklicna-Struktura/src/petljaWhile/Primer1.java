package petljaWhile;

public class Primer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Brojanje od 1 do 10 (prvih 10 prirodnih brojeva ... ");
		System.out.println("\n for petlja ... ");
		for(int i=1; i<=10; i++) 
			System.out.print(i + " ");
		
		System.out.println("\n\n while petlja ... ");
		int j=1;
		while(j<=10) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println("\n\n do while petlja ... ");
		j=1;
		do {
			System.out.print(j + " ");
			j++;			
		} while(j<=10);


	}

}
