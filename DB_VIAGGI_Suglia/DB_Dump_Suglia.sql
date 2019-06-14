INSERT INTO aeroporto (id, citta, nazione, nPiste) VALUES
					(1, 'Roma', 'Italia', 4),
                    (2, 'Milano', 'Italia', 5),
					(3, 'Napoli', 'Italia', 3),
                    (4, 'Parigi', 'Francia', null),
                    (5, 'Madrid', 'Spagna', 4),
                    (6, 'Berlino', 'Germania', 8),
                    (7, 'Monaco', 'Germania', 4);
                    
INSERT INTO aereo (tipoAereo, nPass, quantitaMerci) VALUES
					('Boing 345-45', 150, 50),
                    ('Airbus 456', 60, 10),
                    ('Airbus 323', 80, 20),
                    ('Airbus 908', 100, 30);
                    
INSERT INTO volo (idVolo, giornoSettimana, aeroportoPart, aeroportoArr, tipoAereo, oraPartenza, oraArrivo) VALUES
					(1, 'lunedì', 1, 7, 'Boing 345-45', 12, 18),
                    (2, 'mercoledì', 2, 1, 'Boing 345-45', 12, 18),
                    (3, 'venerdì', 3, 1, 'Boing 345-45', 12, 18),
					(4, 'venerdì', 5, 1, 'Airbus 908', 08, 15),
                    (5, 'sabato', 1, 4, 'Airbus 456', 10, 18),
                    (6, 'sabato', 7, 5, 'Airbus 456', 12, 15),
                    (7, 'sabato', 1, 4, 'Airbus 323', 10, 13),
                    (8, 'domenica', 2, 7, 'Airbus 323', 11, 16),
                    (9, 'lunedì', 1, 4, 'Airbus 323', 09, 12);
                    
                    
                    

                  