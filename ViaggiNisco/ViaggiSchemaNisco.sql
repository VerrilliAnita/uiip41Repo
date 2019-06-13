#-------------------------------CREAZIONE DEL DATABASE ---------------------------------------
DROP DATABASE IF EXISTS viaggi;
	
    CREATE DATABASE viaggi
		DEFAULT CHARACTER SET latin1
		DEFAULT COLLATE latin1_general_ci;
	
    USE viaggi;
    
    #-------------------------------CREAZIONE DELLE TABELLE----------------------------------------
    
    DROP TABLE IF EXISTS aereoporto;
    
		CREATE TABLE aeroporto (
			id int not null,
			citta VARCHAR(15) NOT NULL,
            nazione VARCHAR(20) NOT NULL, 
            npiste int,
            CONSTRAINT pk_id PRIMARY KEY (id)
			);
									
								#-----------------------------------------------
	DROP TABLE IF EXISTS aereo;
    
		CREATE TABLE aereo (
			tipoAereo VARCHAR(15) not null,
            npass int not null,
			quantitamerci int not null,
            CONSTRAINT pk_tipoAereo PRIMARY KEY (tipoAereo)
			);
									
								#-----------------------------------------------
                                
	DROP TABLE IF EXISTS volo;
    
		CREATE TABLE volo (
			idVolo int not null,
            giornoSett VARCHAR(15) not null,
            aeroportoPart int not null,
            aeroportoArr int not null,
			tipoAereo VARCHAR(15) not null,
            oraPartenza int not null,
            oraArrivo int not null,
            CONSTRAINT pk_idVolo PRIMARY KEY (idVolo,giornoSett),
            CONSTRAINT fk_aeroportoPart Foreign KEY (aeroportoPart) references aeroporto(id),
            CONSTRAINT fk_aeroportoArr Foreign KEY (aeroportoArr) references aeroporto(id),
            CONSTRAINT fk_tipoaereo Foreign KEY (tipoAereo) references aereo(tipoAereo)
			);
									
								#-----------------------------------------------