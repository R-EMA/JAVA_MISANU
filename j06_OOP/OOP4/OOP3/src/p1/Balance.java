package p1;


// balance = stanje, bal=stanje na računu; finansijski
public class Balance {
	
	String name;
	double bal;
	
	Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
		
	}
	
	void show() {		
		System.out.print("\n" + name + " = " + bal);
		if(bal < 0) {
			System.out.print(" (uif(bal < 0) {\n"
					+ "			System.out.print(\"U minusu. \");			\n"
					+ "		} minusu)");			
		}
	}
	

}
