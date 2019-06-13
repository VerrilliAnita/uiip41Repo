DROP DATABASE IF EXISTS curricula;

CREATE DATABASE curricula
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE curricula;

DROP TABLE IF EXISTS candidato;
CREATE TABLE candidato(
	codice INT (11) NOT NULL,
    cognome VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    viaresidenza VARCHAR(100) NOT NULL,
    capresidenza VARCHAR(5) NOT NULL,
    cittaresidenza VARCHAR(30) NOT NULL,
    datanascita DATE NOT NULL,
    luogonascita VARCHAR(30),
    PRIMARY KEY (codice)
);

DROP TABLE IF EXISTS telefono;

CREATE TABLE telefono (
    numero VARCHAR(15) NOT NULL,
    candidato INT (11) NOT NULL,
    PRIMARY KEY (numero)
);

ALTER TABLE telefono
ADD CONSTRAINT fk_candidato2 FOREIGN KEY(candidato) REFERENCES candidato(codice);

DROP TABLE IF EXISTS attivita;

CREATE TABLE attivita (
    codice INT (11) NOT NULL,
    mansione VARCHAR(100) NOT NULL,
    PRIMARY KEY (codice)
);

DROP TABLE IF EXISTS esperienza;
CREATE TABLE esperienza(
	codice INT (11) NOT NULL,
    candidato INT (11) NOT NULL,
    attivita INT (11) NOT NULL,
    datainizio DATE NOT NULL,
    datafine DATE,
    azienda VARCHAR(100) NOT NULL,
    PRIMARY KEY (codice)
);

ALTER TABLE esperienza
ADD CONSTRAINT fk_attivita FOREIGN KEY(attivita) REFERENCES attivita(codice),
ADD CONSTRAINT fk_candidato3 FOREIGN KEY(candidato) REFERENCES candidato(codice);

DROP TABLE IF EXISTS titolostudio;

CREATE TABLE titolostudio (
    codice INT (11) NOT NULL,
    descrizione VARCHAR(50) NOT NULL,
    PRIMARY KEY (codice)
);


DROP TABLE IF EXISTS istruzione;
CREATE TABLE istruzione(
	codice INT (11) NOT NULL,
    candidato INT (11) NOT NULL,
    titolo INT (11) NOT NULL,
	voto VARCHAR(10) NOT NULL,
    data DATE NOT NULL,
    istituto VARCHAR(100),
    PRIMARY KEY (codice)
);

ALTER TABLE istruzione
ADD CONSTRAINT fk_titolo FOREIGN KEY(titolo) REFERENCES titolostudio(codice),
ADD CONSTRAINT fk_candidato FOREIGN KEY(candidato) REFERENCES candidato(codice);

