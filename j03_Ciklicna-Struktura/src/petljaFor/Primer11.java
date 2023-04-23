package petljaFor;


public class Primer11 {
	
	public static void main(String[] args) {
		// Amstrongovi brojevi: Broj = zbir kubova njegovih cifara
		// primer za trocifreni broj
		
				
		int broj, s, d, j;
		
			
		for(int i=100; i<=999; i++) {
			broj = i;
			s = broj / 100;
			broj %= 100;
			d = broj / 10;
			broj %= 10;
			j = broj;
			if (i == (Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))) {
				System.out.println(i);
			}
		}
		
	}

}
