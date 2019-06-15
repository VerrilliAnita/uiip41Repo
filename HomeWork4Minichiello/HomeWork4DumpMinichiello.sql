# #####################
# DUMPING DATA viaggi 
# #####################
insert into viaggiatore(cf,nome,cognome) values
						("mnctms94a05a399l","tommaso","minichiello"),
                        ("cf2","pompilio","suglia"),
                        ("cf3","danilo","ferrara"),
                        ("cf4","gianluca","giso"),
                        ("cf5","antonio","nisco");
                        
INSERT INTO aeroporto (id,citta,nazione,npiste) VALUES
				(1,"Roma","Italia",6),
                (2,"Amsterdam","Olanda",6),
                (3,"Napoli","Italia",6),
                (4,"Berlino","Germania",null),
                (5,"Mosca","Russia",6),
                (6,"Londra","Inghilterra",6),
                (7,"Barcellona","Spagna",6);
                
INSERT INTO aereo (tipoAereo,nPass,quantitaMerci) VALUES
				("Boing 737",232,300000),
                ("Boing 600",132,300000),
                ("Boing 910",432,500000),
                ("Boing re",92,25000);
                
insert into compagnia(idCompagnia,nome) values
					(1,"fly emirates"),
                    (2,"air france"),
                    (3,"rayan air"),
                    (4,"alitalia"),
                    (5,"easyJet"),
                    (6,"Lufthansa");
                
INSERT INTO volo (idVolo,giornoSett,aeroportoPart,aeroportoArr,tipoAereo,compagnia,oraPartenza,oraArrivo) VALUES
				(1,"lunedi",3,2,"Boing 737",1,10,14),
                (2,"martedi",6,2,"Boing 600",1,15,20),
                (3,"lunedi",5,2,"Boing 737",2,03,14),
                (4,"mercoledi",1,5,"Boing 600",3,15,19),
                (5,"giovedi",7,5,"Boing 737",3,05,17),
                (6,"venerdi",1,3,"Boing 910",4,10,14),
                (7,"sabato",2,6,"Boing 910",5,13,19),
                (8,"domenica",4,2,"Boing 737",5,10,14),
                (9,"venerdi",3,2,"Boing re",6,01,14);
                
insert into prenotazione(idPrenotazione,volo,viaggiatore) values
						(1,1,"cf2"),
                        (2,1,"mnctms94a05a399l"),
                        (3,3,"mnctms94a05a399l"),
                        (4,4,"mnctms94a05a399l"),
                        (5,4,"cf3"),
                        (6,5,"cf2"),
                        (7,6,"cf4"),
                        (8,7,"cf5"),
                        (9,8,"cf5"),
                        (10,9,"cf2");

