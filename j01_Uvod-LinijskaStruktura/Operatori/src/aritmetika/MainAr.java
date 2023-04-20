package aritmetika;

/**
 * 
 * @author emma
 * 
 * Aritmetički operatori
 *
 */
public class MainAr {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 50;
		
		int zbir = a + b; // +		
		System.out.println("vrednost promenljive zbir je " + zbir);
		
		int razlika = a - b; // -
		System.out.println("vrednost promenljive razlka je " + razlika); 
		
		int proizvod = a * b;
		System.out.println("vrednost promenljive proizvod je " + proizvod);
		
		int kolicnik = a / b; // celobrojno deljenje
		System.out.println("vrednost promenljive kolicnik je " + kolicnik);
		
		// drugi način, direktna primena
		System.out.println("5 + 2 = " + (5 + 2));
		System.out.println("5 - 2 = " + (5 - 2));
		System.out.println("5 * 2 = " + 5 * 2);
		System.out.println("5 / 2 = " + 5 / 2);
		System.out.println("5.0 / 2.0 = " + 5.0 / 2.0);
		System.out.println("5 % 2 = " + 5 % 2);

	}

}
