#creazione del database phone
DROP DATABASE IF EXISTS books;

CREATE DATABASE books
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE books;


#creazione della tabella book
CREATE TABLE book (
	id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    author VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
    qty INT NOT NULL,
    PRIMARY KEY (id)
)AUTO_INCREMENT = 10;