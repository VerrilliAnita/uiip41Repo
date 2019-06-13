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
				('Ryanair123', 180,50),
                ('AirFrance720', 220,80),
                ('Ryanair854', 189,55),
                ('EasyJet', 180,50),
                ('Alitalia', 236,60),
                ('Iberia333', 220,65),
                ('FlyEmirates', 260,80),
                ('Norwegian45', 200,50);

insert into volo(idVolo,giornoSett,aeroportoPart,aeroportoArr,tipoaereo,oraPartenza,oraArrivo) values
		(111111,'martedi',3,4,'Ryanair854',18,21),
        (222222,'mercoledi',6,7,'Ryanair123',15,20),
        (333333,'giovedi',1,7,'EasyJet',20,22),
        (444444,'martedi',8,2,'Ryanair854',18,21),
        (555555,'domenica',5,6,'FlyEmirates',8,14),
        (666666,'venerdi',1,8,'Iberia333',8,21),
        (777777,'sabato',3,7,'Ryanair854',10,12),
        (888888,'lunedi',8,3,'AirFrance720',15,17),
		(999999,'venerdi',5,1,'Alitalia',9,13),
		(111222,'giovedi',1,2,'EasyJet',20,22),
        (333222,'martedi',1,3,'Iberia333',20,22),
		(333111,'sabato',4,2,'Ryanair854',18,21);