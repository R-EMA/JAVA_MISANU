package dan3;

public class Domine {
	
	private int a;
	private int b;
	private int[] arr = new int[2];
	
	Domine(int aa, int bb) {
		a = aa;
		b = bb;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public Domine okreni() {
		int temp = a;
		a = b;
		b = temp;
		return this;
	}
		
	public boolean proveri(Domine d) {
		return a == d.a && b == d.b || a == d.b && b == d.a;		
	}
	
	public String tekstualniOpis() {
		return "( " + a + " , " + b + " )";
	}
	
	public String toString() {
		return "{ " + a + " , " + b + " }";
	}		
	
	/* sa nizom; niz kao ulaz */
	Domine(int[] arr) {
		System.out.println("Domine niz");
		this.arr = arr; 
	}
	
	public void okreniArr() {
		int t = arr[0];
		arr[0] = arr[1];
		arr[1] = t;		
	}
	
	public String tekstArr() {
		return "( " + arr[0] + " , " + arr[1] + " )";
	}
	
}
