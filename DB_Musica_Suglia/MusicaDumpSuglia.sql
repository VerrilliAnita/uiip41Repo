INSERT INTO Strumento (nome, categoria) VALUES
					('chitarra', 'corde'),
					('flauto', 'fiato'),
					('arpa', 'corde'),
					('basso', 'corde'),
                    ('batteria', 'ritmica'),
                    ('violino', 'corde'),
                    ('tromba', 'ottoni'),
					('sassofono', 'ottoni'),
					('piano', 'corde');
                    
                    
INSERT INTO Musicista (codiceFiscale, nome, cognome, datanascita, sesso) VALUES
					('SGLGPL89D17A39HW', 'Pompilio','Suglia', '1989-08-17', 'M'),
					('AHKGPL8tgh7A39HW', 'Gianluca','Giso', '1993-04-16', 'M'),
                    ('JKLGPL8tgh7A39HW', 'Laura','Verdi', '1983-03-01', 'F'),
                    ('ANJGPL8tgh7A367W', 'Bianca','Tiso', '1981-02-01', 'F'),
					('BRFGPL8tgh7A367W', 'Giuseppe','Morante', '1958-08-01', 'M'),
					('TNTGPL8tgh7A367W', 'Tommaso','Minichiello', '1971-06-01', 'M');
                    
INSERT INTO Abilita (musicista, strumento) VALUES
					('TNTGPL8tgh7A367W', 'chitarra'),
					('TNTGPL8tgh7A367W', 'piano'),
                    ('SGLGPL89D17A39HW', 'chitarra'),
					('SGLGPL89D17A39HW', 'sassofono'),
					('JKLGPL8tgh7A39HW', 'chitarra'),
                    ('JKLGPL8tgh7A39HW', 'batteria'),
                    ('JKLGPL8tgh7A39HW', 'piano'),
                    ('JKLGPL8tgh7A39HW', 'basso'),
					('AHKGPL8tgh7A39HW', 'basso'),
                    ('ANJGPL8tgh7A367W', 'piano'),
                    ('BRFGPL8tgh7A367W', 'piano'),
                    ('BRFGPL8tgh7A367W', 'violino'),
                    ('BRFGPL8tgh7A367W', 'tromba'),
					('BRFGPL8tgh7A367W', 'arpa');


               