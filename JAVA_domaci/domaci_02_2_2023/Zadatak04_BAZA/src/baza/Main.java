package baza;

/**
 * 
 * @author emma
 * 
 * Zadatak 4.
 * Bonus zadataka - SQL: kreiranje i upis podataka u tabele MySQL baze podataka.
 * 
 * videti komentar ispod klase.
 *
 */

public class Main {

	public static void main(String[] args) {
		// ne radi ništa bitno, sadrži SQL kodove za kreiranje baze
		System.out.println("\nHELLO, WORLD!");
		System.out.println("\nKomentar sadrzi SQL kodove za MySQL bazu i tabele.");
	}

}
/*

CREATE DATABASE salon; # kreira BP salon
USE salon; # selektuje BP salon

# kreiranje tabele proizvodjaci
# PIB bi trebalo da bude jedinstven, ali mora da bude string
# PIB je dug 15 karaktera, 13 max po zemlji EU + 2 vodeca slova koja "kazu" iz koje je zemlje proizvodjac
CREATE TABLE IF NOT EXISTS proizvodjaci (
    proizvodjacID INT AUTO_INCREMENT PRIMARY KEY,
    pib Varchar(15) not null,
    nazivProizvodjaca Varchar(50) not null,
    adresaGrad Varchar(50) not null,
    adresaUlica Varchar(30) not null,
    adresaBroj Varchar(10), # može da sadrži slova: bb 1052a ...
    webSajt Varchar(50)
) ENGINE = INNODB;

# kreiranje tabele modela automobila
CREATE TABLE IF NOT EXISTS automobili (
    modelID INT AUTO_INCREMENT PRIMARY KEY,
    nazivModela Varchar(50) not null,
    oznakaModela Varchar(30) not null,
    jacinaMotora Varchar(10), # ovo može i int, bez oznake merne jedinice
    brojVrata int(1), #  = 3 ili 5 najčešće 
    cena Double(10,2)
) ENGINE = INNODB;

# kreiranje tabele prodajnog salona
CREATE TABLE IF NOT EXISTS prodajni_salon (
    salonID int AUTO_INCREMENT PRIMARY KEY,
    nazivSalona Varchar(50) not null,
    proizvodjacID int not null,
    modelID int not null
) ENGINE = INNODB;
# los dizajn :( treba tabela samo za salon + tabela koja ga povezuje sa automobilima (tu je ukljucena veza ka proizvodjacima)

#povezivanje proizvodjaca i automobila
#jedan proizvođač proizvodi više modela automobila
#jedan model automobila proizvodi se od strane samo jednog proizvođača
#proizvođaci : automobili = 1 : n
ALTER TABLE automobili ADD COLUMN proizvodjacID Int not null;
ALTER TABLE automobili 
ADD FOREIGN KEY (proizvodjacID) REFERENCES proizvodjaci(proizvodjacID)
ON UPDATE CASCADE ON DELETE NO ACTION;
# salona sa proizvodjacima i automobilima
ALTER TABLE prodajni_salon 
ADD FOREIGN KEY (proizvodjacID) REFERENCES proizvodjaci(proizvodjacID)
ON UPDATE CASCADE ON DELETE NO ACTION;
ALTER TABLE prodajni_salon 
ADD FOREIGN KEY (modelID) REFERENCES automobili(modelID)
ON UPDATE CASCADE ON DELETE NO ACTION;
ALTER TABLE prodajni_salon ADD COLUMN kolicina Int not null DEFAULT 0; #dodaje kolonu

#unos vrednosti : pojedinačno / grupno
#proizvođač
INSERT INTO proizvodjaci(pib, nazivProizvodjaca, adresaGrad, adresaUlica, adresaBroj, webSajt) 
VALUES ("IT03049840378","Automobili Lamborghini","S. Agata Bolognese (BO) 40019 Italy","Via Modena","12","https://www.lamborghini.com/")
INSERT INTO proizvodjaci(pib, nazivProizvodjaca, adresaGrad, adresaUlica, adresaBroj, webSajt) 
VALUES 
("GB992897","Bentley Motors","Pyms Lane,Crewe","Cheshire,CW1 3PL","3PL","https://www.bentleymotors.com/en.html"),
("RF10000000"," JSC «AVTOVAZ»","445024, RF,Samara region, Togliatti,","Yuzhnoe shosse","36","https://www.lada.ru/en/")

#automobil
INSERT INTO automobili(nazivModela,oznakaModela,jacinaMotora,brojVrata,cena,proizvodjacID)
VALUES ("Aventador","LP 780-4 ULTIMAE","574 kW",3,250000.00,1);
INSERT INTO automobili(nazivModela,oznakaModela,jacinaMotora,brojVrata,cena,proizvodjacID)
VALUES
("Niva Travel","Classic'22","80 hp",5,25000.00,3),
("Largus Cross","Comfort","106 hp",5,75000.00,3),
("BENTLEY HYBRID","BENTAYGA S","542 bhp",5,525000.00,2);

#salon
INSERT INTO prodajni_salon(nazivSalona,proizvodjacID,modelID,kolicina) VALUES
("Luksuz na tockovima",1,1,10);
 
 
 */
