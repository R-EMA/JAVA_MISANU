package p1;


// import statičke vrednosti
// vezano je za kreiranje kopije objekta u pozadini
// ako je konstanta i kada je static ne pravi se kopija

import static java.lang.Math.sqrt;

public class Main {

	public static void main(String[] args) {
		//hipitenuza
		double a=4.0, b=3.0;
		double c = sqrt(a*a + b*b);
		
		System.out.println("Za stranice  " + a + " i " + b + " hipotenuza je " + c);
		
	}

}
