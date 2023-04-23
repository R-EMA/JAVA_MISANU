package paketi3;

public class B extends A{
	
	private int godina;
	
	B(String ime, int god) {
		super(ime);
		this.godina = god;
	}
	
	B(A a, int god) {
		super(a.getIme());
		this.godina = god;
	}
	
	public void promeniB(String ime, int god) {
		this.setIme(ime);
		this.godina = god;
	}
	
	public void setIme(String ime) {
		super.ime = ime;
	}
	
	public void info() {
		super.info();
		System.out.println("Godina: " + godina);
	}

}
