
#creazione del database phone
DROP DATABASE IF EXISTS phone;

CREATE DATABASE phone
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE phone;

#creazione della tabella brand
DROP TABLE IF EXISTS brand;

CREATE TABLE brand (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL,
    PRIMARY KEY (id)
)AUTO_INCREMENT = 14;


#creazione della tabella country
DROP TABLE IF EXISTS country;

CREATE TABLE country (
	code VARCHAR (2) NOT NULL,
    name VARCHAR(32) NOT NULL,
    PRIMARY KEY (code)
);

# Modifica della tabella smartphone:
# aggiunta della foreign key 'country' nella tabella brand che fa riferimento alla
# primary key 'code' della tabella country. 
ALTER TABLE brand
    ADD CONSTRAINT fk_country FOREIGN KEY(country) REFERENCES country(code);

#creazione della tabella opsys
DROP TABLE IF EXISTS opsys;

CREATE TABLE opsys (
	id INT NOT NULL AUTO_INCREMENT,
    description VARCHAR(64) NOT NULL,
    company VARCHAR(64) NOT NULL,
    openSource TINYINT(1) NOT NULL,
    PRIMARY KEY (id)
)AUTO_INCREMENT = 12;


#creazione della tabella smartphone
DROP TABLE IF EXISTS smartphone;

CREATE TABLE smartphone(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    ram VARCHAR(5) NOT NULL,
    cpu VARCHAR(64) NOT NULL,
    displayPpi INT NOT NULL,
	displaySize VARCHAR(12) NOT NULL,
    displayResolution VARCHAR(64) NOT NULL,
    size VARCHAR(64),
    weight INT(4),
    notes VARCHAR(1024),
    brand INT NOT NULL,
    opSys int NOT NULL,
    PRIMARY KEY (id)
)AUTO_INCREMENT = 20;

# Modifica della tabella smartphone:
# aggiunta della foreign key 'brand' nella tabella smartphone che fa riferimento alla
# primary key 'id' della tabella brand.
# aggiunta della foreign key 'opSys' nella tabella smartphone che fa riferimento alla
# primary key 'id' della tabella opSys.  
ALTER TABLE smartphone
    ADD CONSTRAINT fk_brand FOREIGN KEY(brand) REFERENCES brand(id),
	ADD CONSTRAINT fk_opsys FOREIGN KEY(opSys) REFERENCES opsys(id);
