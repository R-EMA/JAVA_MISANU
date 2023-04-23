package dan3;

public class Main {

	public static void main(String[] args) {
		/* domine */
		
		Domine d1 = new Domine(2,4);
		Domine d2 = new Domine(4,2);
		
		System.out.println("D1 = D2 " + d1.proveri(d2));
		System.out.println("d1");
		System.out.println(d1.tekstualniOpis());
		d1.okreni();
		System.out.println(d1.tekstualniOpis());
		
		System.out.println("d2");
		System.out.println(d2.tekstualniOpis());
		System.out.println("\n ---------------- \n");
		System.out.println(d2.okreni());
		System.out.println(d2.tekstualniOpis());
		System.out.println("\n ================================ \n\n");
		
		/* domine niz */
		int n[] = {7,8};
		Domine d3 = new Domine(n);
		System.out.println(d3.tekstArr());
		d3.okreniArr();
		System.out.println(d3.tekstArr());		

	}

}
