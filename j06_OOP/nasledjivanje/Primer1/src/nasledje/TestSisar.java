package nasledje;

public class TestSisar {
	public static void main(String[] args) {
		Sisar s = new Sisar();
		System.out.println(s.uzmiBojuOciju());
		Pas p = new Pas();
		p.lajati();
		Macka m = new Macka();
		m.mjaukati();
	}
}