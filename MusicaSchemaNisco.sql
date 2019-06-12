	#-------------------------------CREAZIONE DEL DATABASE ---------------------------------------
DROP DATABASE IF EXISTS musica;
	
    CREATE DATABASE musica
		DEFAULT CHARACTER SET latin1
		DEFAULT COLLATE latin1_general_ci;
	
    USE musica;
    
    #-------------------------------CREAZIONE DELLE TABELLE----------------------------------------
		
		DROP TABLE IF EXISTS strumento;
    
		CREATE TABLE strumento (
			nome VARCHAR(20) NOT NULL, 
			categoria VARCHAR (20) NOT NULL default "non specificato",
            CONSTRAINT pk_nome PRIMARY KEY (nome)
			);
            
							#-----------------------------------------------
		DROP TABLE IF EXISTS musicista;
    
		CREATE TABLE musicista (
			codiceFiscale CHAR(16) NOT NULL, 
            nome VARCHAR(20) NOT NULL, 
			cognome VARCHAR(20) NOT NULL, 
			datadinascita DATE NOt null,
            sesso enum('m','f'),
            CONSTRAINT pk_cf PRIMARY KEY (codiceFiscale)
			);
            
							#-----------------------------------------------
		DROP TABLE IF EXISTS abilita;
    
		CREATE TABLE abilita(
			musicista CHAR(16) NOT NULL, 
			strumento VARCHAR (20) NOT NULL,
			CONSTRAINT pk_abilità PRIMARY KEY (musicista,strumento)
			);
            
		#-------------------------------ALTER DELLE TABELLE----------------------------------------
                            
		
            ALter Table abilita
			Add CONSTRAINT fk_musicista foreign key (musicista) references musicista(codiceFiscale),
            Add CONSTRAINT fk_strumento foreign key (strumento) references strumento(nome);			
                            