package petljaFor;

public class Primer1 {

	public static void main(String[] args) {
		// kvadrat i kub brojeva, 1..5
		
		System.out.printf("%8s%8s%8s\n", "Broj", "Kvadrat", "Kub");
		System.out.println("----------------------------------------------");
		for(int broj = 1; broj <= 5; broj++ ) {
			System.out.printf("%8d%8d%8d\n", broj, broj*broj, broj*broj*broj);
		}

	}

}
