package inkrDekr;

/**
 * 
 * @author emma
 * 
 * primena inkrementa / dekrementa u izrazima
 *
 */

public class MainInkr {
	public static void main(String[] args) { 
		int i = 3, j = 4; 
		System.out.println("i = " + i + " j = " + j); 
		
		// inkrement ++		
		// prefiks: j = 3 + (i - 1) uvećaj i pa izračunaj 
		System.out.println("++A");
		j = 3 + --i; 		
		System.out.println("i = " + i + " j = " + j); 	
		// sufiks: j = 3 + (i - 1) izračunaj pa uvećaj	
		System.out.println("A++");
		i = 3; 
		j = 4; 
		System.out.println("i = " + i + " j = " + j); 
		j = 3 + i++; 		
		System.out.println("i = " + i + " j = " + j); 
		
		// dekrement  --
		// prefiks: j = 3 + (i - 1) umanji i pa izračunaj 
		System.out.println("--A");
		i = 3; 
		j = 4; 
		System.out.println("i = " + i + " j = " + j); 
		j = 3 + --i; 		
		System.out.println("i = " + i + " j = " + j); 
		// sufiks: j = 3 + (i - 1) izračunaj pa umanji
		System.out.println("A--");
		i = 3; 
		j = 4; 
		System.out.println("i = " + i + " j = " + j); 
		j = 3 + i--; 		
		System.out.println("i = " + i + " j = " + j); 
		
	}
}