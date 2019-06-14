#Le città con un aeroporto di cui non è noto il numero di piste
SELECT a.citta FROM aeroporto AS a
	WHERE a.npiste IS NULL;
    
#Le nazioni da cui parte e arriva il volo con codice 1;
SELECT a1.nazione as nazione_partenza, a2.nazione as nazione_arrivo FROM aeroporto AS a1
	INNER JOIN volo AS v ON v.aeroportoPart = a1.id
		INNER JOIN aeroporto AS a2 ON v.aeroportoArr = a2.id
			WHERE v.idVolo = 1
				GROUP BY a1.codice;
                
#I tipi di aereo usati nei voli che partono da Roma;
SELECT ae.tipoAereo FROM aereo AS ae
	INNER JOIN volo AS v ON v.tipoAereo = ae.tipoAereo
		INNER JOIN aeroporto AS a ON a.id = v.aeroportoPart
			WHERE a.citta = 'Roma'
				GROUP BY ae.tipoAereo;
                
#I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
SELECT ae.tipoAereo, ae.nPass FROM aereo AS ae
	INNER JOIN volo AS v ON v.tipoAereo = ae.tipoAereo
		INNER JOIN aeroporto AS a ON a.id = v.aeroportoPart
			WHERE a.citta = 'Roma'
				GROUP BY ae.tipoAereo;
                
#Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente;
SELECT DISTINCT a1.citta FROM aeroporto AS a1
	INNER JOIN volo AS v ON v.aeroportoPart = a1.id
		INNER JOIN aeroporto AS a2 ON v.aeroportoArr = a2.id
			WHERE a2.citta = 'Amsterdam'
				ORDER BY a2.citta;
            
#Il numero di voli che partono il venerdì da Napoli;  
SELECT COUNT(v.idVolo) FROM volo AS v
	INNER JOIN aeroporto AS a ON a.id = v.aeroportoPart
		WHERE a.citta = 'Napoli' AND v.giornoSett = 'venerdi';
	
#Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda;
SELECT a1.citta FROM aeroporto AS a1
	INNER JOIN volo AS v ON v.aeroportoPart = a1.id
		INNER JOIN aeroporto AS a2 ON v.aeroportoArr = a2.id
			WHERE a1.nazione = 'Italia' AND a2.nazione = 'Olanda'
				GROUP BY a1.citta HAVING COUNT(a1.citta) >= 2;

#Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT a.citta FROM aeroporto AS a
	INNER JOIN volo AS v ON v.aeroportoPart = a.id
		INNER JOIN aereo AS ae ON ae.tipoAereo = v.tipoAereo
			WHERE ae.nPass = (SELECT MAX(ae.nPass) FROM aereo AS ae);
            
#Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT a.citta FROM aeroporto AS a
	INNER JOIN volo AS v ON v.aeroportoArr = a.id
		INNER JOIN aereo AS ae ON ae.tipoAereo = v.tipoAereo
			WHERE ae.nPass = (SELECT MAX(ae.nPass) FROM aereo AS ae);

#Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT a1.citta FROM aeroporto AS a1
	INNER JOIN volo AS v ON v.aeroportoArr = a1.id
		INNER JOIN aeroporto AS a2 ON v.aeroportoPart = a2.id
			INNER JOIN aereo AS ae ON ae.tipoAereo = v.tipoAereo
				WHERE ae.nPass = (SELECT MAX(ae.nPass) FROM aereo AS ae);


#Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri
SELECT DISTINCT a.citta FROM aeroporto AS a
	INNER JOIN volo AS v ON v.aeroportoArr = a.id
		INNER JOIN aereo AS ae ON ae.tipoAereo = v.tipoAereo
			WHERE ae.nPass = (SELECT MAX(ae.nPass) FROM aereo AS ae)
				UNION 
                SELECT DISTINCT a.citta FROM aeroporto AS a
					INNER JOIN volo AS v ON v.aeroportoPart = a.id
						INNER JOIN aereo AS ae ON ae.tipoAereo = v.tipoAereo
							WHERE ae.nPass = (SELECT MAX(ae.nPass) FROM aereo AS ae);
	