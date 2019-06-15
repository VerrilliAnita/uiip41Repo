#-------creazione database-------#
DROP DATABASE IF EXISTS viaggi;
CREATE DATABASE viaggi
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
USE viaggi;

#-----creazione tabella aeroporto-----#
DROP TABLE IF EXISTS aeroporto;
CREATE TABLE aeroporto(
	id INT NOT NULL PRIMARY KEY,
    citta varchar(50) not null,
    nazione varchar(50) not null,
    npiste int
);

#-----creazione tabella viaggiatore-----#
DROP TABLE IF EXISTS viaggiatore;
CREATE TABLE viaggiatore(
	cf varchar(16) NOT NULL PRIMARY KEY,
    nome varchar(30) not null,
    cognome varchar(30) not null
);


#-----creazione tabella strumento-----#
DROP TABLE IF EXISTS aereo;
CREATE TABLE aereo(
	tipoAereo varchar(30) PRIMARY KEY,
    nPass int not null,
    quantitaMerci int not null
);

#-----creazione tabella compagnia-----#
DROP TABLE IF EXISTS compagnia;
CREATE TABLE compagnia(
	idCompagnia int PRIMARY KEY,
    nome varchar(40) not null
);

#-----creazione tabella aereoporto-----#
DROP TABLE IF EXISTS volo;
CREATE TABLE volo(
	idVolo INT NOT NULL,
    giornoSett ENUM ("lunedi","martedi","mercoledi","giovedi","venerdi","sabato","domenica"),
    aeroportoPart int not null,
    aeroportoArr int not null,
    tipoAereo varchar(30) not null,
    compagnia int not null,
    oraPartenza int(2) not null,
    oraArrivo int(2) not null,
    Primary key pk_vo (idVolo,giornoSett)    
);

#-----creazione tabella prenotazione-----#
DROP TABLE IF EXISTS prenotazione;
CREATE TABLE prenotazione(
	idPrenotazione int NOT NULL PRIMARY KEY,
    volo int not null,
    viaggiatore varchar(16) not null
);

alter table volo
	Add constraint fk_ap foreign key (aeroportoPart) references aeroporto(id),
    Add constraint fk_aa foreign key (aeroportoArr) references aeroporto(id),
    Add constraint fk_ta foreign key (tipoAereo) references aereo(tipoAereo),
    Add constraint fk_ca foreign key (compagnia) references compagnia(idCompagnia);
    
alter table prenotazione
    Add constraint fk_vi foreign key (viaggiatore) references viaggiatore(cf);
    
alter table prenotazione   
    Add constraint fk_vo foreign key (volo) references viaggi.volo(idVolo);
    