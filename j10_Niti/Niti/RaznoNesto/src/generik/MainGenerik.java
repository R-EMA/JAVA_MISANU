package generik;

public class MainGenerik {
	
	//generički metod koji vrši iteraciju kroz niz
	public static<T> void stampaj(T[] n) {
		for(T el : n)
			System.out.print(el + " ");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		//generička klasa, demonstracija rada
		
		Generik<Integer> gi = new Generik<Integer>(10);
		gi.info();
		
		//generički metod, primena
		Integer[] ni = {1,2,3,4,5};
		stampaj(ni);
		
	}
}
