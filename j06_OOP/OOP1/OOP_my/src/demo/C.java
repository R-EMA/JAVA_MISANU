package demo;

public class C {
	/*
	 * III - osobine i vidljivost članica klase
	 * 
	 * članice klase mogu biti javne (public) ili lokalne (private, protected)
	 * javne članice klase su dostupne njenim objektima
	 * lokalne članice klase su dostupne samo unutar klase
	 * 
	 * članice klase mogu biti statičke
	 * statičke članice klase dostupne su direktno klasi bez njenog instanciranja
	 * JAVA dozvoljava da i objekti pristupaju javnim statičkim članicama, ali to nije preporučljivo
	 */

	// javni metod klase, pripada objektima
	public void info() {
		System.out.println("Ovo je javni metod demo klase C dostupan njenim objektima!");
	}
	// javni statički metod klase, pripada klasi
	public static void infoC() {
		System.out.println("Ovo je javni statički metod demo klase C, a koji pripada klasi!");
	}
}
