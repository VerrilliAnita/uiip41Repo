INSERT INTO passeggero(codiceFiscale, nome, cognome) VALUES
					  ('ZZZZZZZZZZZZZZZ', 'Emanuele', 'Morante'),
                      ('XXXXXXXXXXXXXXX', 'Pompilio', 'Suglia'),
                      ('CCCCCCCCCCCCCCC', 'Antonio', 'Nisco'),
                      ('VVVVVVVVVVVVVVV', 'Giuseppe', 'Ristaino'),
                      ('BBBBBBBBBBBBBBB', 'Gianluca', 'Giso'),
                      ('NNNNNNNNNNNNNNN', 'Tommaso', 'Minichiello'),
                      ('MMMMMMMMMMMMMMM', 'Danilo', 'Ferrara'),
                      ('AAAAAAAAAAAAAAA', 'Paolo', 'Verdi'),
                      ('SSSSSSSSSSSSSSS', 'Chiara', 'Rosso');

INSERT INTO compagnia(id, nome, nazione) VALUES
					 (1, '	Ryanair', 'Irlanda'),
                     (2, 'Air France', 'Francia'),
                     (3, 'Alitalia', 'Italia'),
                     (4, 'easyJet', 'Regno Unito');

INSERT INTO aeroporto (id, citta, nazione, numeroPiste) VALUES
					  (1, 'Roma', 'Italia', 3),
					  (2, 'Milano', 'Italia', 3),
					  (3, 'Berlino', 'Germania', null),
					  (4, 'Parigi', 'Francia', 3),
					  (5, 'Napoli', 'Italia', 3);
                 
INSERT INTO aereo (tipo, numeroPosti, quantitaMerci, compagnia) VALUES
				  ('EEEEE', 50, 3, 1),
                  ('FFFFF', 45, 3, 2),
                  ('GGGGG', 60, 3, 3),
                  ('HHHHH', 50, 3, 4),
                  ('AAAAA', 50, 3, 1),
                  ('BBBBB', 50, 3, 2),
                  ('CCCCC', 45, 3, 3),
                  ('DDDDD', 65, 3, 4),
                  ('IIIII', 45, 3, 1),
                  ('LLLLL', 65, 3, 2),
                  ('MMMMM', 45, 3, 3);
                  
INSERT INTO volo (id, giorno, aeroportoPart, aeroportoArr, aereo, oraPart, oraArr) VALUES
				 (1, 'Lunedi', 1, 2, 'LLLLL', 10, 15),
                 (2, 'Domenica', 4, 2, 'BBBBB', 17, 18),
                 (3, 'Sabato', 5, 2, 'AAAAA', 20, 22),
                 (4, 'Martedi', 3, 5, 'LLLLL', 21, 33),
                 (5, 'Venerdi', 3, 4, 'DDDDD', 12, 13),
                 (6, 'Sabato', 4, 3, 'HHHHH', 12, 13),
                 (7, 'Mercoledi', 2, 3, 'GGGGG', 16, 17),
                 (11, 'Mercoledi', 2, 3, 'GGGGG', 9, 10),
                 (9, 'Mercoledi', 1, 3, 'GGGGG', 15, 17),
                 (10, 'Mercoledi', 1, 3, 'GGGGG', 4, 5),
                 (8, 'Lunedi', 1, 5, 'IIIII', 2, 3);
                 
INSERT INTO biglietto (id, passeggero, idvolo, giorno, prezzo) VALUES
					  (10, 'ZZZZZZZZZZZZZZZ', 1, 'Lunedi', 50),
                      (11, 'AAAAAAAAAAAAAAA', 3, 'Sabato', 50),
                      (12, 'XXXXXXXXXXXXXXX', 7, 'Mercoledi', 50),
                      (13, 'BBBBBBBBBBBBBBB', 10, 'Mercoledi', 50),
                      (14, 'VVVVVVVVVVVVVVV', 8, 'Lunedi', 50),
                      (15, 'SSSSSSSSSSSSSSS', 9, 'Mercoledi', 50),
                      (16, 'ZZZZZZZZZZZZZZZ', 2, 'Domenica', 50),
                      (17, 'MMMMMMMMMMMMMMM', 6, 'Sabato', 50),
                      (18, 'CCCCCCCCCCCCCCC', 1, 'Lunedi', 50);