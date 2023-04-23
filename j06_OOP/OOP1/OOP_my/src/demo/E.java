package demo;

public class E {
	
	/*
	 * V - konstuktor-i i this
	 * 
	 * svaki put kada se kreira objekat izvrši se i jedan specijalni metod konstruktor
	 * 
	 * konstruktor može biti kreiran i od strane programera
	 * jedna JAVA klasa može imati više korisničkih konstruktora
	 * konstruktor je istog naziva kao i klasa kojoj pripada
	 * konstruktor je uvek javan i nikada ne vraća nikakvu vrednost, pa čak ni void
	 * konstruktor se kreira na isti način kao metod koji ne vraća ništa (void metod)
	 * 
	 * u konstruktoru klase ispred naziva osobine često se koristi pokazivač this...
	 * kojim se eksplicitno naglašava da se radi o osobini i koji ...
	 * omogućava da parametar ima isti naziv kao i osobina
	 * this operator može da se koristi u svim metodama
	 * pokazivač this ne koristi se sa statičkim osobinama metoda
	 * 
	 */
	
	private String ime;
	
	// konstruktor bez parametra
	E() {
		System.out.println("Kreiran je objekat demo klase E.");
		ime = "Demo E"; // da ne bi metod info() vratio grešku
	}
	// konstruktor sa parametrom (često se koristi za inicijalizaciju osobina klase)
	E(String ime) {
		this.ime = ime; // this.ime = osobina klase; ime = parametar konstruktora
		System.out.println("Kreiran je objekat demo klase E i inicijalizovane su njegove osobine.");
	}
	
	// standardni javni metod klase
	public void info() {
		System.out.println("Zdravo, " + ime + "! Drago mi je da smo se upoznali. Ja sam metod demo klase E.");
	}
	

}
