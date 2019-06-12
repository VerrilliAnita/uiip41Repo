#-------creazione database-------#
DROP DATABASE IF EXISTS phone;
CREATE DATABASE phone
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
USE phone;

#---------creazione della tabella brand---------#
DROP TABLE IF EXISTS brand;
CREATE TABLE brand(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL
)AUTO_INCREMENT=14;


#----------creazione della tabella country---------#
DROP TABLE IF EXISTS country;
CREATE TABLE country(
	code VARCHAR(2) NOT NULL PRIMARY KEY,
    name VARCHAR(32) NOT NULL);

#---------creazione della tabella opsys---------#
DROP TABLE IF EXISTS opsys;
CREATE TABLE opsys(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	description VARCHAR(64) NOT NULL,
    company VARCHAR(64) NOT NULL,
    openSource TINYINT(1)
)AUTO_INCREMENT=12;

#---------creazione della tabella smartphone---------#
DROP TABLE IF EXISTS smartphone;
CREATE TABLE smartphone(
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
)AUTO_INCREMENT=20;
    
#------modifica tabella smartphone----#
ALTER TABLE smartphone
#aggiunto il vincolo della chiave esterna tra il campo brand di smartphone e la chiave primaria di smartphone#
	ADD CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
#aggiunto il vincolo della chiave esterna tra il campo opsys di opsys e la chiave primaria di opsys#
    ADD CONSTRAINT fk_opsys FOREIGN KEY (opsys) REFERENCES opsys(id);



#------modifica tabella brand----#
ALTER TABLE brand
#aggiunto il vincolo della chiave esterna tra il campo country di brand e la chiave primaria di country#
	ADD CONSTRAINT fk_code FOREIGN KEY(country) REFERENCES country(code);
    
    
    