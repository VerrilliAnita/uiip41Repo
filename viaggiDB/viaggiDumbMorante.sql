INSERT INTO aeroporto (id, citta, nazione, numeroPiste) VALUES
					  (1, 'Roma', 'Italia', 3),
					  (2, 'Milano', 'Italia', 3),
					  (3, 'Berlino', 'Germania', null),
					  (4, 'Parigi', 'Francia', 3),
					  (5, 'Napoli', 'Italia', 3);
                 
INSERT INTO aereo (tipo, numeroPosti, quantitaMerci) VALUES
				  ('AAAAA', 50, 3),
                  ('BBBBB', 50, 3),
                  ('CCCCC', 45, 3),
                  ('DDDDD', 65, 3),
                  ('EEEEE', 50, 3),
                  ('FFFFF', 45, 3),
                  ('GGGGG', 60, 3),
                  ('HHHHH', 50, 3),
                  ('IIIII', 45, 3),
                  ('LLLLL', 65, 3),
                  ('MMMMM', 45, 3);
                  
INSERT INTO volo (id, giorno, aeroportoPart, aeroportoArr, aereo, oraPart, oraArr) VALUES
				 (1, 'Lunedi', 1, 2, 'LLLLL', 12, 13),
                 (2, 'Domenica', 4, 2, 'BBBBB', 12, 13),
                 (3, 'Sabato', 5, 2, 'AAAAA', 12, 13),
                 (4, 'Martedi', 3, 5, 'LLLLL', 12, 13),
                 (5, 'Venerdi', 3, 4, 'DDDDD', 12, 13),
                 (6, 'Sabato', 4, 3, 'HHHHH', 12, 13),
                 (7, 'Mercoledi', 2, 3, 'GGGGG', 12, 13),
                 (11, 'Mercoledi', 2, 3, 'GGGGG', 12, 13),
                 (9, 'Mercoledi', 1, 3, 'GGGGG', 12, 13),
                 (10, 'Mercoledi', 1, 3, 'GGGGG', 12, 13),
                 (8, 'Lunedi', 1, 5, 'IIIII', 12, 13);