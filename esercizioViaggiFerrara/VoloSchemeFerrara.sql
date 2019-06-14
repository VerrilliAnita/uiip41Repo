DROP DATABASE IF EXISTS flights;

CREATE DATABASE flights
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE flights;

DROP TABLE IF EXISTS aeroporto;

CREATE TABLE aeroporto (
	id INT NOT NULL AUTO_INCREMENT,
    citta VARCHAR(20) NOT NULL,
    nazione VARCHAR(20) NOT NULL,
    npiste INT NULL,
    PRIMARY KEY(id)
)AUTO_INCREMENT = 1000;


DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo (
	tipoAereo VARCHAR(20) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci VARCHAR(20) NOT NULL,
    PRIMARY KEY(tipoaereo)
);


DROP TABLE IF EXISTS volo;

CREATE TABLE volo (
	idVolo INT NOT NULL AUTO_INCREMENT,
    giornoSett VARCHAR(20) NOT NULL,
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    tipoAereo VARCHAR(20) NOT NULL,
    oraPartenza INT NOT NULL,
    oraArrivo INT NOT NULL,
    PRIMARY KEY(idVolo,giornoSett)
)AUTO_INCREMENT = 1000;

ALTER TABLE volo
    ADD CONSTRAINT fk_tipoAereo FOREIGN KEY(tipoAereo) REFERENCES aereo(tipoAereo),
    ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY(aeroportoPart) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_aeroportoArr FOREIGN KEY(aeroportoArr) REFERENCES aeroporto(id);

