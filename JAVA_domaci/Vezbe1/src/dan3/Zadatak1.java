package dan3;

import java.io.*;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {
		// provera pripadnosti znaka grupi
		
		char z; // znak koji se unosi
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite znak: ");
		z = bf.readLine().charAt(0);
		
		System.out.print("\nUneti znak " + z + " je ");
		if( z >='A' && z <= 'Z') {
			System.out.println("veliko slovo.");
		}
		else if( z >='a' && z <= 'z') {
			System.out.println("malo slovo.");
		}
		else if( z >='0' && z <= '9') {
			System.out.println("cifra.");
		}
		else {
			System.out.println("specijalni znak.");
		}
		
		
		// dodatak velika slova eng abecede
		for(char znak = 'A'; znak <= 'Z'; znak ++)
			System.out.print(" " + znak);

	}

}
