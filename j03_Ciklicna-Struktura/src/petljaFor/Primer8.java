package petljaFor;

public class Primer8 {

	public static void main(String[] args) {
		// parni brojevi: 1-100
		
		// I način
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// II način
		System.out.println(" "); // za novi red
		for(int i = 2; i <= 100; i+=2) {
			System.out.print(i + " ");
		}

	}

}
