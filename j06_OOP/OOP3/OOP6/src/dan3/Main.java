package dan3;

public class Main {

	public static void main(String[] args) {
		
		//Matrica
		Matrica m1 = new Matrica(2,3);
		double n[][] = {{1,2,3}, {4,5,6}};
		m1.setArr(n); 
		m1.printMatrica();
		m1.setElement(100, 0, 0);
		System.out.println("\n-----------------------------------\n");
		m1.printMatrica();
		
		
		System.out.println("\n-----------------------------------\n" + m1.toString());
		
		System.out.println("\n-----------------------------------\n");
		System.out.println(m1.postavi(0, 0, 888));
	}

}
