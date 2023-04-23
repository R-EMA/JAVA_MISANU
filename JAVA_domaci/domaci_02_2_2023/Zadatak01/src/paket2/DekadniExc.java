package paket2;

/**
 * 
 * @author emma
 * 
 * Zadatak 1.
 * Napisati program koji pretvara binarni u dekadni broj.
 * + ograničiti unos na 0 i 1 
 *
 */

import java.io.*;

public class DekadniExc {

	public static void main(String[] args) throws Exception {
		// pretvaranje binarnog u dekadni broj

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String binarni;		// za upis binarnog broja
		int d, 				// dužina binarnog broja
			j, 				// pomoćni brojač za stepenovanje
			dekadni = 0; 	// rezultujući dekadni broj

		try {
			System.out.println("Unesite binarni broj (cifre 1 i 0, najmanje 4 cifre)");
			binarni = bf.readLine();
			if (BinaryException.checkBinaryValue(binarni) == false)
				throw new BinaryException();

			d = binarni.length();
			j = d - 1;

			for (int i = 0; i < d; i++) {
				dekadni += (Character.getNumericValue(binarni.charAt(i)) * Math.pow(2, j));
				j--;
			}
			
			System.out.println("Rezultat: 	( " + binarni + " )2 = ( " + dekadni + " )10");
			
		} catch (BinaryException e) {
			
			System.out.println("GREŠKA! " + e.getMessage());
			
		}

	}

}
