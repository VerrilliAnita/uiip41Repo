INSERT INTO strumento (nome, categoria) VALUES
					('chitarra', 'corde'),
					('batteria', 'ritmica'),
					('basso', 'corde'),
					('pianoforte', 'corde'),
					('pianola', 'corde'),
					('flauto', 'ottone'),
					('tromba', 'ottone'),
                    ('violino', 'corde');
                    
INSERT INTO musicista (codiceFiscale, nome,cognome,datadinascita,sesso) VALUES
					('aaaaaaaa11111111', 'antonio', 'nisco', '1996-10-9', 'm'),
					('bbbbbbbb22222222', 'barbara', 'rossi', '1993-5-7', 'f'),
					('cccccccc33333333', 'carlo', 'verdone', '1957-12-23', 'm'),
					('dddddddd44444444', 'damiano', 'faina', '1967-7-9', 'm'),
					('eeeeeeee55555555', 'elsa', 'gialla', '1985-11-20', 'f'),
					('ffffffff66666666', 'franco', 'esposito', '1995-4-7', 'm'),
					('gggggggg77777777', 'giulia', 'riello', '1997-7-8', 'f'),
                    ('hhhhhhhhiiiiiiii', 'holly', 'been', '1988-1-25', 'f');

INSERT INTO abilita (musicista, strumento) VALUES
					('aaaaaaaa11111111','chitarra'),
					('bbbbbbbb22222222', 'batteria'),
					('dddddddd44444444','basso'),
					('aaaaaaaa11111111','pianoforte'),
					('eeeeeeee55555555','pianola'),
					('bbbbbbbb22222222', 'flauto'),
					('ffffffff66666666','tromba'),
                    ('hhhhhhhhiiiiiiii','violino'),
                    ('hhhhhhhhiiiiiiii','pianola'),
                    ('bbbbbbbb22222222','chitarra'),
                    ('dddddddd44444444', 'flauto'),
                    ('gggggggg77777777','tromba')
                    ;
                    