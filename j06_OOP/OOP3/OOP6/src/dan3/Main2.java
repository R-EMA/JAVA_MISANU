package dan3;

public class Main2 {

	// podrazumevani parametar, demonstracija
	// prihvata 0,1 ili više vrednosti istog tipa
	// TIP... arg
	// tretira se kap niz
	// arg.length - dužina niza ...
	// ako je 0, onda nije ništa prosleđeno
	// arg[0] - prva vrednost ili jedina vrednost za arg.length = 1
	// u ovom primeru ako je dužina veća od 1 onda se vrši sabiranje vrednosti
	// za arg.length = 0 obavezno se definiše default vrednost
	public static int test(int... a) {
		int b;
		if(a.length==0)
			b = 0;
		else if(a.length == 1)
			b = a[0];
		else {
			b = 0;
			for(int i=0; i<a.length;i++) 
				b += a[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		// podrazumevani parametar, demonstracija		
		System.out.println(test(8));
		System.out.println(test());
		System.out.println(test(1,2,3,4,5));
		
	}

}
