package nasledje;

public class TestPas {
	public static void main(String[] args) {
		Pas p = new Pas();
		System.out.println("Klasa Pas");
		p.laj();
		p.dahci();
		ZlatniRetriver zr = new ZlatniRetriver();
		System.out.println("Klasa ZlatniRetriver");
		zr.laj();
		zr.dahci();
		zr.aportiraj();
		
		LhasaApso la = new LhasaApso();
		la.dahci();
		la.cuvaj();
	}
}

/*
 * apstraktna klasa: public class abstract AbstrakntaKlasa() {}
 * ako klasa ima bar jedan apstraktni metod onda je apstraktna
 * apstraktna klasa ne mora imati apsstraktne metode
 * apstraktna klase se samo nasleđuje, ne može da se instancira
 * 
 * vidljivost osobina u klasi
 * public vidi se svuda, nasleđuje se pristupaju mu objekti
 * protected nasleđike se ne vide ga objekti, ne vidi se u klasama van paketa izuzev ako njegovu klasu ne nasleđuju
 * private vidi se samo u klasi
 * objekti protected i private članicima pristupaju preko getera i setera
 * 
*/
