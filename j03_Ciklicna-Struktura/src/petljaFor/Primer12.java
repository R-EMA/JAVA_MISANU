package petljaFor;

public class Primer12 {

	public static void main(String[] args) {
		// brojevi deljivi sa 3 u opsegu 1-20
		
		int suma = 0;
		
		for(int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				suma++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nU intervalu 1-20 ima " + suma + " brojeva deljivih sa 3.");
		
	}

}
