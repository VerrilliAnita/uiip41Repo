DROP database IF exists musica;

CREATE DATABASE musica
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;

USE musica;

DROP TABLE IF exists strumento;

CREATE TABLE IF NOT exists strumento(

	nome VARCHAR(20) NOT NULL PRIMARY KEY,
    categoria VARCHAR(20) NOT NULL default 'non specificato'

);

DROP TABLE IF exists musicista;

CREATE TABLE IF NOT exists musicista(

	codiceFiscale CHAR(16) NOT NULL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    cognome VARCHAR(20) NOT NULL, 
    dataNascita Date NOT NULL,
	sesso ENUM('M','F')
);

DROP TABLE IF exists abilita;

CREATE TABLE IF NOT exists abilita(

	musicista CHAR(16) NOT NULL,
    strumento VARCHAR(20) NOT NULL,
    PRIMARY KEY(musicista, strumento)
);

ALTER table abilita
	ADD CONSTRAINT fk_musicista FOREIGN KEY(musicista) REFERENCES musicista(codiceFiscale),
    ADD CONSTRAINT fk_strumento FOREIGN KEY(strumento) REFERENCES strumento(nome);

