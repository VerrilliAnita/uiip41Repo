#-------creazione database-------#
DROP DATABASE IF EXISTS musica;
CREATE DATABASE musica
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
USE musica;


#-----creazione tabella strumento-----#
DROP TABLE IF EXISTS strumento;
CREATE TABLE strumento(
	nome VARCHAR(20) NOT NULL PRIMARY KEY,
    categoria VARCHAR(20) NOT NULL default "Non Specificato"
);

#-----creazione tabella strumento-----#
DROP TABLE IF EXISTS musicista;
CREATE TABLE musicista(
	codiceFiscale Char(16) NOT NULL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    cognome VARCHAR(20) NOT NULL,
    datanascita date NOT NULL,
    sesso ENUM ('M','F')
);

DROP TABLE IF EXISTS abilita;
CREATE TABLE abilita(
	musicista char(16) NOT NULL,
    strumento VARCHAR(20) NOT NULL,
    PRIMARY KEY pk_ab (musicista,strumento)
);

alter table abilita
	Add constraint fk_mu foreign key (musicista) references musicista(codiceFiscale),
    Add constraint fk_st foreign key (strumento) references strumento(nome);
