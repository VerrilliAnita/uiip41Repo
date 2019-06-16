


INSERT INTO aeroporto(id,citta,nazione,npiste) VALUES
				(1, 'ROMA', 'ITALIA',3),
				(2, 'NAPOLI', 'ITALIA',4),
				(3, 'LONDRA', 'INGHILTERRA',5),
				(4, 'PARIGI', 'FRANCIA',7),
				(5, 'BERLINO', 'GERMANIA',8),
				(6, 'BRUXELLES', 'BELGIO',NULL),
                (7, 'AMSTERDAM', 'OLANDA',2),
                (8, 'MADRID', 'SPAGNA',4);
				

INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('Airbus A318-F-GUGE', 150, 19231),
				('Airbus A319-F-GRXC',200 ,17222),
                ('Airbus A340',100 ,17283),
                ('Airbus A320-200',200 ,13443),
                ('Airbus A319-100',200 ,17843),
				('Airbus A330-200',300 ,15443),
                ('Boeing 737-700',189,9821),
				('Boeing 737-800',149 ,7555),
				('Boeing 747-400',500 ,22145);
                
			
                
INSERT INTO compagnia(nome,nazione) VALUES
				('Alitalia','Italia'),
				('AirFrance','Francia'),
				('RyanAir','Irlanda'),
				('Lufthansa','Germania'),
				('Turkish Airlines','Turchia'),
				('British Airways','Gran Bretagna'),
				('Iberia','Spagna');
				
INSERT INTO proprieta (compagnia,aereo) VALUES
				('Alitalia','Airbus A330-200'),
				('Alitalia','Airbus A319-100'),
				('Alitalia','Airbus A320-200'),
				('AirFrance','Airbus A318-F-GUGE'),
				('AirFrance','Airbus A319-F-GRXC'),
				('AirFrance','Airbus A340'),
				('Turkish Airlines','Airbus A330-200'),
				('Turkish Airlines','Airbus A319-100'),
                ('Turkish Airlines','Boeing 737-700'),
                ('RyanAir','Boeing 737-700'),
                ('RyanAir','Boeing 737-800'),
                ('Lufthansa','Airbus A330-200'),
				('Lufthansa','Airbus A319-100'),
                ('Lufthansa','Boeing 747-400'),
                ('British Airways','Airbus A330-200'),
				('British Airways','Airbus A319-100'),
                ('British Airways','Boeing 747-400'),
                ('Iberia','Airbus A330-200'),
				('Iberia','Airbus A319-100');
                
                
INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, compagnia, oraPartenza, oraArrivo) VALUES
						(1, 'Lunedi', 1, 2, 'Airbus A330-200','Alitalia', 12, 13),
						(1, 'Mercoledi', 1, 5, 'Airbus A319-100','Alitalia', 15, 18),
                        (2, 'Martedi', 2, 4, 'Boeing 737-700','RyanAir', 16, 19),
                        (3, 'Lunedi', 1, 3, 'Airbus A320-200','Alitalia', 12, 15),
                        (4, 'Giovedi', 3, 1, 'Boeing 737-800','RyanAir', 12, 15),
                        (4, 'Martedi', 8, 5, 'Airbus A330-200','Iberia', 15, 18),
                        (5, 'Domenica', 6, 4, 'Airbus A318-F-GUGE','AirFrance', 17, 24),
                        (6, 'Venerdi', 4, 7, 'Airbus A319-F-GRXC','AirFrance', 16, 22),
                        (7, 'Sabato', 1, 2, 'Airbus A319-100','Lufthansa', 15, 16),
                        (8, 'Sabato', 2, 7, 'Boeing 737-800','RyanAir', 14, 18),
                        (9, 'Venerdi', 2, 7, 'Airbus A330-200','Turkish Airlines', 14, 18),
                        (10, 'Lunedi', 3, 2, 'Airbus A330-200','British Airways',12, 15),
                        (11, 'Lunedi', 5, 7, 'Boeing 747-400','Lufthansa', 10, 12);

INSERT INTO prenotazione (id, codiceFiscale, nome, cognome,volo) VALUES
				(1,'GSIGLC91H22A399R', 'Gianluca', 'Giso',1),
				(2,'NSCANT96K19E782I', 'Antonio', 'Nisco',1),
				(3,'MNCTMM94L05F893J', 'Tommaso', 'Minichiello',1),
				(4,'RSSMRA88M82G935M', 'Maria', 'Rossi',2),
                (5,'NRRANT88K82G935M', 'Antonio', 'Neri',2),
                (6,'RSTGSP89A51J929H', 'Giuseppe', 'Ristaino',3),
                (7,'MRTEMN91M79H978B', 'Emanuele', 'Morante',3),
                (8,'RMNFRN87K65N229O', 'Francesca', 'Romano',4),
                (9,'RSSANT88J78M297V', 'Antonella', 'Rossi',5),
                (10,'NMMEPT82K53BT9X', 'Noemi', 'Esposito',6),
                (11,'GVNCLM76A00NM7W', 'Giovanni', 'Colombo',7),
				(12,'LRSMRC91K94KL1D', 'Marco', 'Lo Russo',6),
                (13,'GVNCRL88L34CV7M', 'Giovanni', 'Carli',7),
                (14,'RMNFRN87K65N229O', 'Francesca', 'Romano',7);
                
                           