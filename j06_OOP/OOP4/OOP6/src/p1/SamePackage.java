package p1;

public class SamePackage {
	public SamePackage(){ 
		// ne vidi samo private kada je u istom paketu
		Base b = new Base(); // izvršava Base konstruktor u potpunosti
		System.out.println("**2** Konstruktor klase SamePackage"); 
		//System.out.println("Base klasa n_pri = " + b.n_pri); 
		System.out.println("Base klasa n_def = " + b.n_def); 
		System.out.println("Base klasa n_pro = " + b.n_pro); 
		System.out.println("Base klasa n_pub = " + b.n_pub); 
	}
 
 }