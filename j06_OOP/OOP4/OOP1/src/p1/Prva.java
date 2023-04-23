package p1;

/*
 * po MVC modelu klase se u paketima projekta grupišu po funkcionalnosti i osobinama
 * na prvom mestu
 * 1 paketu pripadaju klase za rad sa bazom podataka
 * 2 paketu pripadaju klase za dizajniranje
 * 3 paketu pripadaju sve ostale klase
 * 
 * JAVA nema globalne promenljive. Metode sadrže isključivo lokalne promenljive.
 * 
 */

/*Paketi(packages) * * Paketi sluze za grupisanje klasa. * Primera radi, mozete napraviti dve klase sa istim nazivom unutar dva razlicita paketa. * Paket je istovremeno mehanizam za imenovanje i za upravljanje vidljivoscu klasa. * * Paketi sadrže klase. Klase sadrže polja (fields) i metode (methods). * Metode sadrže lokalne promenljive. Nema globalnih promenljivih u Javi! * * */

public class Prva {
	public int a = -5;
	
	public void pogled() {
		System.out.println("Ovo je klasa definisana u prvom paketu p1.");
	}

}
