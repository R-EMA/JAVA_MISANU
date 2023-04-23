package p1;


// balance = stanje, bal=stanje na računu; finansijski
public class Balance {
	
	public String name;
	public double bal;
	
	public Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
		
	}
	
	public void show() {		
		System.out.print("\n" + name + " = " + bal);
		if(bal < 0) {
			System.out.print(" (u minusu)");			
		}
	}
	

}
