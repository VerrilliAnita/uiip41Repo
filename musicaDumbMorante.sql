INSERT INTO musicista (codiceFiscale, nome, cognome, dataNascita, sesso) VALUES
					  ('MMMMMMMMMMMMMMMM', 'Emanuele', 'Morante', '1991-05-02', 'M'),
                      ('OOOOOOOOOOOOOOOO', 'Alessio', 'Blu', '1989-05-02', 'M'),
                      ('RRRRRRRRRRRRRRRR', 'Luca', 'Verdi', '1992-05-02', 'M'),
                      ('IIIIIIIIIIIIIIII', 'Chiara', 'Scura', '1967-05-02', 'F'),
                      ('CCCCCCCCCCCCCCCC', 'Giulia', 'Marrone', '1998-05-02', 'F'),
                      ('HHHHHHHHHHHHHHHH', 'Mario', 'Nero', '1957-05-02', 'M'),
                      ('AAAAAAAAAAAAAAAA', 'Giuseppe', 'Giallo', '1990-05-02', 'M'),
                      ('NNNNNNNNNNNNNNNN', 'Rita', 'Rosso', '1990-05-02', 'F'),
                      ('NNNNNNNNNNNNNNNA', 'Rita Flavia', 'Marchesiello', '1999-05-02', 'F');
                      
INSERT INTO strumento (nome, categoria) VALUES
					  ('Chitarra', 'Corde'),
                      ('Violino', 'Corde'),
                      ('Benjo', 'Corde'),
                      ('Arpa', 'Corde'),
                      ('Pianoforte', 'Corde'),
                      ('Batteria', 'Ottoni'),
                      ('Flauto', 'Fiato'),
                      ('Basso', 'Corde');
                      
INSERT INTO abilita (musicista, strumento) VALUES
					  ('MMMMMMMMMMMMMMMM','Chitarra'),
                      ('OOOOOOOOOOOOOOOO','Benjo'),
                      ('AAAAAAAAAAAAAAAA','Violino'),
                      ('RRRRRRRRRRRRRRRR','Benjo'),
                      ('RRRRRRRRRRRRRRRR', 'Arpa'),
                      ('IIIIIIIIIIIIIIII', 'Pianoforte'),
                      ('OOOOOOOOOOOOOOOO', 'Basso'),
                      ('IIIIIIIIIIIIIIII', 'Chitarra'),
                      ('CCCCCCCCCCCCCCCC', 'Batteria'),
                      ('HHHHHHHHHHHHHHHH', 'Flauto'),
                      ('HHHHHHHHHHHHHHHH', 'Basso');

                      
