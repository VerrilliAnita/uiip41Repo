DROP DATABASE IF EXISTS phone;

CREATE DATABASE phone
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;

USE phone;

DROP TABLE IF EXISTS brand;

CREATE TABLE brand(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL,
    primary key(id)
)auto_increment=14;


DROP TABLE IF EXISTS country;

CREATE TABLE country(
	code VARCHAR(2) NOT NULL,
    name VARCHAR(32) NOT NULL,
    PRIMARY KEY(code)
);

ALTER TABLE brand
    ADD constraint fk_country foreign key (country) references country(code);

DROP TABLE IF EXISTS opsys;

CREATE TABLE opsys(
	id INT NOT NULL AUTO_INCREMENT,
    description VARCHAR(64) NOT NULL,
    company VARCHAR(64),
    openSource TINYINT(1),
    PRIMARY KEY(id)
)AUTO_INCREMENT=12;

DROP TABLE IF EXISTS smartphone;

CREATE TABLE smartphone(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    ram VARCHAR(5) NOT NULL,
    cpu VARCHAR(64) NOT NULL,
    displayPpi INT NOT NULL,
    displaySize VARCHAR(12) NOT NULL,
    displayResolution VARCHAR(64) NOT NULL,
    size VARCHAR(64) NOT NULL, 
    weight INT NOT NULL, 
    notes VARCHAR(1024),
    brand INT NOT NULL,
    opSys INT NOT NULL,
    primary key(id)
)AUTO_INCREMENT=20;

ALTER TABLE smartphone
	ADD constraint fk_brand foreign key (brand) references brand(id),
    ADD constraint fk_opSys foreign key (opSys) references opSys(id);
    
