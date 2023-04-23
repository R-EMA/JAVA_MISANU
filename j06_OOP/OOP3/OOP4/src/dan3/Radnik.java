package dan3;

public class Radnik {
	
	private String ime;
	private double prihod;
	private double procenat;
	
	Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
	}
	
	public void setPrihod(double p) {
		prihod = p;
	}
	
	public double getPrihod() {
		return prihod;
	}
	
	public double plata() {
		return prihod * procenat / 100;
	}
	
	// tekstualni opis = String tip */
	public String ispisi() {
		return ime + " / " + plata();
	}

}
