drop database if exists Phone;

create database Phone
	default character set latin1
    default collate latin1_general_ci;
    
use Phone;

DROP TABLE IF EXISTS brand;

CREATE TABLE brand (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL,
    PRIMARY KEY (id)
) AUTO_INCREMENT = 14;

#Tabella country
DROP TABLE IF EXISTS country;

CREATE TABLE country (
	code VARCHAR(2) NOT NULL,
    name VARCHAR(32) NOT NULL,
    PRIMARY KEY (code)
);

#Aggiuta foreign key a brand
ALTER TABLE brand
	ADD CONSTRAINT fk_country FOREIGN KEY (country) REFERENCES country(code);

#tabella opsys
DROP TABLE IF EXISTS opsys;

CREATE TABLE opsys (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    description VARCHAR(64) NOT NULL,
    company VARCHAR(64) NOT NULL,
    openSource TINYINT(1) NOT NULL
) AUTO_INCREMENT = 12;

#tabella smartphone
DROP TABLE IF EXISTS smartphone;

CREATE TABLE smartphone (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
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
    opSys INT NOT NULL
) AUTO_INCREMENT = 20;

#Aggiunta foreign key a smartphone
ALTER TABLE smartphone
	ADD CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
    ADD CONSTRAINT fk_opSys FOREIGN KEY (opSys) REFERENCES opsys(id);