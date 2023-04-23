package resenjeZaDomine;

public class Domina {
	private int a, b;

	/* konstruktor */
	Domina(int aa, int bb) {
		a = aa;
		b = bb;
	}

	/* Geteri */
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	/* Metoda okreće dominu */
	public Domina okreni() {
		int p = a;
		this.a = b;
		this.b = p;
		return this;
	}

	/* Metoda proverava da li su dve domine identične */
	public boolean ista(Domina d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	/* Metoda vraća String koji se koristi prilikom štampanja izgleda domine */
	public String tekstualniOpis() {
		return "(" + a + ", " + b + ")";
	}

}
