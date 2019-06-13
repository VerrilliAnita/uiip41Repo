# #####################
# DUMPING DATA viaggi 
# #####################

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
                
INSERT INTO volo (idVolo,giornoSett,aeroportoPart,aeroportoArr,tipoAereo,oraPartenza,oraArrivo) VALUES
				(1,"lunedi",3,2,"Boing 737",10,14),
                (2,"martedi",6,2,"Boing 600",15,20),
                (3,"lunedi",5,2,"Boing 737",03,14),
                (4,"mercoledi",1,5,"Boing 600",13,14),
                (5,"giovedi",7,5,"Boing 737",05,17),
                (6,"venerdi",1,3,"Boing 910",10,14),
                (7,"sabato",2,6,"Boing 910",13,19),
                (8,"domenica",4,2,"Boing 737",10,14),
                (9,"venerdi",3,2,"Boing re",01,14);

