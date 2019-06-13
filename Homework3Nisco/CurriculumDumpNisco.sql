INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita) VALUES 
													(1, 'Nisco', 'Antonio', 'via tufi', 47, 'zungoli', '1996-10-9', 'ariano irpino'),
													(2, 'rossi', 'roberto', 'via ramo', 7, 'roma', '1996-8-12', 'roma'),
													(3, 'bianchi', 'barbara', 'via basso', 64, 'bari', '1997-8-6', 'bari'),
													(4, 'gialli', 'giulia', 'via gela', 56, 'genova', '1992-5-8', 'genova'),
													(5, 'verdi', 'vittorio', 'via vela', 67, 'verona', '1992-7-9', 'vicenza'),
													(6, 'marrone', 'matteo', 'via mora', 78, 'milano', '1996-10-3', 'messina');
                                                    
                                                    
                                                    
INSERT INTO telefono (numero, candidato) VALUES 
												('3331111111', 1),
												('3332222222', 2),
												('3333333333', 3),
												('3334444444', 4),
												('3335555555',5),
												('3336666666', 4);

INSERT INTO attivita (codice, mansione) VALUES 
					(111, 'impiegato'),
					(222, 'contabile'),
					(333, 'sviluppatore'),
					(444, 'progettista'),
					(555, 'analyst'),
					(666, 'manager');
                    
                    
INSERT INTO esperienza(codice, candidato, attivita, datainizio, datafine, azienda) VALUES 
								(1,1,111 ,'2015-2-2', '2015-4-4', 'IBM'),
								(2,2,222, '2016-3-5', '2016-7-6', 'Accenture'),
								(3,3,333, '2015-8-8', '2015-9-9', 'Deloitte'),
								(4,4,444, '2017-6-6', '2017-7-7', 'EY'),
								(5,5,555, '2019-1-1', '2019-4-4', 'Pwc'),
								(6,6,666,'2018-3-3', '2018-8-8', 'IBM'),
								(7,1,111,'2016-4-4', '2016-7-7', 'Apple'),
								(8,3,222,'2018-10-10', '2018-11-11', 'SopraSteria');
                                
INSERT INTO titolostudio(codice, descrizione) VALUES 
											(1, 'Economia'),
											(2, 'Ingegneria Informatica'),
											(3, 'Ing. Telecomunicazioni'),
											(4, 'Ing-elettronica'),
											(5, 'Ing-Gestionale'),
											(6, 'EconomiaFinanza'),
											(7, 'Management'),
											(8, 'Marketing'),
											(9, 'IngBiotecnolica'),
											(10, 'EconomiaCommercio');
					

INSERT INTO istruzione (codice, candidato, titolo, voto, data,istituto) VALUES 
																(1,1,1,'110', '2019-3-5', 'Sapienza'),
																(2,2,2, '102', '2019-5-7', 'Politecnico'),
																(3,3,3, '108', '2019-3-4', 'Sannio'),
																(4,4,4, '110', '2019-1-8', 'Dannunzio'),
																(5,5,5, '102', '2018-12-12', 'FedericoII'),
																(6,6,6, '105', '2018-2-3', 'Partenophe'),
																(7,1,7, '100', '2017-4-5', 'UniFisciano'),
																(8,2,8,'110', '2018-6-7', 'UniBologna'),
																(9,6,10, '98', '2017-6-8', 'UniCagliari');



