
#creazione del database viaggi
DROP DATABASE IF EXISTS viaggi;

CREATE DATABASE viaggi
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE viaggi;

#creazione della tabella brand
DROP TABLE IF EXISTS aeroporto;

CREATE TABLE aeroporto (
	id INT NOT NULL AUTO_INCREMENT,
    citta VARCHAR(32) NOT NULL,
    nazione VARCHAR(20) NOT NULL,
    nPiste INT ,
    PRIMARY KEY (id)
)AUTO_INCREMENT = 20;


#creazione della tabella aereo
DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo (
	tipoAereo VARCHAR (20) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY (tipoAereo)
);

#creazione della tabella compagnia
DROP TABLE IF EXISTS compagnia;

CREATE TABLE compagnia (
	nome VARCHAR(20) NOT NULL,
	nazione VARCHAR(20) NOT NULL,
    PRIMARY KEY (nome)
);

DROP TABLE IF EXISTS proprieta;

CREATE TABLE proprieta(
	compagnia VARCHAR (20) NOT NULL,
    aereo VARCHAR (20) NOT NULL,
    PRIMARY KEY (compagnia,aereo)
    );
    
ALTER TABLE proprieta
    ADD CONSTRAINT fk_compagnia FOREIGN KEY (compagnia) REFERENCES compagnia(nome),
    ADD CONSTRAINT fk_aereo FOREIGN KEY (aereo) REFERENCES aereo(tipoAereo);


    
    
DROP TABLE IF EXISTS volo;
CREATE TABLE volo(
	idVolo INT NOT NULL AUTO_INCREMENT,
    giornoSett ENUM('Lunedi','Martedi','Mercoledi','Giovedi','Venerdi','Sabato','Domenica'),
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    tipoAereo VARCHAR (20) NOT NULL,
    compagnia VARCHAR (20) NOT NULL,
    oraPartenza INT (2) NOT NULL,
    oraArrivo INT (2) NOT NULL,
    PRIMARY KEY (idVolo,giornoSett)
)AUTO_INCREMENT = 20;

 
ALTER TABLE volo
    ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY(aeroportoPart) REFERENCES aeroporto(id),
	ADD CONSTRAINT fk_aeroportoArr FOREIGN KEY(aeroportoArr) REFERENCES aeroporto(id),
	ADD CONSTRAINT fk_tipoAereo FOREIGN KEY(compagnia,tipoAereo) REFERENCES proprieta(compagnia,aereo);

    
DROP TABLE IF EXISTS prenotazione;

CREATE TABLE prenotazione(
	id INT NOT NULL,
	codiceFiscale CHAR(16) NOT NULL,
	nome VARCHAR(20) NOT NULL,
	cognome VARCHAR(20) NOT NULL,
    volo INT NOT NULL,
    PRIMARY KEY (id)
);
ALTER TABLE prenotazione
    ADD CONSTRAINT fk_volo FOREIGN KEY(volo) REFERENCES volo(idVolo);
    
