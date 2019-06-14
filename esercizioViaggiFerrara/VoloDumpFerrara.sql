INSERT INTO aeroporto (id, citta, nazione, npiste) VALUES
					(1, 'Roma', 'Italia', 15),
					(2, 'Milano', 'Italia', 20),
					(3, 'Milano', 'Italia', 20),
					(4, 'Napoli', 'Italia', null),
					(5, 'Amsterdam', 'Olanda', 30),
					(6, 'Londra', 'Inghilterra', null),
					(7, 'Roma', 'Italia', 15);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
				('Boeing777-200', 700, 50),
				('AirbusA340-300', 650, 70),
				('AirbusA340-500', 600, 65),
				('Boeing747-400', 800, 80),
				('AirbusA340-600', 750, 90),
				('AirbusA380-600', 550, 75);

INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, oraPartenza, oraArrivo) VALUES
				(32, 'Lunedi', 7, 3, 'Boeing747-400', 17, 18),
				(29, 'Martedi', 5, 4, 'AirbusA340-300', 11, 14),
				(1, 'Venerdi', 4, 5, 'Boeing777-200', 12, 13),
				(47, 'Sabato', 1, 6, 'AirbusA380-600', 9, 12),
                (34, 'Domenica', 3, 5, 'AirbusA340-500', 21, 23);