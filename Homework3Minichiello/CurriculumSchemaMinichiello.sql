#-------creazione database-------#
DROP DATABASE IF EXISTS curricula;
CREATE DATABASE curricula
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
USE curricula;

#-----creazione tabella candidato-----#
DROP TABLE IF EXISTS candidato;
CREATE TABLE candidato(
	codice INT(11) NOT NULL PRIMARY KEY,
    cognome varchar(50) not null,
    nome varchar(50) not null,
    viaresidenza varchar(100) not null,
    capresidenza varchar(5) not null,
    cittaresidenza varchar(30) not null,
    datanascita date not null,
    luogonascita varchar(30) not null
);

#-----creazione tabella attivita-----#
DROP TABLE IF EXISTS attivita;
CREATE TABLE attivita(
	codice INT(11) NOT NULL PRIMARY KEY,
    mansione varchar(100) not null
);

#-----creazione tabella esperienza-----#
DROP TABLE IF EXISTS esperienza;
CREATE TABLE esperienza(
	codice INT(11) NOT NULL PRIMARY KEY,
    candidato int(11) not null,
    attivita int(11) not null,
    datainizio date not null,
    datafine date,
    azienda varchar(100) not null
);

#-----creazione tabella telefono-----#
DROP TABLE IF EXISTS telefono;
CREATE TABLE telefono(
	numero varchar(15) NOT NULL PRIMARY KEY,
    candidato int(11) not null
);

#-----creazione tabella titolostudio-----#
DROP TABLE IF EXISTS titolostudio;
CREATE TABLE titolostudio(
	codice int(11) NOT NULL PRIMARY KEY,
    descrizione varchar(50) not null
);

#-----creazione tabella istruzione-----#
DROP TABLE IF EXISTS istruzione;
CREATE TABLE istruzione(
	codice INT(11) NOT NULL PRIMARY KEY,
    candidato int(11) not null,
    titolo int(11) not null,
    voto varchar(10) not null,
    data date not null,
    istituto varchar(100) not null
);

alter table istruzione
	Add constraint fk_titolo foreign key (titolo) references titolostudio(codice),
    Add constraint fk_candidato foreign key (candidato) references candidato(codice);

alter table telefono
	Add constraint fk_candidato2 foreign key (candidato) references candidato(codice);

alter table esperienza
	Add constraint fk_attivita foreign key (attivita) references attivita(codice),
    Add constraint fk_candidato3 foreign key (candidato) references candidato(codice);