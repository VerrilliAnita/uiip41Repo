


INSERT INTO aeroporto(id,citta,nazione,npiste) VALUES
				(1, 'ROMA', 'ITALIA',3),
				(2, 'NAPOLI', 'ITALIA',4),
				(3, 'LONDRA', 'INGHILTERRA',5),
				(4, 'PARIGI', 'FRANCIA',7),
				(5, 'BERLINO', 'GERMANIA',8),
				(6, 'BRUXELLES', 'BELGIO',NULL),
                (7, 'AMSTERDAM', 'OLANDA',2);
				

INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('Airbus A380-900', 450, 19231),
				('Airbus A380-800',500 ,17222),
				('Boeing 747-32',350 ,17555),
				('Boeing 747-9',600 ,17145),
				('Boeing 747-8',400 ,17821),
				('Boeing 747-11',700 ,15643),
				('Airbus A380-300',500 ,17843),
				('Airbus A380-700',500 ,17843);
                
                
INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, oraPartenza, oraArrivo) VALUES
						(1, 'Lunedi', 1, 2, 'Airbus A380-900', 12, 15),
						(1, 'Mercoledi', 1, 5, 'Airbus A380-900', 15, 20),
                        (2, 'Martedi', 2, 4, 'Boeing 747-8', 16, 19),
                        (3, 'Lunedi', 1, 3, 'Airbus A380-900', 12, 15),
                        (4, 'Giovedi', 3, 1, 'Boeing 747-9', 12, 15),
                        (5, 'Domenica', 6, 4, 'Airbus A380-900', 17, 24),
                        (6, 'Venerdi', 4, 7, 'Airbus A380-900', 16, 22),
                        (7, 'Sabato', 1, 2, 'Boeing 747-8', 12, 15),
                        (8, 'Sabato', 2, 7, 'Airbus A380-300', 14, 18),
                        (9, 'Venerdi', 2, 7, 'Airbus A380-300', 14, 18),
                        (10, 'Lunedi', 3, 2, 'Airbus A380-800', 12, 15);
