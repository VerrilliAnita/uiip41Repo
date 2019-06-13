#-------creazione database-------#
DROP DATABASE IF EXISTS books;
CREATE DATABASE books
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
USE books;

#-----creazione tabella strumento-----#
DROP TABLE IF EXISTS book;
CREATE TABLE book(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(50) not null,
    author varchar(50) not null,
    price float not null,
    qty int not null
)AUTO_INCREMENT=20;