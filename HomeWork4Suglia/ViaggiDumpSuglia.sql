INSERT INTO aeroporto (id, citta, nazione, nPiste) VALUES
					(1, 'Roma', 'Italia', 4),
                    (2, 'Milano', 'Italia', 5),
					(3, 'Napoli', 'Italia', 3),
                    (4, 'Parigi', 'Francia', null),
                    (5, 'Madrid', 'Spagna', 4),
                    (6, 'Berlino', 'Germania', 8),
                    (7, 'Monaco', 'Germania', 4);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
					('Boing 244-43', 150, 50),
					('Boing 345-45', 150, 50),
                    ('Boing 666-44', 150, 50),
                    ('Airbus 888', 110, 10),
                    ('Airbus 999', 70, 10),
                    ('Airbus 456', 60, 10),
                    ('Airbus 323', 80, 20),
                    ('Airbus 908', 100, 30);
                    
INSERT INTO compagnia (idComp, nomeCompagnia, tipoAereo) VALUES
                    (1,'Alitalia','Airbus 908'),
                    (2,'Alitalia','Airbus 456'),
                    (3,'Alitalia','Boing 244-43'),
                    (4,'Alitalia','Boing 666-44'),
                    (5,'AirFrance','Boing 666-44'),
                    (6,'AirFrance','Boing 345-45'),
                    (7,'AirFrance','Boing 244-43'),
                    (8,'AirFrance','Airbus 456'),
                    (9,'Easyjet','Airbus 908'),
                    (10,'Easyjet','Airbus 999'),
                    (11,'Easyjet','Airbus 888'),
                    (12,'Ryanair','Airbus 888'),
                    (13,'Ryanair','Airbus 999'),
                    (14,'Ryanair','Airbus 323'),
                    (15,'Ryanair','Airbus 456'),
                    (16,'Ryanair','Airbus 908');
                    
INSERT INTO volo (idVolo, giornoSettimana, aeroportoPart, aeroportoArr, compagnia, oraPartenza, oraArrivo) VALUES
					(1,'lunedi',1,7,1,15,18),
                    (2,'mercoledi', 2, 1, 2	, 12, 18),
                    (3,'venerdi', 3, 1, 3	, 12, 18),
					(4,'venerdi'	, 5, 1, 4	, 08, 15),
                    (5,'sabato'	, 1, 4, 5	, 10, 18),
                    (6,'sabato'	, 7, 5, 6	, 12, 15),
                    (7,'sabato'	, 1, 4, 7	, 10, 13),
                    (8,'domenica'	, 2, 7, 8	, 11, 16),
                    (9,'lunedi'	, 1, 4, 9 	, 09, 12);
                    
	
                    
INSERT INTO passeggero (codiceFiscale, nome, cognome) VALUES
                    ('AAAAAAAAAAAAAAAA', 'Mario', 'Rossi'),
                    ('BBBBBBBBBBBBBBBB', 'Antonio', 'Bianchi'),
                    ('CCCCCCCCCCCCCCCC', 'Marco', 'Verdi'),
					('DDDDDDDDDDDDDDDD', 'Francesco', 'Totti'),
                    ('EEEEEEEEEEEEEEEE', 'Filippo', 'Inzaghi'),
                    ('FFFFFFFFFFFFFFFF', 'Andrea', 'Pirlo'),
                    ('GGGGGGGGGGGGGGGG', 'Alex', 'Del Piero'),
                    ('HHHHHHHHHHHHHHHH', 'Gigi', 'Buffon'),
                    ('IIIIIIIIIIIIIIII', 'Cristiano', 'Ronaldo'),
                    ('LLLLLLLLLLLLLLLL', 'Antonio', 'Onorato');


INSERT INTO prenotazione (codicePrenotazione, codiceFiscale, idVolo) VALUES
                    ('A1111','AAAAAAAAAAAAAAAA', 1),
                    ('A2222','BBBBBBBBBBBBBBBB', 1),
                    ('A3333','CCCCCCCCCCCCCCCC', 1),
                    ('A4444','DDDDDDDDDDDDDDDD', 1),
                    ('A5555','EEEEEEEEEEEEEEEE', 1),
                    ('E0000','AAAAAAAAAAAAAAAA', 4),
                    ('E2222','EEEEEEEEEEEEEEEE', 4),
                    ('E1111','GGGGGGGGGGGGGGGG', 4),
                    ('F0000','FFFFFFFFFFFFFFFF', 6),
                    ('F1111','LLLLLLLLLLLLLLLL', 6),
                    ('F2222','IIIIIIIIIIIIIIII', 6),
                    ('F3333','BBBBBBBBBBBBBBBB', 6),
                    ('R0000','BBBBBBBBBBBBBBBB', 9),
                    ('R5555','EEEEEEEEEEEEEEEE', 9),
                    ('R1111','GGGGGGGGGGGGGGGG', 9),
                    ('R2222','CCCCCCCCCCCCCCCC', 9),
                    ('R3333','HHHHHHHHHHHHHHHH', 9);
                    
                    
                    
                    
                    
		
                    

                    
									
         



