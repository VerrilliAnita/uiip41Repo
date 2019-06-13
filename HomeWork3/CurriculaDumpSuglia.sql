
INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita) VALUES
					  (1, 'Ristaino', 'Giuseppe', 'Via provinciale Cerseta','81304', 'Avellino', '1989-08-25', 'Avellino'),
					  (2, 'Totti', 'Francesco', 'Via Roma','80004', 'Roma', '1974-08-12', 'Roma'),
					  (3, 'Minichiello', 'Tommaso', 'Via Napoli','81004', 'Napoli', '1994-04-11', 'Firenze');

INSERT INTO telefono (numero, candidato) VALUES
					('3312943456', 1),
                    ('3312456987', 1),
                    ('3389767456', 1),
                    ('3389767734', 2),
                    ('3339766734', 2);
                    
INSERT INTO titolostudio(codice, descrizione) VALUES
					(1, 'Ingegneria Informatica'),
                    (2, 'Ingegneria Gestionale'),
                    (3, 'Ingegneria Civile'),
                    (4, 'Ingegneria Chimica'),
                    (5, 'Ingegneria Elettronica'),
                    (6, 'Filosofia'),
                    (7, 'Economia');
                    
INSERT INTO istruzione(codice, candidato, titolo, voto, data, istituto) VALUES
						(1,1,1, '100/110', '2012-01-12', 'FedericoII'),
						(2,1,2, '95/110', '2018-01-12', 'FedericoII'),
						(3,2,1, '92/110', '2011-02-08', 'FedericoII'),
						(4,2,2, '90/110', '2010-01-10', 'FedericoII'),
						(5,3,7, '90/110', '2010-01-10', 'FedericoII');
                        
INSERT INTO attivita(codice, mansione) VALUES
					(1,'programmatore'),
					(2,'programmatore'),
                    (3,'disegnatore'),
                    (4,'ragioniere');
                    
INSERT INTO esperienza(codice, candidato, attivita, datainizio, datafine, azienda) VALUES
						(1,1,1,'2019-06-12', '2019-08-25', 'MCM'),
                        (2,1,2,'2020-06-12', null, 'SAAS'),
                        (3,2,3,'2021-06-12', null,'CAC'),
                        (4,3,4,'2021-06-12', null,'SIC');
                        
                        
					
					
                    
                    

                    
                    