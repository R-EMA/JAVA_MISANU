package dan3;


public class Matrica {
	
	
	// u profesorovom rešenju nema potrebe za n i m
	private int n;
	private int m;
	// ovo ostaje
	private double arr[][];
	
	
	Matrica(int n, int m) {		
		this.n = n;
		this.m = m;
		this.arr = new double[n][m];
		System.out.println("matrica obj-1");
	}
	
	Matrica(double mat[][]) {
		this.n = mat.length;
		this.m = mat[0].length;
		this.arr = mat;
		System.out.println("matrica obj-2");
	}
	
	public void printMatrica() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				System.out.printf("%10.2f", arr[i][j]);
			System.out.println("");
		}
	}
	
	public void setArr(double arr[][]) {
		/* ovde nedostaje kontrola da li su obe matrice istih dimenzija */
		this.arr = arr;
	}
	
	public int getN() {
		return n;
		// moglo je i
		// return arr.length;
	}
	
	public int getM() {
		return m;
		// moglo je i
		// return arr[].length;
	}
	
	public double getElement(int i, int j) {
		return arr[i][j];
	}
	
	public void setElement(double val, int i, int j) {
		arr[i][j] = val;
	}
	
	
	//prof Andrije rešenje, set - get element matrice
	public Matrica postavi(int v, int k, double vrednost) {
		arr[v][k] = vrednost;
		return this;
	}
	public double dohvati(int v, int k) {
		return arr[v][k];
	}
	// print to string matrica
	//postojanje metoda toString dozvoljava da se objekat vrati i "štampa" po šemi ovog metoda.
	public String toString() {
		String s = "";
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				//System.out.println(arr[i][j]);
				s += arr[i][j] + " ";
				//s += "\t";
			s += "\n";
		}
		return s;
	}
	
	
	
}
