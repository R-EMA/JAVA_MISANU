CREATE DATABASE Veterina;
USE Veterina;

CREATE TABLE VrsteLjubimaca (
	vrsta_id INT PRIMARY KEY,
    naziv_vrste varchar(30) not null,
    opis_vrste varchar(255)
) ENGINE = INNODB;

CREATE TABLE Vlasnici (
	vlasnik_id int PRIMARY KEY,
    ime varchar(30) not null,
    prezime varchar(30) not null,
    grad varchar(30) not null,
    ulica varchar(30),
    broj_telefona varchar(20)
) ENGINE = INNODB;

CREATE TABLE Ljubimci (
	ljubimacID int primary key,
    ime_ljubimca varchar(30) not null,
    godina_rodjenja int not null,
    broj_cipa varchar(45),
    vrsta_id int not null,
    vlasnik_id int not null,
    foreign key (vrsta_id) references VrsteLjubimaca(vrsta_id)
    ON UPDATE CASCADE ON DELETE NO ACTION,
    foreign key (vlasnik_id) references Vlasnici(vlasnik_id)
    ON UPDATE CASCADE ON DELETE NO ACTION
) ENGINE = INNODB;

