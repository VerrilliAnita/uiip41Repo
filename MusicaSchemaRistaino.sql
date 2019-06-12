DROP DATABASE IF EXISTS musica;

#DATABSE phone
CREATE DATABASE musica
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;

USE musica;

#Tabella strumento
DROP TABLE IF EXISTS strumento;

CREATE TABLE strumento (
	nome VARCHAR(20) NOT NULL,
    categoria VARCHAR(20) DEFAULT 'Non specificato',
    PRIMARY KEY (nome)
);

#Tabella musicista
DROP TABLE IF EXISTS musicista;

CREATE TABLE musicista (
	codiceFiscale CHAR(16) PRIMARY KEY NOT NULL,
    nome VARCHAR(20) NOT NULL,
    cognome VARCHAR(20) NOT NULL,
    dataNascita DATE NOT NULL,
    sesso ENUM('M', 'F') NOT NULL
);

#Tabella abilità
DROP TABLE IF EXISTS abilita;

CREATE TABLE abilita (
	musicista CHAR(16) NOT NULL,
    strumento VARCHAR(20) NOT NULL,
    PRIMARY KEY (musicista, strumento)
);

#Aggiuta foreign key a brand
ALTER TABLE abilita
	ADD CONSTRAINT fk_musicista FOREIGN KEY (musicista) REFERENCES musicista(codiceFiscale),
    ADD CONSTRAINT fk_strumento FOREIGN KEY (Strumento) REFERENCES strumento(nome);