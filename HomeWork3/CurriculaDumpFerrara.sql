INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita) VALUES
					(1, 'Rossi', 'Mario', 'via matteotti', '83100', 'Avellino', '1990-10-23', 'Avellino'),
					(2, 'Ferrara', 'Danilo', 'via dei santini', '83020', 'Avellino', '1987-12-31', 'Avellino'),
					(3, 'Napolitano', 'Alessandro', 'via nazionale', '83015', 'Baiano', '1985-5-7', 'Avellino'),
					(4, 'Neri', 'Franco', 'via tagliamento', '83023', 'Aiello', '1992-2-17', 'Ariano'),
					(5, 'Bianchi', 'Lucio', 'via dei cervi', '83032', 'Roma', '1995-4-2', 'Roma'),
					(6, 'Minichiello', 'Tommaso', 'via dante', '83010', 'Grottaminarda', '1994-8-16', 'Ariano');


INSERT INTO telefono (numero, candidato) VALUES
					('349675421', 1),
					('333764391', 2),
					('339905471', 3),
					('389564523', 4),
					('393752457', 5);


INSERT INTO attivita (codice, mansione) VALUES
					(1, 'ingegnere civile'),
					(2, 'ingegnere informatico'),
					(3, 'ingegnere elettronico'),
					(4, 'informatico'),
					(5, 'economo'),
					(6, 'impiegato');
                    

INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda) VALUES
					(1, 1, 1, '2015-1-1', '2018-1-1', 'Saipem'),
					(2, 2, 2, '2017-1-1', '2019-1-1', 'ACCA'),
					(3, 3, 3, '2012-1-1', '2016-1-1', 'FMA'),
					(4, 4, 4, '2014-1-1', '2016-1-1', 'Leonardo'),
					(5, 5, 5, '2009-1-1', '2017-1-1', 'PWC'),
					(6, 6, 6, '2011-1-1', '2013-1-1', 'Porsche');
                    

INSERT INTO titolostudio (codice, descrizione) VALUES
					(1, 'Laurea ingegneria civile'),
					(2, 'Laurea ingegneria informatica'),
					(3, 'Laurea ingegneria elettronica'),
					(4, 'Laurea informatica'),
					(5, 'Laurea economia'),
					(6, 'Laurea statistica');
                    

INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto) VALUES
					(1, 1, 1, '107', '2014-5-16', 'Politecnico di Milano'),
					(2, 2, 2, '108', '2016-7-23', 'La Sapienza'),
					(3, 3, 3, '109', '2010-2-23', 'Università degli Studi di Salerno'),
					(4, 4, 4, '105', '2013-12-3', 'Università degli Studi del Sannio'),
                    (5, 4, 5, '105', '2013-12-3', 'Università degli Studi del Sannio'),
					(6, 5, 5, '110', '2007-5-5', 'Bocconi'),
					(7, 6, 6, '110', '2010-4-19', 'Università degli Studi di Padova');
                    

                    

                    



                    





