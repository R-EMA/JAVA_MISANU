package dan1;

public class Main {

	public static void main(String[] args) {
		
		A obj = new A();
		
		A.prikaziPoruku();
		 
		obj.prikaziPoruku(); //može statički da se pozove i preko objekta ali nije preporučljivo

	}

}
