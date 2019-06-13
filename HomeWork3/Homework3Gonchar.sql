drop database if exists Archivo;
	create  database Archivo
    default character set latin1
	default collate latin1_general_ci;
    
use Archivo;
    
    
    drop table if exists candidato;
	
create table candidato(
	id int not null,
    cognome varchar (50) not null,
	viaresidenza varchar (100) not null,
    capresidenza varchar (5) not null,
    cittaresidenza varchar (30),
    datanascita date,
    luogonascita varchar(30),
    primary key (id)
    );
    
    
     drop table if exists telefono;
	
create table telefono(
	numero varchar (15) not null,
    candidato int (11) not null,
	primary key (numero)
    );
     
	alter table telefono
	ADD CONSTRAINT fc_candidato2 foreign key (candidato) references candidato (id);

    
    
    drop table if exists attivita;
	
create table attivita(
	id int (11) not null ,
    mansione varchar (100) not null,
    primary key (id)
    );
      
      
      
      drop table if exists titolostudio;
	
create table titolostudio(
	id int (11) not null ,
    descrizione varchar (50) not null,
	primary key (id)
    );
    
    
    
      drop table if exists istruzione;
	
create table istruzione(
	codice int (11) not null,
    candidato int (11) not null,
    titolo int (11) not null,
    voto varchar (10) not null,
    data date,
    istituto varchar(100) not null,
    primary key (codice)
     );
     
     
	alter table istruzione
	ADD CONSTRAINT fc_candidato foreign key (candidato) references candidato(id),
    ADD CONSTRAINT fc_titolo foreign key (titolo) references titolostudio(id);
    
    
   