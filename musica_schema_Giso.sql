#creazione del database phone
DROP DATABASE IF EXISTS musica;

CREATE DATABASE musica
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE musica;


#creazione della tabella strumento
DROP TABLE IF EXISTS strumento;

CREATE TABLE strumento (
    nome VARCHAR(20) NOT NULL,
    categoria VARCHAR(20) NOT NULL DEFAULT "Non Sepcificato",
    PRIMARY KEY (nome)
);

#creazione della tabella musicista
DROP TABLE IF EXISTS musicista;

CREATE TABLE musicista(
	codiceFiscale CHAR (16) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    cognome VARCHAR(20) NOT NULL,
    dataNascita DATE NOT NULL,
    sesso ENUM ('M','F'),
    PRIMARY KEY (codiceFiscale)
);

CREATE TABLE abilita(
	musicista CHAR (16) NOT NULL,
    strumento VARCHAR (20) NOT NULL,
    PRIMARY KEY (musicista,strumento)
    );
    
ALTER TABLE abilita
    ADD CONSTRAINT fk_music FOREIGN KEY (musicista) REFERENCES musicista(codiceFiscale),
    ADD CONSTRAINT fk_strum FOREIGN KEY (strumento) REFERENCES strumento(nome);
    


