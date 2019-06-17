drop database if exists Viaggi;
	create  database Viaggi
    default character set latin1
	default collate latin1_general_ci;

use Viaggi;

drop table if exists aeroporto;
	
create table aeroporto(
	id int not null auto_increment,
    citta varchar (50) not null,
    nazione varchar (50) not null,
    npiste int not null,
    primary key (id)
    );
    
    
    drop table if exists aereo;
	
create table aereo(
	tipoAereo varchar (20),
    nPass int not null,
    quantitaMerci int not null,
    primary key (tipoAereo)
    );
    
    
      
    drop table if exists volo;
	
create table volo(
	id int not null,
	giornoSett enum ('Lun','Mart','Merc', 'Giov', 'Venerd', 'Sab', 'Domen'),
	aeroportoPart int not null,
    aeroportoArri int not null,
    tipoAereo varchar (20) not null,
    oraPartenza int not null,
    oraArrivo int not null,
    primary key (id, giornoSett)
    );
    
    alter table volo
    
    ADD CONSTRAINT fk_aeroportoPart FOREIGN KEY (aeroportoPart) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_aeroportoArri FOREIGN KEY (aeroportoArri) REFERENCES aeroporto(id),
    ADD CONSTRAINT fk_tipoAereo FOREIGN KEY (tipoAereo) REFERENCES aereo(tipoAereo);
  
  
    drop table if exists compagnia;
	
create table compagnia(
	idCompagnia int not null auto_increment,
	nomeCompagnia varchar (20) not null,
    tipoAereo varchar (20) not null,
    volo varchar (30) not null,
    primary key (idCompagnia)
    );

    
    drop table if exists passeggero;
    
create table passeggero(
	codiceFiscale varchar (12) not null,
    nome varchar (20) not null,
    cognome varchar (30) not null,
    primary key (codiceFiscale)
    );
    
    
    drop table if exists prenotazione;
    
create table prenotazione(
	codicePrenotazione int not null auto_increment,
	codiceFiscale varchar (12)not null,
    idCompagnia int not null,
    id int not null,
    primary key (codicePrenotazione)
    );
    
    alter table prenotazione
    
    ADD CONSTRAINT fk_codiceFiscale FOREIGN KEY (codiceFiscale) REFERENCES passeggero(codiceFiscale),
	ADD CONSTRAINT fk_idCompagnia FOREIGN KEY (idCompagnia) REFERENCES compagnia(idCompagnia),
    ADD CONSTRAINT fk_id FOREIGN KEY (id) REFERENCES volo(id);
    
    
    
  