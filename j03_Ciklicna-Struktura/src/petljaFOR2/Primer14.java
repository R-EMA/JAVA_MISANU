package petljaFOR2;

public class Primer14 {

	public static void main(String[] args) {
		// trocifreni brojevi deljivi sa 2 i 3
		
		for(int i=100; i<1000; i++) {
			if( i % 2 == 0 && i % 3 == 0) 
				System.out.println(i);
		}
		
		System.out.println("---------------------------------------");
		// drugi način
		// m - trocifreni broj 
		// s - cifra stotice broja 
		// d - cifra desetice broja 
		// j - cifra jedinice broja 
		int m, s, d, j; 
		System.out.println("Celi trocifreni brojevi deljivi sa 2 i 3 su: "); 
		for (s = 1; s <= 9; s++) 
			for (d = 0; d <= 9; d++) 
				for (j = 0; j <= 9; j++) { 
					m = 100 * s + 10 * d + j; 
					if (m % 2 == 0 && m % 3 == 0) 
						System.out.println(m); 
				}

	}

}
