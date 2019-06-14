DROP DATABASE IF EXISTS viaggi;

CREATE DATABASE viaggi
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE viaggi;

DROP TABLE IF EXISTS aeroporto;

CREATE TABLE IF NOT EXISTS aeroporto(

	id INT NOT NULL AUTO_INCREMENT,
    citta VARCHAR(50) NOT NULL,
    nazione VARCHAR(50) NOT NULL,
    numeroPiste INT,
    PRIMARY KEY (id)
    
);

DROP TABLE IF EXISTS aereo;

CREATE TABLE IF NOT EXISTS aereo(
	
    tipo CHAR(5) NOT NULL,
    numeroPosti INT NOT NULL,
    quantitaMerci INT NOT NULL,
    PRIMARY KEY (tipo)
);

DROP TABLE IF EXISTS volo;

CREATE TABLE IF NOT EXISTS volo(
	
    id INT NOT NULL,
    giorno ENUM('Lunedi','Martedi','Mercoledi','Giovedi','Venerdi','Sabato','Domenica') NOT NULL,
    aeroportoPart INT NOT NULL,
    aeroportoArr INT NOT NULL,
    aereo CHAR(5) NOT NULL,
    oraPart INT NOT NULL,
    oraArr INT NOT NULL,
    PRIMARY KEY (id, giorno)
    
);

ALTER table volo
	ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY(aeroportoPart) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_aeroportoArr FOREIGN KEY(aeroportoArr) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_aereo FOREIGN KEY(aereo) REFERENCES aereo(tipo);
