insert INTO aeroporto (id, citta, nazione, npiste) VALUES
					(22, 'Napoli','IT', 456),
					(24, 'Roma','IT', 654), 
                    (56, 'Amsterdam','ND', 444),
                    (28, 'Kyev','UA', 999);
                    
insert INTO aereo (tipoAereo, nPass, quantitaMerci ) VALUES
						 ('Airbus', 372, 1900 ),
						 ('Boeing', 777, 1930 ),
						 ('Airbus A380', 360, 1930 ),
						 ('Boeing S345', 457, 1569 );
                         
insert INTO volo (id, giornoSett, aeroportoPart, aeroportoArri, tipoAereo, oraPartenza,oraArrivo ) VALUES
						 (3463, 'Lun', 22, 24, 'Airbus', 13, 16 ),
						 (6544, 'Mart', 56, 28, 'Boeing S345', 10, 17 ),
                         (9877, 'Lun', 24, 22, 'Boeing', 9, 14 ),
                         (8769, 'Venerd', 22, 28, 'Boeing S345', 11, 15 ),
                         (5640, 'Sab', 22, 56, 'Boeing S345', 13, 18 ),
                         (3454, 'Domen', 28, 56, 'Airbus', 10, 14 );
                         
insert INTO compagnia (idCompagnia, nomeCompagnia, tipoAereo,volo ) VALUES
							(1,'Lufthansa', 'Airbus',  3463),
							(2,'Lufthansa', 'Boeing', 9877 ),
							(3,'Alitalia', 'Airbus', 3454),
                            (4,'Alitalia', 'Boeing S345', 5640),
							(5,'Emirates', 'Boeing', 9877);
                         
insert INTO passeggero (codiceFiscale, nome, cognome) VALUES
							('a123df345567','oksana', 'gonchar'),
                            ('b345gy688236','pasquale', 'molinario'),
                            ('f12345gy688g','nicola', 'molinario'),
                            ('f23445gy688g','lidiia', 'cara');
                            
insert INTO prenotazione (codicePrenotazione, codiceFiscale, idCompagnia, id) VALUES
						(123, 'a123df345567', 1, 3463),
                        (234, 'b345gy688236', 2, 9877),
                        (345, 'f12345gy688g', 3, 3454),
                        (456, 'f23445gy688g', 4, 5640),
                        (567, 'a123df345567', 5, 9877),
						(678, 'b345gy688236', 2, 9877);
                        
 
                            