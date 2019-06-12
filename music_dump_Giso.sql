INSERT INTO musicista (codiceFiscale, nome, cognome,dataNascita,sesso) VALUES
				('GSIGLC91H22A399R', 'Gianluca', 'Giso','1991-06-22','M'),
				('NSCANT96K19E782I', 'Antonio', 'Nisco','1996-05-19','M'),
				('MNCTMM94L05F893J', 'Tommaso', 'Minichiello','1994-05-01','M'),
				('RSSMRI88K82G935M', 'Mario', 'Rossi','1988-06-14','M'),
				('BNCMRI86P27V722N', 'Maria', 'Bianchi','1986-12-22','F');
				

INSERT INTO strumento (nome, categoria) VALUES
					('batteria', 'ritmica'),
					('maracas', 'ritmica'),
					('tromba', 'ottone'),
					('corno', 'ottone'),
					('sassofono', 'ottone'),
					('basso-tuba', 'ottone'),
					('chitarra', 'corda'),
                    ('basso', 'corda'),
                    ('violino', 'corda');
                    

INSERT INTO abilita (musicista, strumento) VALUES
					('GSIGLC91H22A399R', 'batteria'),
					('GSIGLC91H22A399R', 'chitarra'),
					('NSCANT96K19E782I', 'tromba'),
					('NSCANT96K19E782I', 'violino'),
					('MNCTMM94L05F893J', 'basso-tuba'),
					('MNCTMM94L05F893J', 'maracas'),
					('RSSMRI88K82G935M', 'corno'),
                    ('BNCMRI86P27V722N', 'sassofono'),
                    ('BNCMRI86P27V722N', 'basso'),
                    ('BNCMRI86P27V722N', 'violino'),
                    ('BNCMRI86P27V722N', 'basso-tuba'),
                    ('GSIGLC91H22A399R', 'sassofono'),
					('GSIGLC91H22A399R', 'violino')
                    ;
                    