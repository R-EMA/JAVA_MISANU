package dan3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// radnik i obračun plate
		
		Scanner sc = new Scanner(System.in);
		
		Radnik r1 = new Radnik("Pera",100,150000);
		Radnik r2 = new Radnik("Mika",80,125000);
		
		System.out.println("Prihod i plata prvog radnika:");
		System.out.println(r1.getPrihod());
		System.out.println(r1.plata());
		System.out.println(r1.ispisi());
		
		System.out.println("Prihod i plata drugog radnika:");
		System.out.println(r2.getPrihod());
		System.out.println(r2.plata());
		System.out.println(r2.ispisi());
		
		
		sc.close();
	}

}
