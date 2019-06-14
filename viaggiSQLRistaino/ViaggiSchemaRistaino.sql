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

#Tabella aereo
DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo (
	tipoAereo VARCHAR(20) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY (tipoAereo)
);

#Tabella aereo
DROP TABLE IF EXISTS volo;

CREATE TABLE volo (
	idVolo INT NOT NULL AUTO_INCREMENT,
    giornoSett ENUM('lunedi', 'martedi', 'mercoledi', 'giovedi', 'venerdi', 'sabato', 'domenica'),
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    tipoAereo VARCHAR(20) NOT NULL,
    oraPartenza INT NOT NULL,
    oraArrivo INT NOT NULL,
    PRIMARY KEY(idVolo, giornoSett)
);

#Aggiunta foreign key a volo
ALTER TABLE volo
	ADD CONSTRAINT fk_aeroporto_part FOREIGN KEY (aeroportoPart) REFERENCES aeroporto(id),
	ADD CONSTRAINT fk_aeroporto_arr FOREIGN KEY (aeroportoArr) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_tipo_aereo FOREIGN KEY (tipoAereo) REFERENCES aereo(tipoAereo);