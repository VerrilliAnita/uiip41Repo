INSERT INTO aeroporto (id, citta, nazione, npiste) VALUES
					(1, 'Roma', 'Italia', 6),
					(2, 'Milano', 'Italia', 9),
					(3, 'Londra', 'Inghilterra', 7),
					(4, 'Parigi', 'Francia', 5),
					(5, 'Denver', 'USA', 4),
					(7, 'Napoli', 'Italia', 5),
					(6, 'Detroit', 'USA', NULL),
					(8, 'Amsterdam', 'Olanda', 5);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
					('Airbus A380-900', 900, 100),
					('Boeing 747-8', 0, 700),
					('Airbus A340-600', 400, 20),
					('Airbus A340-300', 295, 0);
                    
INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, oraPartenza, oraArrivo) VALUES
					(1, 'lunedi', 1, 2, 'Airbus A380-900', 7, 8),
                    (2, 'lunedi', 1, 2, 'Airbus A340-600', 9, 10),
                    (3, 'lunedi', 1, 4, 'Airbus A380-900', 12, 14),
                    (1, 'domenica', 2, 3, 'Airbus A380-900', 13, 19),
                    (4, 'martedi', 5, 3, 'Airbus A340-300', 15, 22),
                    (5, 'martedi', 4, 5, 'Boeing 747-8', 6, 16),
                    (6, 'giovedi', 3, 1, 'Boeing 747-8', 6, 9),
                    (6, 'venerdi', 7, 6, 'Airbus A380-900', 7, 22),
                    (7, 'sabato', 2, 5, 'Airbus A340-600', 11, 23),
                    (8, 'mercoledi', 3, 8, 'Airbus A340-600', 11, 23),
                    (9, 'martedi', 2, 8, 'Boeing 747-8', 14, 22),
                    (10, 'venerdi', 2, 8, 'Airbus A340-600', 9, 13),
                    (11, 'venerdi', 3, 8, 'Airbus A340-600', 9, 13);
                    
