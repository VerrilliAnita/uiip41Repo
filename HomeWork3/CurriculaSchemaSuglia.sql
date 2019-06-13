DROP DATABASE IF EXISTS curricula;
CREATE DATABASE curricula
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;

USE curricula;

DROP TABLE IF EXISTS titolostudio;
CREATE TABLE titolostudio(
	codice INT(11) NOT NULL,
    descrizione VARCHAR(50),
    PRIMARY KEY(codice)
)AUTO_INCREMENT=15;

DROP TABLE IF EXISTS istruzione;
CREATE TABLE istruzione(
	codice INT(11) NOT NULL,
    candidato INT(11) NOT NULL,
    titolo INT(11) NOT NULL,
    voto VARCHAR(10),
    data DATE NOT NULL,
    istituto VARCHAR(100),
    PRIMARY KEY(codice)
)AUTO_INCREMENT=15;

DROP TABLE IF EXISTS candidato;
CREATE TABLE candidato(
	codice INT(11) NOT NULL AUTO_INCREMENT,
    cognome VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    viaresidenza VARCHAR(100) NOT NULL,
    capresidenza VARCHAR(5) NOT NULL,
    cittaresidenza VARCHAR(30) NOT NULL,
    datanascita DATE NOT NULL,
    luogonascita VARCHAR(30) NOT NULL,
    PRIMARY KEY(codice)
);

DROP TABLE IF EXISTS telefono;
CREATE TABLE telefono(
	numero VARCHAR(15) PRIMARY KEY NOT NULL,
    candidato INT(11) NOT NULL
);

DROP TABLE IF EXISTS attivita;
CREATE TABLE attivita(
	codice INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    mansione VARCHAR(100) NOT NULL
);


DROP TABLE IF EXISTS esperienza;
CREATE TABLE esperienza(
	codice INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
	candidato INT(11) NOT NULL,
    attivita INT(11) NOT NULL,
    datainizio DATE NOT NULL,
    datafine DATE,
    azienda VARCHAR(100)
);


ALTER TABLE istruzione
	ADD CONSTRAINT fk_titolo FOREIGN KEY (titolo) REFERENCES titolostudio(codice),
	ADD CONSTRAINT fk_candidato FOREIGN KEY (candidato) REFERENCES candidato(codice);

ALTER TABLE telefono
	ADD CONSTRAINT fk_candidato2 FOREIGN KEY (candidato) REFERENCES candidato(codice);

ALTER TABLE esperienza
	ADD CONSTRAINT fk_candidato3 FOREIGN KEY (candidato) REFERENCES candidato(codice),
    ADD CONSTRAINT fk_attivita FOREIGN KEY (attivita) REFERENCES attivita(codice);
    


