# #####################
# DUMPING DATA curriculum
# #####################

INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza,datanascita,luogonascita) VALUES
				(1,"Minichiello","Tommaso","c.da sant'andrea","83035","Grottaminarda","1994-01-05","Ariano Irpino"),
                (2,"Nisco","Antonio","via Roma","84081","Salerno","1996-01-05","Salerno"),
				(3,"Ferrara","Danilo","via valle","83135","Avellino","1992-04-05","Ariano Irpino");
                
insert into titolostudio (codice,descrizione) values
					(1,"laurea informatica"),
					(2,"laurea ingegneria chimica"),
                    (3,"diploma superiore"),
                    (4,"laurea magistrale fisica");

insert into istruzione(codice,candidato,titolo,voto,data,istituto) values
		(1,1,1,"97","2019-03-29","università degli studi di Salerno"),
		(2,2,2,"104","2017-03-29","università degli studi di Roma"),
        (3,2,3,"110 e lode","2018-03-29","università degli studi di Roma");

                    

                    
insert into telefono(numero,candidato) values
					("3331293043",1),
                    ("3347645043",2),
                    ("3331131231",1),
                    ("3232139760",2);

insert into attivita(codice,mansione) values
					(1,"impiegato"),
					(2,"manager"),
					(3,"amministratore");

                    
insert into esperienza(codice,candidato,attivita,datainizio,datafine,azienda) values
						(1,1,1,"2017-02-03",null,"fma"),
                        (2,2,2,"2010-02-03","2011-01-04","ferrari"),
                        (3,2,3,"2015-02-03",null,"soprasteria"),
                        (4,3,3,"2014-02-03",null,"uiip");
                        


