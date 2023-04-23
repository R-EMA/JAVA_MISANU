package paket;

public class Main {

	//generički metod
	public static<T> void stampajNiz(T[]niz){
		for(T i: niz) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}
			
	public static void main(String[] args) {
		// generičke klase i nizovi		
		
		Integer[] i = {1,2,3,4,5,6,7};
		Double[]  d = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		Character[] c = {'a','b','c','d','e','f','g'};
		
		System.out.println("Integer niz");
		stampajNiz(i);
		System.out.println("Double niz");
		stampajNiz(d);
		System.out.println("Character niz");
		stampajNiz(c);
	}

}
