package paketi3;

public class A {
	
	protected String ime;
	
	
	A(String ime) {
		this.ime = ime;
	}
	
	public void info() {
		System.out.println("\nIme:    " + ime);
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {
		return ime;
	}

}
