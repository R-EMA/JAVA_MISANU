package predmeti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * @author emma
 * 
 * Zadatak 2: Napisati sledeće klase: 
 * Predmet ima specifičnu težinu i jednoslovnu oznaku vrste predmeta. 
 * Sfera je predmet zadat poluprečnikom. 
 * Kvadar je predmet zadat dužinama ivica. 
 * Napisati klase koje omogućavaju obradu nabrojanih vrsta predmeta. 
 * Predvideti inicijalizaciju zadatim vrednostima parametara (podrazumevano 1), 
 * dohvatanje oznake vrste predmeta, izračunavanje zapremine, izračunavanje težine, 
 * čitanje predmeta sa glavnog ulaza i sastavljanja tekstualnog opisa predmeta. 
 * 
 * Napisati main klasu koja sa glavnog ulaza pročita podatke o određenom broju predmeta 
 * i posle toga na glavnom izlazu ispiše podatke o predmetima 
 * čije su težine iznad proseka.
 * 
 * korisniku je dozvoljeno da unese podatke o najviše 20 predmeta
 * pri svakom unosu korisnik bira da li se radi o sferi ili kvadru
 * i na osnovu toga vrši se odgovarajući unos podataka
 * 
 */
public class TestiranjePredmeta {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		List<Sfera> lopte = new ArrayList<Sfera>();
		List<Kvadar> kutije = new ArrayList<Kvadar>();
		double 	specificnaTezina,	// specificna tezina predmeta
				zapremina,			// zapremina predmeta
				masa,				// tezina predmeta
				ukupnaMasa = 0,		// suma masi
				prosecnaMasa = 0;	// prosečna težina
		int	brPredmeta = 1,			// koliko predmeta
			brLopti = 0,			// broj lopti, brojač
			brKutija = 0,			// broj kutija, brojač
			brProseka = 0;			// indeks za pomoćni niz
		char tip; 					// tip predmeta; S - sfera (lopta), K - kvadar
		
		try {
			System.out.println("Koliko predmeta želite da ispitate?");
			brPredmeta = sc.nextInt();
			if	( brPredmeta < 0 )
				brPredmeta *= (-1);
			if ( brPredmeta > 20 ) {
				System.out.println("Prevelika vrednost. Biće Vam dozvoljen samo 1 predmet");
				brPredmeta = 1;
			}
			double[][] proseci = new double[brPredmeta][3]; // pomoć za štampu vrednosti iznad proseka
			while ( brPredmeta > 0 ) {
				System.out.print("\nTip predmeta (S = sfera, lopta; K = kvadar) ");
				tip = sc.next().charAt(0);
				switch(tip) {
					case 'S', 's': 
						// sfera = s = 1.0
						System.out.print("Poluprečnik sfere (m): ");
						double r = sc.nextDouble();
						System.out.print("Specifična težina sfere (N/m3): ");
						specificnaTezina = sc.nextDouble();
						lopte.add(new Sfera(r));
						lopte.get(brLopti).setSpecificnaTezina(specificnaTezina);
						zapremina = lopte.get(brLopti).izracunajZapreminu();
						masa = lopte.get(brLopti).izracunajTezinu(zapremina);
						//System.out.println(lopte.get(brLopti).opisiPredmet());
						ukupnaMasa += masa;
						proseci[brProseka][0] = 1.0; //sfera
						proseci[brProseka][1] = brLopti; //index sfere
						proseci[brProseka][2] = masa; //težina (masa) sfere
						brLopti++;
						brProseka++;
						break;
					case 'K', 'k':
						// kvarad = k = 2.0
						System.out.println("Unesite dimenzije kvadra: (m)");
						System.out.print("a = ");
						double a = sc.nextDouble(); 
						System.out.print("b = ");
						double b = sc.nextDouble();
						System.out.print("c = ");
						double c = sc.nextDouble();
						System.out.print("Specifična težina kvadra (N/m3): ");
						specificnaTezina = sc.nextDouble();
						kutije.add(new Kvadar(a, b, c));
						kutije.get(brKutija).setSpecificnaTezina(specificnaTezina);
						zapremina = kutije.get(brKutija).izracunajZapreminu();
						masa = kutije.get(brKutija).izracunajTezinu(zapremina);
						//System.out.println(kutije.get(brKutija).opisiPredmet());
						ukupnaMasa += masa;
						proseci[brProseka][0] = 2.0; //kvadar
						proseci[brProseka][1] = brKutija; //index kvadra
						proseci[brProseka][2] = masa; //težina (masa) kvadra
						brKutija++;
						brProseka++;
						break;
					default:
						System.out.println("Pogrešna oznaka predmeta.");
				}
				brPredmeta --;
			}
			//iza while, računanje proseka i prikaz nadprosečnih		
			prosecnaMasa = ukupnaMasa / (brLopti + brKutija);
			brProseka = brLopti + brKutija; //ukoliko ima neobrađenih predmeta usled pogrešnog unosa
			System.out.println("\nProsečna težina predmeta: " + df.format(prosecnaMasa) + " kg");
			System.out.println("Predmeti teži od proseka:");
			for(int i=0; i < brProseka; i++) {
				if ( proseci[i][2] > prosecnaMasa ) {
					if(proseci[i][0] == 1.0) {
						System.out.println(lopte.get( (int) proseci[i][1] ).opisiPredmet());
					}
					else if(proseci[i][0] == 2.0) {
						System.out.println(kutije.get( (int) proseci[i][1] ).opisiPredmet());
					}
				}
			}				
		}
		catch(Exception e) {
			System.out.println("Došlo je do greške: " + e);
		}
		finally {
			sc.close();
		}
				
	}

}