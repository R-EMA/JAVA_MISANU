package paket2;

public class BinaryException extends Exception {

	private static final long serialVersionUID = 1L;
	private static String message = " greška binarnog broja ";
	
	BinaryException() {
		super(message);
	}
	
	public static boolean checkBinaryValue(String b) {
		boolean ispravno = true;
		if (b.length() < 4) {
			message = "Binarni broj sadrži najmanje 4 cifre!";
			ispravno = false;	
		}
		else {
			ispravno = true;
			for (int i = 0; i < b.length(); i++) {
				if ( b.charAt(i) != '0' && b.charAt(i) != '1') {
					message = "Binarni broj se sastoji samo od 0 i 1 !";
					ispravno = false;
					break; // 1 pogrešan znak i nema smisla da se vrši dalja provera
				}	
			}
		}
		
		return ispravno;
	}

	@Override
	public String toString() {
		return "GREŠKA! Niste uneli binarni broj!";
	}

}
