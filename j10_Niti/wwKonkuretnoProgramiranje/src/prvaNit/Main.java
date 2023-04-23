package prvaNit;

public class Main {

	public static void main(String[] args) {
		/* prilikom pokretanja java programa , jedna programska nit odmah počinje da se izvršava
		* To je glavna ili inicijalna nit.
		Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metoda currentThread() klase Thread.
		*/

		Thread t = Thread.currentThread();
		System.out.println("Trenutna nit " + t);
		/* objašnjenje rezultata prikaza objekta t
		Thread[ime niti, prioritet, ime grupe kojoj pripada nit]
		podrazumevano ime glavne niti je main. Njen prioritet je 5, što je takođe podrazumevana vrednost
		treći parametar, drugo main je ime grupe niti kojoj ta nit pripada. Grupa niti je struktura podataka koja upravlja stanjem kolikcije niti kao celinom.
		*/
		System.out.println("nit kreiranog objekta t");
		System.out.println("Ime niti: " + t.getName());
		System.out.println("Prioritet niti: " + t.getPriority());
		System.out.println("trenutna nit, glavna nit?"); //brže izvršavanje
		System.out.println("Ime niti: " + Thread.currentThread().getName());
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
		

	}

}
