DROP DATABASE IF EXISTS viaggi;

#DATABSE books
CREATE DATABASE viaggi
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;

USE viaggi;

#Tabella aereoporto
DROP TABLE IF EXISTS aereoporto;

CREATE TABLE aeroporto (
	id INT NOT NULL AUTO_INCREMENT,
    citta VARCHAR(20) NOT NULL,
    nazione VARCHAR(20) NOT NULL,
    npiste INT,
    PRIMARY KEY (id)
);

#Tabella compagnia
DROP TABLE IF EXISTS compagnia;

CREATE TABLE compagnia (
	nome VARCHAR(20) NOT NULL,
    nazioneSede VARCHAR(20) NOT NULL,
    PRIMARY KEY(nome)
);

#Tabella aereo
DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo (
	tipoAereo VARCHAR(20) NOT NULL,
    nomeCompagnia VARCHAR(20) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY (tipoAereo, nomeCompagnia)
);

#Aggiunta foreign key ad aereo
ALTER TABLE aereo
	ADD CONSTRAINT fk_compagnia FOREIGN KEY (nomeCompagnia) REFERENCES compagnia(nome);


#Tabella volo
DROP TABLE IF EXISTS volo;

CREATE TABLE volo (
	idVolo INT NOT NULL AUTO_INCREMENT,
    giornoSett ENUM('lunedi', 'martedi', 'mercoledi', 'giovedi', 'venerdi', 'sabato', 'domenica') NOT NULL,
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    tipoAereo VARCHAR(20) NOT NULL,
    nomeCompagnia VARCHAR(20) NOT NULL,
    oraPartenza INT NOT NULL,
    oraArrivo INT NOT NULL,
    PRIMARY KEY(idVolo, giornoSett)
);

#Aggiunta foreign key a volo
ALTER TABLE volo
	ADD CONSTRAINT fk_aeroporto_part FOREIGN KEY (aeroportoPart) REFERENCES aeroporto(id),
	ADD CONSTRAINT fk_aeroporto_arr FOREIGN KEY (aeroportoArr) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_tipo_aereo FOREIGN KEY (tipoAereo, nomeCompagnia) REFERENCES aereo(tipoAereo, nomeCompagnia);


#Tabella passeggero
DROP TABLE IF EXISTS passeggero;

CREATE TABLE passeggero (
	codiceFiscale VARCHAR(16) NOT NULL,
    nome VARCHAR(10) NOT NULL,
    cognome VARCHAR(10) NOT NULL,
    PRIMARY KEY(codiceFiscale)
);
    
#Tabella prenotazione
DROP TABLE IF EXISTS prenotazione;

CREATE TABLE prenotazione (
	idPrenotazione INT NOT NULL,
	idPasseggero VARCHAR(16) NOT NULL,
    idVolo INT NOT NULL,
    giornoSett ENUM('lunedi', 'martedi', 'mercoledi', 'giovedi', 'venerdi', 'sabato', 'domenica'),
    prezzo FLOAT NOT NULL,
    PRIMARY KEY(idPrenotazione)
);

#Aggiunta foreign key a prenotazione
ALTER TABLE prenotazione
	ADD CONSTRAINT fk_passeggero FOREIGN KEY (idPasseggero) REFERENCES passeggero(codiceFiscale),
	ADD CONSTRAINT fk_volo FOREIGN KEY (idVolo, giornoSett) REFERENCES volo(idVolo, giornoSett);
