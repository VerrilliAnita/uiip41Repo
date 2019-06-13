INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, 
		cittaresidenza, datanascita, luogonascita) VALUES
        (1, 'Ristaino', 'Giuseppe', 'via prov. cerzete', '83042', 'Atripalda', '1989/04/25', 'Avellino'),
        (2, 'Baudo', 'Pippo', 'via prov. ottaviana', '65043', 'Paternopoli', '1999/05/12', 'Benevento'),
        (3, 'Giovannini', 'Adalgisa', 'via lombrichi', '87056', 'Afragola', '1987/09/04', 'Napoli');
	
INSERT INTO telefono (numero, candidato) VALUES
        ('3316540273', 1),
        ('83042256490', 1),
        ('3336749120', 3);
        

INSERT INTO titolostudio (codice, descrizione) VALUES
        (1, 'Ingegneria Informatica'),
        (2, 'Accademdia delle belle arti'),
        (3, 'Economia'),
        (4, 'Giurisprudenza');

INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto) VALUES
        (1, 1, 1, '110 e lode', '2019/04/18', 'Università degli studi del Sannio'),
        (2, 1, 2, '97', '2007/11/21', 'Università di Salerno'),
        (3, 2, 3, '110 e lode', '2001/12/01', 'Università di Milano'),
        (4, 2, 4, '110 e lode', '2005/10/12', 'Università di Milano'),
        (5, 3, 4, '99', '2008/07/23', 'Università di Napoli');

INSERT INTO attivita (codice, mansione) VALUES
        (1, 'Amministratore'),
        (2, 'Dipendente'),
        (3, 'Impiegato'),
        (4, 'Svilupaptore');
	
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda) VALUES
        (1, 1, 4, '2019/05/20', '2019/06/12', 'MACC'),
        (2, 1, 1, '2019/06/15', NULL, 'MACC'),
        (3, 2, 2, '2008/07/12', '2008/07/12', 'RAI'),
        (4, 2, 1, '2010/11/07', NULL, 'RAI');


