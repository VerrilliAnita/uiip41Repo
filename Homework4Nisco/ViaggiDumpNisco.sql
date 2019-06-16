insert into aeroporto (id,citta,nazione,npiste) values
				(1,'Roma','Italia',15),
                (2,'Siviglia','Spagna',14),
                (3,'Barcellona','Spagna',23),
                (4,'Milano','Italia',20),
                (5,'Berlino','Germania',15),
                (6,'Londra','Inghilterra',16),
                (7,'Mosca','Russia',null),
                (8,'Pechino','Cina',18);
                
insert into aereo (tipoAereo,npass,quantitamerci) values
				 ('A100', 100,50),
                 ('C180', 180,55),
                ('D220', 190,50),
                ('E260', 220,60),
                ('F300', 250,65),
                ('G340', 260,80),
                ('H380', 300,50),
                ('B140', 150,80);
               
               
                
insert into compagniaAerea (id,nome,tipoAereo) values
				(1,'Ryanair','A100'),
				(2,'Ryanair','B140'),
				(3,'EasyJet','B140'),
                (4,'Alitalia','C180'),
                (5,'Iberia','D220'),
                (6,'AirFrance','E260'),
                (7,'Norwegian','F300'),
                (8,'FlyEmirates','G340'),
                (9,'FlyEmirates','H380');  


insert into volo(idVolo,giornoSett,aeroportoPart,aeroportoArr,compagnia,oraPartenza,oraArrivo) values
		(111111,'martedi',1,4,2,15,21),
        (222222,'mercoledi',6,7,1,15,20),
        (333333,'giovedi',1,7,3,20,22),
        (444444,'martedi',8,2,2,18,21),
        (555555,'domenica',5,6,9,8,14),
        (666666,'venerdi',1,8,5,8,21),
        (777777,'sabato',3,7,1,10,12),
        (888888,'lunedi',8,3,5,15,17),
		(999999,'venerdi',5,1,4,9,13),
		(111222,'giovedi',1,2,3,20,22),
        (333222,'martedi',1,3,5,20,22),
		(333111,'sabato',4,2,2,18,21);
        

INSERT INTO persona (codiceFiscale, nome, cognome, datadinascita) VALUES 
											('AAAAAAAAAAAAAAAA', 'Antonio', 'Nisco', '1996-10-9'),
											('BBBBBBBBBBBBBBBB', 'BARBARA ', 'ROSSI', '1957-3-7'),
											('CCCCCCCCCCCCCCCC', 'CARLO', 'VERDONE', '1975-2-9'),
											('DDDDDDDDDDDDDDDD', 'DANIELE', 'DEROSSI', '1986-12-6'),
											('EEEEEEEEEEEEEEEE', 'ELSA', 'BIANCHI', '1997-4-7'),
											('GGGGGGGGGGGGGGGG', 'GIULIA', 'RIELLO', '1998-7-3'),
											('FFFFFFFFFFFFFFFF', 'FRANCO', 'BERO', '1990-4-5');

INSERT INTO prenotazione (idPrenotazione, passeggero, volo) VALUES 
											(1, 'AAAAAAAAAAAAAAAA', 111111),
											(2, 'AAAAAAAAAAAAAAAA', 222222),
											(3, 'BBBBBBBBBBBBBBBB', 111111),
											(4, 'BBBBBBBBBBBBBBBB', 222222),
											(5, 'CCCCCCCCCCCCCCCC', 333333),
											(6, 'DDDDDDDDDDDDDDDD', 111111),
											(7, 'DDDDDDDDDDDDDDDD', 222222),
											(8, 'EEEEEEEEEEEEEEEE', 444444),
											(9, 'EEEEEEEEEEEEEEEE', 555555),
											(10, 'GGGGGGGGGGGGGGGG', 666666),
											(11, 'GGGGGGGGGGGGGGGG', 777777),
											(12, 'FFFFFFFFFFFFFFFF', 888888),
											(13, 'FFFFFFFFFFFFFFFF', 111111),
											(14, 'GGGGGGGGGGGGGGGG', 999999),
											(15, 'FFFFFFFFFFFFFFFF', 333111),
											(16, 'AAAAAAAAAAAAAAAA', 333222),
											(17, 'BBBBBBBBBBBBBBBB', 111222);

