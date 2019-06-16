INSERT INTO aeroporto (id, citta, nazione, npiste) VALUES
					(1, 'Roma', 'Italia', 6),
					(2, 'Milano', 'Italia', 9),
					(3, 'Londra', 'Inghilterra', 7),
					(4, 'Parigi', 'Francia', 5),
					(5, 'Denver', 'USA', 4),
					(6, 'Detroit', 'USA', NULL),
					(7, 'Napoli', 'Italia', 5),
					(8, 'Amsterdam', 'Olanda', 5);
                    
INSERT INTO compagnia (nome, nazioneSede) VALUES
					('Alitalia', 'Italia'),
					('Fly Emirates', 'Emirati Arabi Uniti'),
					('Ryanair', 'Irlanda'),
					('EasyJet', 'Regno Unito'),
					('Lufthansa', 'Germania');                    
                    
INSERT INTO aereo (tipoAereo, nomeCompagnia, nPass, quantitaMerci) VALUES
					('Airbus A380-900', 'Fly Emirates', 900, 100),
					('Airbus A380-900', 'Ryanair', 900, 100),
					('Airbus A380-900', 'Lufthansa', 900, 100),
                    ('Boeing 747-8', 'Lufthansa', 0, 700),
                    ('Boeing 747-8', 'EasyJet', 0, 700),
                    ('Boeing 747-8', 'Alitalia', 0, 700),
					('Airbus A340-600', 'Fly Emirates', 400, 20),
					('Airbus A340-600', 'Ryanair', 400, 20),
					('Airbus A340-600', 'Lufthansa', 400, 20),
					('Airbus A340-600', 'EasyJet', 400, 20),
					('Airbus A340-300', 'Alitalia', 295, 0),
					('Airbus A340-300', 'EasyJet', 295, 0),
					('Airbus A340-300', 'Ryanair', 295, 0),
					('Airbus A340-300', 'Lufthansa', 295, 0);
                    
INSERT INTO volo (idVolo, giornoSett, aeroportoPart, aeroportoArr, tipoAereo, nomeCompagnia, oraPartenza, oraArrivo) VALUES
					(1, 'lunedi', 1, 2, 'Airbus A380-900', 'Fly Emirates',15, 18),
                    (2, 'lunedi', 1, 2, 'Airbus A340-600', 'Ryanair', 9, 10),
                    (3, 'lunedi', 1, 4, 'Airbus A380-900', 'Lufthansa', 12, 14),
                    (1, 'domenica', 2, 3, 'Airbus A380-900', 'Lufthansa', 13, 19),
                    (4, 'martedi', 5, 3, 'Airbus A340-300', 'Alitalia', 15, 22),
                    (5, 'martedi', 4, 5, 'Boeing 747-8', 'EasyJet', 6, 16),
                    (6, 'giovedi', 3, 1, 'Boeing 747-8', 'Alitalia', 6, 9),
                    (6, 'venerdi', 7, 6, 'Airbus A380-900', 'Fly Emirates', 7, 22),
                    (7, 'sabato', 2, 5, 'Airbus A340-600', 'Ryanair', 11, 23),
                    (8, 'mercoledi', 3, 8, 'Airbus A340-600', 'Fly Emirates', 11, 23),
                    (9, 'martedi', 2, 8, 'Boeing 747-8', 'Lufthansa', 14, 22),
                    (10, 'venerdi', 2, 8, 'Airbus A340-600', 'EasyJet', 9, 13),
                    (11, 'venerdi', 3, 8, 'Airbus A340-600', 'EasyJet', 9, 13),
                    (1, 'giovedi', 1, 6, 'Airbus A340-600', 'Ryanair', 15, 23);
                    
INSERT INTO passeggero (codiceFiscale, nome, cognome) VALUES
					('GPPRST54HT7UJMDL', 'Giuseppe', 'Ristaino'),
					('PPPBDD78ASDM9ADS', 'Pippo', 'Baudo'),
					('DLGVNN54KDHNRW2D', 'Adalgisa', 'Giovannini'),
					('RSSRSS12SADUNDKS', 'Rosa', 'Rose'),
					('GNNSTT43DMLMKDIW', 'Gennarino', 'Settebello');
                    
INSERT INTO prenotazione (idPrenotazione, idPasseggero, idVolo, giornoSett, prezzo) VALUES
					(1, 'GPPRST54HT7UJMDL', 3, 'lunedi', 56.89),
					(2, 'PPPBDD78ASDM9ADS', 4, 'martedi', 87.99),
					(3, 'DLGVNN54KDHNRW2D', 10, 'venerdi', 160.99),
					(4, 'RSSRSS12SADUNDKS', 3, 'lunedi', 87.89),
					(5, 'GNNSTT43DMLMKDIW', 10, 'venerdi', 120.88),
                    (6, 'GPPRST54HT7UJMDL', 1, 'lunedi', 34.89),
					(7, 'DLGVNN54KDHNRW2D', 1, 'lunedi', 23.99),
					(8, 'PPPBDD78ASDM9ADS', 1, 'giovedi', 56.99);
                    

                    
