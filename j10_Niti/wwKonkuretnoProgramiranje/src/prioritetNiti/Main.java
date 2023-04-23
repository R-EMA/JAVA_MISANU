package prioritetNiti;

public class Main {

	public static void main(String[] args) {
		// promena prioriteta niti
		
		A a = new A();
		B b = new B();

		/*
		Kada određenoj niti želite da dodate prioritet izvršavanja
		pozovite metodu .setPriority() koja je član klase Thread.
		void setPriority(nivo)
		nivo prioriteta za koji je pozvana
		vrednosti kostante MIN_PRIORITY = 1, MAX_PRIORITY = 10 najmanji i najveći prioritet (default 5  NORM_PRIORITY konstanta default vrednosti)
		parametrom nivo zadaje se nivo prioriteta niti za koju je metod pozvan. 1 <= nivo <= 10
		*/

		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);

		// kreirana nit se poziva,pokreće jednom jer dolazi do izuzetka
		// izuzetak se baca na različita mesta i različitom učestalošžu zavisno od sistema
		// ako baš mora onda se ili obrađuje izuzetak, ili se kreira više objekata niti od iste klase.
		a.start();
		b.start();

	}

}
