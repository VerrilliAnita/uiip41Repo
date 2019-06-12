	#-------------------------------CREAZIONE DEL DATABASE ---------------------------------------
DROP DATABASE IF EXISTS Phone;
	
    CREATE DATABASE phone
		DEFAULT CHARACTER SET latin1
		DEFAULT COLLATE latin1_general_ci;
	
    USE phone;
    #-------------------------------CREAZIONE DELLE TABELLE----------------------------------------
		
		DROP TABLE IF EXISTS brand;
    
		CREATE TABLE brand (
			id INT NOT NULL AUTO_INCREMENT,
			name VARCHAR(32) NOT NULL, 
			country VARCHAR (2) NOT NULL,
            CONSTRAINT pk_id PRIMARY KEY (id)
			)
			AUTO_INCREMENT=14;
								#-----------------------------------
		DROP TABLE IF EXISTS country;
    
		CREATE TABLE country (
			code VARCHAR(2) NOT NULL,
			name VARCHAR(32) NOT NULL, 
            CONSTRAINT pk_code PRIMARY KEY (code)
			);
								
                                #-----------------------------------
			
		DROP TABLE IF EXISTS opsys;
    
		CREATE TABLE opsys (
			id INT NOT NULL AUTO_INCREMENT,
			description VARCHAR(64) NOT NULL,
			company VARCHAR(64) NOT NULL, 
            openSource tinyint(1) NOT NULL,
            CONSTRAINT pk_id PRIMARY KEY (id)
			)
            AUTO_INCREMENT=14;
								#-----------------------------------
		
		DROP TABLE IF EXISTS smartphone;
    
		CREATE TABLE smartphone (
			id INT NOT NULL AUTO_INCREMENT,
            name VARCHAR(64) NOT NULL, 
            ram VARCHAR(5) NOT NULL, 
            cpu VARCHAR(64) NOT NULL, 
            displayPpi INT NOT NULL, 
			displaySize VARCHAR(12) NOT NULL,
			displayResolution VARCHAR(64) NOT NULL, 
            size VARCHAR(64) NOT NULL, 
			weight INT NOT NULL, 
            notes VARCHAR(1024) NOT NULL, 
            brand INT NOT NULL, 
            opsys INT NOT NULL, 
            CONSTRAINT pk_id PRIMARY KEY (id)
			)
            AUTO_INCREMENT=20;
								
      #-------------------------------ALTER DELLE TABELLE----------------------------------------       
          ALTER TABLE Brand
			ADD CONSTRAINT fk_country FOREIGN KEY (country) REFERENCES Country(code);
			
		  ALTER TABLE Smartphone
			ADD CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
            ADD CONSTRAINT fk_opsys FOREIGN KEY (opsys) REFERENCES opsys(id);
        
        
        