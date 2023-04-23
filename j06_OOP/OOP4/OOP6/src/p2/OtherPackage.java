package p2;

//import p1.Base;


// ne vidi package, protected i private kada je u drugom paketu
// vidi samo public
public class OtherPackage {
	OtherPackage(){ 
		
		p1.Base b = new p1.Base(); // ako se ne stavi import p1.Base
		System.out.println("***3*** Konstruktor klase OtherPackage"); // izvršava Base konstruktor u potpunosti
		//System.out.println("Base klasa n_pri = " + b.n_pri); 
		//System.out.println("Base klasa n_def = " + b.n_def); 
		//System.out.println("Base klasa n_pro = " + b.n_pro); 
		System.out.println("Base klasa n_pub = " + b.n_pub); 
	}
 
 }