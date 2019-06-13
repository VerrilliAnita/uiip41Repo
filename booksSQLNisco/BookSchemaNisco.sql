#-------------------------------CREAZIONE DEL DATABASE ---------------------------------------
DROP DATABASE IF EXISTS books;
	
    CREATE DATABASE books
		DEFAULT CHARACTER SET latin1
		DEFAULT COLLATE latin1_general_ci;
	
    USE books;
    
    #-------------------------------CREAZIONE DELLE TABELLE----------------------------------------
		
		DROP TABLE IF EXISTS book;
    
		CREATE TABLE book (
			id int not null,
			title VARCHAR(50) NOT NULL,
            author VARCHAR(50) NOT NULL, 
			price float NOT NULL ,
            qty int not null,
            CONSTRAINT pk_id PRIMARY KEY (id)
			);
            
							#-----------------------------------------------