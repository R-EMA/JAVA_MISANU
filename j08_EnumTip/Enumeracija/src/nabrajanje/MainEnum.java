package nabrajanje;

public class MainEnum {

	public static void main(String[] args) {
		
		Boje b; // deklarisanje enum-a
		b = Boje.Crvena; // inicijalizacija enum-a

		System.out.println("Boja: " + b);
		
		b = Boje.Plava; //ažuriranj
		if(b == Boje.Plava)
		    System.out.println("Plava");
		
		//obrada sa case
		switch(b) {
	    case Crvena:
	        System.out.println("Crvena");
	        break;
	    case Zelena:
	        System.out.println("Zelena");
	        break;    
	    case Plava:
	        System.out.println("Plava");
	        break;  
	    case Crna:
	        System.out.println("Crna");
	        break;  
	    case Bela:
	        System.out.println("Zelena");
	        break;  
	    case Narandžasta:
	        System.out.println("Narandžasta");
	        break;
	    case Žuta:
	        System.out.println("Žuta");
	        break;
		}
		
		//values metod
		Boje nizBoja[] = Boje.values(); //rezultat je niz vrednosti
		for(Boje cb : nizBoja);
		    System.out.print(cb + " ");
		    
		// .valueOf vraća vrednost iz nabrajanja koja odgovara imenu zadate konstante
		Boje c1;
		c1 = Boje.valueOf("Bela");

	}

}
