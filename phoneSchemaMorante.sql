DROP database IF exists phone;

CREATE DATABASE phone
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE phone;

DROP TABLE IF exists country;

CREATE TABLE IF NOT exists country(

	code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(32) NOT NULL
    
);

DROP TABLE IF exists brand;

CREATE TABLE IF NOT exists brand(

	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL
    
)auto_increment=14;
    
ALTER table brand
	ADD CONSTRAINT fk_country FOREIGN KEY(country) REFERENCES country(code);

#CREATE UNIQUE INDEX ix_country ON Brand(country);

DROP TABLE IF exists opsys;

CREATE TABLE IF NOT exists opsys(

	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(64) NOT NULL,
    company VARCHAR(64) NOT NULL,
    openSource TINYINT(1) NOT NULL
    
)auto_increment=12;

DROP TABLE IF exists smarphone;

CREATE TABLE IF NOT exists smartphone(

	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
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
    
)auto_increment=20;

ALTER table smartphone
	ADD CONSTRAINT fk_brand FOREIGN KEY(brand) REFERENCES brand(id);
    
ALTER table smartphone
	ADD CONSTRAINT fk_opSys FOREIGN KEY(opsys) REFERENCES opsys(id);




