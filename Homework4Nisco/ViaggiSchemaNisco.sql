#-------------------------------CREAZIONE DEL DATABASE ---------------------------------------
DROP DATABASE IF EXISTS viaggi2;
	
    CREATE DATABASE viaggi2
		DEFAULT CHARACTER SET latin1
		DEFAULT COLLATE latin1_general_ci;
	
    USE viaggi2;
    
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
                                DROP TABLE IF EXISTS compagniaAerea;
    
		CREATE TABLE compagniaAerea (
			id int not null,
            nome VARCHAR(15) not null,
            tipoAereo VARCHAR(15) not null,
            CONSTRAINT pk_id PRIMARY KEY (id),
            CONSTRAINT fk_tipoaereo Foreign KEY (tipoAereo) references aereo(tipoAereo)
            );
                                #-----------------------------------------------
                                
	DROP TABLE IF EXISTS volo;
    
		CREATE TABLE volo (
			idVolo int not null,
            giornoSett VARCHAR(15) not null,
            aeroportoPart int not null,
            aeroportoArr int not null,
			compagnia int not null,
            oraPartenza int not null,
            oraArrivo int not null,
            CONSTRAINT pk_idVolo PRIMARY KEY (idVolo,giornoSett),
            CONSTRAINT fk_aeroportoPart Foreign KEY (aeroportoPart) references aeroporto(id),
            CONSTRAINT fk_aeroportoArr Foreign KEY (aeroportoArr) references aeroporto(id),
            CONSTRAINT fk_compagnia Foreign KEY (compagnia) references compagniaAerea(id)
			);
									
								#-----------------------------------------------
                                
	DROP TABLE IF EXISTS persona;
    
		CREATE TABLE persona (
			codiceFiscale CHAR(16) not null,
            nome VARCHAR(15) not null,
			cognome VARCHAR(15) not null,
            datadinascita date not null,
            CONSTRAINT pk_codiceFiscale PRIMARY KEY (codiceFiscale)
            );
            
								#-----------------------------------------------
             
	
     DROP TABLE IF EXISTS prenotazione;
     
		CREATE TABLE prenotazione (
			idPrenotazione int not null,
            passeggero CHAR(16) not null,
			volo int not null,
            CONSTRAINT pk_idPrenotazione PRIMARY KEY (idPrenotazione),
            CONSTRAINT fk_passegero Foreign KEY (passeggero) references persona(codiceFiscale),
			CONSTRAINT fk_volo Foreign KEY (volo) references volo(idvolo)
            );
            
            
            
            