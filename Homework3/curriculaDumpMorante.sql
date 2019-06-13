INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita) VALUES
					  (10, 'Morante', 'Emanuele', 'viale mellusi', '82100', 'Benevento', '1991-02-20', 'Benevento'),
                      (11, 'Marchesello', 'Rita Flavia', 'via garibaldi', '82100', 'Napoli', '1997-01-20', 'Napoli'),
                      (12, 'Ristaino', 'Giuseppe', 'viale atlantici', '82100', 'Benevento', '1998-04-13', 'Benevento'),
                      (13, 'Suglia', 'Pompilio', 'via quirino majorana', '82100', 'Roma', '1996-06-23', 'Roma'),
                      (14, 'Ferrara', 'Danilo', 'via cesare giorgio raita', '82100', 'Roma', '1990-05-21', 'Roma'),
                      (15, 'Minichiello', 'Tommaso', 'mellusi', '82100', 'Milano', '1998-05-15', 'Milano');
                      
INSERT INTO telefono (numero, candidato) VALUES
					 (3463548288, 10),
                     (3393483452, 11),
                     (3393434392, 12),
                     (3424343192, 13),
                     (3393434242, 15);

INSERT INTO titolodistudio (codice, descrizione) VALUES
							(1, 'Ingegneria'),
                            (2, 'Economia'),
                            (3, 'Letteratura'),
                            (4, 'Filosofia'),
                            (5, 'Medicina'),
                            (6, 'Ingegneria'),
                            (7, 'Ingegneria'),
                            (8, 'Ingegneria');

INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto) VALUES
					   (20, 10, 1, 100, '2018-05-02', 'Federico II'),
                       (21, 11, 2, 100, '2018-05-02', 'Federico II'),
                       (22, 12, 3, 100, '2018-05-02', 'Federico II'),
                       (23, 12, 4, 100, '2018-05-02', 'Federico II'),
                       (26, 13, 7, 100, '2018-05-02', 'Federico II'),
                       (27, 13, 8, 100, '2018-05-02', 'Federico II'),
                       (24, 14, 5, 100, '2018-05-02', 'Federico II'),
                       (25, 15, 6, 100, '2018-05-02', 'Federico II');

INSERT INTO attivita (codice, mansione) VALUES
					 (100, 'Infermiere'),
                     (101, 'Sviluppatore'),
                     (102, 'Impiegato'),
                     (103, 'Medico'),
                     (104, 'Operaio'),
                     (105, 'Sviluppatore');
                       
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda) VALUES
					   (40, 10, 100, '2018-06-20', null, 'Biogem'),
                       (41, 11, 101, '2018-06-20', null, 'Biogem'),
                       (42, 12, 102, '2018-06-20', null, 'Biogem'),
                       (43, 13, 103, '2018-06-20', null, 'Biogem'),
                       (44, 14, 104, '2018-06-20', null, 'Biogem'),
                       (45, 15, 105, '2018-06-20', null, 'Biogem');