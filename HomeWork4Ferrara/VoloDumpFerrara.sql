#Popolamento tabella aeroporto
INSERT INTO aeroporto (id, citta, nazione, npiste) VALUES
					(1, 'Roma', 'Italia', 15),
					(2, 'Milano', 'Italia', 20),
					(3, 'Milano', 'Italia', 25),
					(4, 'Napoli', 'Italia', null),
					(5, 'Amsterdam', 'Olanda', 30),
					(6, 'Londra', 'Inghilterra', null),
					(7, 'Roma', 'Italia', 12);
 
 #Popolamento tabella aereo
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('Boeing777-200', 440, 80),
				('AirbusA340-500', 372, 65),
				('AirbusA340-600', 420, 90),
				('AirbusA380-700', 525, 100),
                ('Boeing777-300', 550, 110),
                ('Boeing747-400', 624, 150),
                ('Boeing747-8', 700, 180);

#Popolamento tabella volo
INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, oraPartenza, oraArrivo) VALUES
				(1, 'Lunedi', 7, 3, 'Boeing777-200', 17, 18),
				(2, 'Martedi', 5, 4, 'AirbusA340-500', 11, 14),
				(3, 'Mercoledi', 4, 5, 'AirbusA340-600', 12, 15),
				(4, 'Giovedi', 1, 6, 'AirbusA380-700', 15, 18),
                (5, 'Venerdi', 3, 5, 'Boeing777-300', 21, 23),
                (6, 'Sabato', 1, 5, 'Boeing747-400', 18, 20),
                (7, 'Domenica', 6, 7, 'Boeing747-8', 10, 13);
			
#Popolamento tabella compagnia
INSERT INTO compagnia (nome, nazione) VALUES
				('Alitalia', 'Italia'),
				('British Airways', 'Regno Unito'),
				('Vueling', 'Spagna'),
				('Fly Emirates', 'Emirati Arabi Uniti'),
                ('Easyjet', 'Regno Unito'),
                ('Ryanair', 'Irlanda'),
                ('Jet2com', 'Scozia');
			
#Popolamento tabella proprieta
INSERT INTO proprieta (compagnia, aereo) VALUES
				('Alitalia', 'AirbusA340-500'),
				('British Airways', 'Boeing777-200'),
				('Vueling', 'AirbusA340-600'),
				('Fly Emirates', 'Boeing747-8'),
                ('Easyjet', 'AirbusA380-700'),
                ('Ryanair', 'Boeing777-300'),
                ('Jet2com', 'Boeing747-400');

#Popolamento tabella prenotazione
INSERT INTO prenotazione (id, codiceFiscale, nome, cognome, volo) VALUES
				(1, 'MRORSS90T15A415T', 'Mario', 'Rossi', 1),
				(2, 'FSTNER93T21A501T', 'Fausto', 'Neri', 2),
				(3, 'LRZBAN85T02A420T', 'Lorenzo', 'Bianchi', 3),
				(4, 'TMSMNL93T17A480T', 'Tommaso', 'Minichiello', 4),
                (5, 'DNLDBN96T05A310T', 'Daniela', 'Di Benedetto', 5),
                (6, 'ALSNPL82T24A501T', 'Alessandro', 'Napolitano', 6),
                (7, 'DRIGLC84T23A411T', 'Dario', 'Galluccio', 7);