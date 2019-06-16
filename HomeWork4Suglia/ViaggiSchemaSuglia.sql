DROP DATABASE IF EXISTS viaggi;

CREATE DATABASE viaggi
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;

USE viaggi;

DROP TABLE IF EXISTS aeroporto;

CREATE TABLE aeroporto(
	id INT NOT NULL,
    citta VARCHAR(36) NOT NULL,
    nazione VARCHAR(36) NOT NULL,
    npiste INT,
    PRIMARY KEY(id)
)AUTO_INCREMENT=20;

DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo(
	tipoAereo VARCHAR(36) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY(tipoAereo)
);


DROP TABLE IF EXISTS volo;

CREATE TABLE volo(
	idVolo INT NOT NULL AUTO_INCREMENT,
    giornoSettimana VARCHAR(36),
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    compagnia INT NOT NULL,
    oraPartenza INT NOT NULL,
    oraArrivo INT NOT NULL,
    PRIMARY KEY(idVolo, giornoSettimana)
);

DROP TABLE IF EXISTS compagnia;

CREATE TABLE compagnia(
	idComp INT NOT NULL AUTO_INCREMENT,
	nomeCompagnia VARCHAR(36) NOT NULL,
    tipoAereo VARCHAR(36) NOT NULL,
    PRIMARY KEY(idComp)
);


DROP TABLE IF EXISTS passeggero;

CREATE TABLE passeggero(
	codiceFiscale CHAR(16) NOT NULL,
	nome VARCHAR(36) NOT NULL,
    cognome VARCHAR(36) NOT NULL,
    PRIMARY KEY(codiceFiscale)
);


DROP TABLE IF EXISTS prenotazione;

CREATE TABLE prenotazione(
	codicePrenotazione CHAR(5) NOT NULL,
    codiceFiscale CHAR(16) NOT NULL,
    idVolo INT NOT NULL,
    PRIMARY KEY(codicePrenotazione)
);


ALTER TABLE prenotazione
	ADD CONSTRAINT fk_codiceFiscale FOREIGN KEY (codiceFiscale) references passeggero(codiceFiscale),
    ADD CONSTRAINT fk_idVolo FOREIGN KEY (idVolo) references volo(idVolo);


ALTER TABLE compagnia
	ADD CONSTRAINT fk_tipoAereoComp FOREIGN KEY (tipoAereo) references aereo(tipoAereo);

ALTER TABLE volo
    ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY (aeroportoPart) references aeroporto(id),
	ADD CONSTRAINT fk_aeroportoArr FOREIGN KEY (aeroportoArr) references aeroporto(id),
	ADD CONSTRAINT fk_compagnia FOREIGN KEY (compagnia) references compagnia(idComp);

