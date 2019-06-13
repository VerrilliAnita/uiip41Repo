drop database if exists Books;
	create  database Books
    default character set latin1
	default collate latin1_general_ci;

use Books;

drop table if exists book;
	
create table book(
	id int not null auto_increment primary key,
    title varchar (50) not null,
    author varchar (50) not null,
    price float,
    qty int not null
    );
    
    