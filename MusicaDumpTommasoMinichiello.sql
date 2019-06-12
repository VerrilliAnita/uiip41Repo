Insert into strumento (nome, categoria) Values
					    ('cetra','corda'),
                        ("Arpa","corda"),
                        ("Banjo","corda"),
                        ("chitarra","corda"),
                        ("basso","corda"),
                        ("mandolino","corda"),
                        ("tamburello","ritmico"),
                        ("maracas","ritmico"),
                        ("tromba","ottone"),
                        ("corno","ottone"),
                        ("trombone","ottone");
                        
Insert into musicista (codiceFiscale, nome, cognome, datanascita, sesso) Values
					("MNCTMS94A05A399L","Tommaso","Minichiello","1994-01-05","M"),
                    ("POMSUG90A05A399L","Pompilio","Suglia","1990-01-05","M"),
                    ("ANTNIS94A05A399L","Antonio","Nisco","1996-01-05","M"),
                    ("EMAMOR94A05A399L","Emanuela","Morante","1993-01-05","F"),
                    ("FERDAN94A05A399L","Danilo","Ferrara","1989-01-05","M"),
                    ("OKSGON94A05A399L","Oksana","Gonchar","1990-01-03","F");
                    
Insert into abilita (musicista,strumento) values
					("MNCTMS94A05A399L","tromba"),
                    ("MNCTMS94A05A399L","Arpa"),
                    ("MNCTMS94A05A399L","Banjo"),
                    
                    ("POMSUG90A05A399L","chitarra"),
                    ("POMSUG90A05A399L","Arpa"),
                    ("POMSUG90A05A399L","trombone"),
                    
                    ("ANTNIS94A05A399L","cetra"),
                    ("ANTNIS94A05A399L","Banjo"),
                    
                    ("EMAMOR94A05A399L","cetra"),
                    ("EMAMOR94A05A399L","chitarra"),
                    ("EMAMOR94A05A399L","basso"),
                    ("EMAMOR94A05A399L","corno"),
                    
                    ("FERDAN94A05A399L","corno"),
                    ("FERDAN94A05A399L","cetra"),
                    ("FERDAN94A05A399L","mandolino"),
                    ("FERDAN94A05A399L","tamburello"),
                    
                    ("OKSGON94A05A399L","Arpa"),
                    ("OKSGON94A05A399L","cetra"),
                    ("OKSGON94A05A399L","mandolino"),
                    ("OKSGON94A05A399L","maracas");
                    