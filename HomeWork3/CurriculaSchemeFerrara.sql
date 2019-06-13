DROP DATABASE IF EXISTS curricula;

CREATE DATABASE curricula
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE curricula;


DROP TABLE IF EXISTS candidato;

CREATE TABLE candidato (
	codice INT NOT NULL AUTO_INCREMENT,
    cognome VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    viaresidenza VARCHAR(100) NOT NULL,
    capresidenza VARCHAR(5) NOT NULL,
    cittaresidenza VARCHAR(30) NOT NULL,
    datanascita DATE NOT NULL,
    luogonascita VARCHAR(30) NOT NULL,
    PRIMARY KEY (codice)
)AUTO_INCREMENT = 200;


DROP TABLE IF EXISTS telefono;

CREATE TABLE telefono (
    numero VARCHAR(15) NOT NULL,
    candidato INT NOT NULL,
    PRIMARY KEY (numero)
);

ALTER TABLE telefono
    ADD CONSTRAINT fk_candidato2 FOREIGN KEY(candidato) REFERENCES candidato(codice);


DROP TABLE IF EXISTS attivita;

CREATE TABLE attivita (
    codice INT NOT NULL AUTO_INCREMENT,
    mansione VARCHAR(100) NOT NULL,
    PRIMARY KEY (codice)
)AUTO_INCREMENT = 200;


DROP TABLE IF EXISTS esperienza;

CREATE TABLE esperienza (
    codice INT NOT NULL AUTO_INCREMENT,
    candidato INT NOT NULL,
    attivita INT NOT NULL,
    datainizio DATE NOT NULL,
    datafine DATE,
	azienda VARCHAR(100) NOT NULL,
    PRIMARY KEY (codice)
)AUTO_INCREMENT = 200;

ALTER TABLE esperienza
    ADD CONSTRAINT fk_candidato3 FOREIGN KEY(candidato) REFERENCES candidato(codice),
    ADD CONSTRAINT fk_attivita FOREIGN KEY(attivita) REFERENCES attivita(codice);


DROP TABLE IF EXISTS titolostudio;

CREATE TABLE titolostudio (
    codice INT NOT NULL AUTO_INCREMENT,
    descrizione VARCHAR(50) NOT NULL,
    PRIMARY KEY (codice)
)AUTO_INCREMENT = 200;


DROP TABLE IF EXISTS istruzione;

CREATE TABLE istruzione (
    codice INT NOT NULL AUTO_INCREMENT,
    candidato INT NOT NULL,
    titolo INT NOT NULL,
    voto VARCHAR(10) NOT NULL,
    data DATE NOT NULL,
	istituto VARCHAR(100) NOT NULL,
    PRIMARY KEY (codice)
)AUTO_INCREMENT = 200;

ALTER TABLE istruzione
    ADD CONSTRAINT fk_candidato FOREIGN KEY(candidato) REFERENCES candidato(codice),
    ADD CONSTRAINT fk_titolo FOREIGN KEY(titolo) REFERENCES titolostudio(codice);





