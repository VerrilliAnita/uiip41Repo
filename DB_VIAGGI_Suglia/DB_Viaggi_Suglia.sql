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
)AUTO_INCREMENT=10;

DROP TABLE IF EXISTS aereo;

CREATE TABLE aereo(
	tipoAereo VARCHAR(36) NOT NULL,
    nPass INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY(tipoAereo)
);


DROP TABLE IF EXISTS volo;

CREATE TABLE volo(
	idVolo INT NOT NULL,
    giornoSettimana ENUM('lunedì', 'martedì', 'mercoledì', 'giovedì','venerdì', 'sabato', 'domenica'),
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    tipoAereo VARCHAR(36) NOT NULL,
    oraPartenza INT NOT NULL,
    oraArrivo INT NOT NULL,
    PRIMARY KEY(idVolo, giornoSettimana)
)AUTO_INCREMENT=15;

ALTER TABLE volo
    ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY (aeroportoPart) references aeroporto(id),
	ADD CONSTRAINT fk_aeroportoArr FOREIGN KEY (aeroportoArr) references aeroporto(id),
	ADD CONSTRAINT fk_tipoAereo FOREIGN KEY (tipoAereo) references aereo(tipoAereo);



	


