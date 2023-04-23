CREATE DATABASE Taksi;
USE Taksi;

CREATE TABLE Tarife( 
    tarifaID INT PRIMARY KEY AUTO_INCREMENT, 
    naziv VARCHAR(45), 
    opis VARCHAR(100), 
    cena INT
) ENGINE = INNODB;

CREATE TABLE `vozacka_dozvola` ( 
    `vozacka_dozvola_id` INT NOT NULL, 
    `broj_dozvole` VARCHAR(20) NULL, 
    `datum_izdavanja` DATE NOT NULL, 
    `dozvola_vazi_do` DATE NOT NULL, 
    PRIMARY KEY (`vozacka_dozvola_id`) 
) ENGINE = InnoDB;

CREATE TABLE kategorije ( 
    kategorijeID INT PRIMARY KEY,
    oznaka ENUM ('A','B','C'),
    opis varchar (40), 
    datumSticanja DATE 
)     ENGINE = INNODB;


CREATE TABLE kategorijeVozacke( 
    kategorijaVozackaID INT PRIMARY KEY AUTO_INCREMENT, 
    datumSticanja DATE, 
    kategorijeID INT, 
    vozacka_dozvola_id INT, 
    foreign key(kategorijeID) references kategorije(kategorijeID) 
    ON UPDATE CASCADE ON DELETE NO ACTION, 
    foreign key(vozacka_dozvola_id) references vozacka_dozvola(vozacka_dozvola_id) 
    ON UPDATE CASCADE ON DELETE NO ACTION 
)ENGINE = INNODB;

CREATE TABLE taksisti( 
    taksistaID INT PRIMARY KEY NOT NULL, 
    ime varchar(45), 
    prezime varchar(45),
    telefon varchar(45),
    email varchar(45), 
    tekuciRacun varchar(45), 
    grad varchar(45), 
    ulica varchar(45), 
    ulicniBroj int(3) 
) ENGINE = INNODB;

CREATE TABLE voznje( 
	voznjaID INT PRIMARY KEY AUTO_INCREMENT, 
	pocetnaLokacija VARCHAR(30), 
	destinacija VARCHAR(30), 
	datum DATE, 
	vremepocetka INT, 
	trajanje int,
	taksistaID INT,
	tarifaID INT,
	FOREIGN KEY(taksistaID) REFERENCES taksisti(taksistaID) 
	ON UPDATE CASCADE ON DELETE NO ACTION,
	FOREIGN KEY(tarifaID) REFERENCES tarife(tarifaID) 
	ON UPDATE CASCADE ON DELETE NO ACTION 
) ENGINE = INNODB;
