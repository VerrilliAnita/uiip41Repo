

INSERT INTO candidato(codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza,datanascita,luogonascita) VALUES
				(1, 'Giso', 'Gianluca','Via Giardini','83059','Vallata','1991-06-22','Ariano Irpino'),
				(2, 'Nisco', 'Antonio','Via Tufi','83030','Zungoli','1996-12-03','Ariano Irpino'),
				(3, 'Ferrara', 'Danilo','Via Dei Santini','83020','Cesinali','1987-06-12','Avellino'),
				(4, 'Rossi', 'Marco','Via Giovanni Pascoli','82020','Milano','1997-11-09','Milano'),
				(5, 'Bianchi', 'Marta','Via dei Pioppi','50100','Firenze','1990-09-04','Firenze'),
				(6, 'Marchesiello', 'Flavia','Via Giovanni Falcone','81000','Foggia','1994-08-06',' Foggia');
                

INSERT INTO telefono (numero, candidato) VALUES
				('3467384739', 1),
				('3402960592', 2),
				('3324940243', 3),
				('3298817383', 4),
				('3301234995', 5),
				('3378595043', 3);
							

INSERT INTO attivita(codice, mansione) VALUES 
			(1, 'ingegnere informatico'),
			(2, 'economista informatico'),
			(3, 'bidello'),
			(4, 'ingegnere informatico'),
			(5, 'ingegnere civile'),
			(6, 'architetto'),
			(7, 'informatico');
            

INSERT INTO titolostudio (codice, descrizione) VALUES 
			(1, 'Ingegneria Informatica'),
			(2, 'Ingegneria Civile'),
			(3, 'Architettura'),
			(4, 'Economia'),
			(5, 'Lingue '),
			(6, 'Economia Informatica');
            
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine,azienda) VALUES
			(1, 1, 1, '2018-05-03', null,'FCA'),
			(2, 2, 2, '2019-01-22', '2019-05-15', 'Ferrari'),
			(3, 3, 3, '2017-03-10', null,'Maserati'),
			(4, 4, 4, '2016-05-03', '2019-03-22', 'soprasteria'),
			(5, 5, 5, '2014-03-22', '2018-03-11', 'Lames'),
			(6, 6, 6, '2018-02-01',null, 'Accenture');
            
            
INSERT INTO istruzione(codice, candidato, titolo, voto, data, istituto) VALUES 
			(1, 1, 1, '110', '2019-02-21', 'Universita degli studi del sannio'),
			(2, 2, 2, '100', '2019-08-11', 'Universita degli studi di salerno'),
			(3, 1, 3, '105', '2018-07-11', 'Universita degli studi di Milano'),
			(4, 3, 4, '108', '2016-07-11', 'Universita degli studi di Pescara'),
			(5, 4, 4, '104', '2016-07-11', 'Univesita degli studi del Molise'),
			(6, 6, 5, '107', '2019-09-11', 'Universita degli studi di Milano');


            

            
            
