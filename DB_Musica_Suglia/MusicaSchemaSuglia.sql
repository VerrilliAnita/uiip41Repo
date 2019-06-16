DROP DATABASE IF EXISTS Musica;

CREATE DATABASE Musica
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;

Use Musica;

DROP TABLE IF EXISTS Strumento;

CREATE TABLE Strumento(
	nome VARCHAR(20) NOT NULL,
    categoria VARCHAR(20) NOT NULL DEFAULT "Non specificato",
    PRIMARY KEY(nome)
);


DROP TABLE IF EXISTS Musicista;
	
CREATE TABLE Musicista(
	codiceFiscale CHAR(16) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    cognome VARCHAR(20) NOT NULL,
    datanascita DATE NOT NULL,
    sesso ENUM("M", "F"),
    PRIMARY KEY(codiceFiscale)
);


DROP TABLE IF EXISTS Abilita;

CREATE TABLE Abilita(
	musicista CHAR(16) NOT NULL,
    strumento VARCHAR(20) NOT NULL,
    PRIMARY KEY(musicista, strumento)
);

ALTER TABLE Abilita
	ADD CONSTRAINT fk_musicista FOREIGN KEY (Musicista) references Musicista(codiceFiscale),
	ADD CONSTRAINT fk_strumento FOREIGN KEY (Strumento) references Strumento(nome);