#query1
SELECT a.citta FROM aeroporto AS a
	WHERE nPiste IS NULL;

#query2
SELECT a1.nazione as nazione_partenza, a2.nazione as nazione_arrivo FROM aeroporto AS a1
	INNER JOIN volo AS v
    ON a1.id = v.aeroportoPart
    INNER JOIN aeroporto as a2
    ON a2.id = v.aeroportoArr
    WHERE v.idVolo = 1;

#query3
SELECT v.tipoAereo FROM volo AS v
	INNER JOIN aeroporto AS a
    ON a.id = v.aeroportoPart
    WHERE a.citta = 'roma'
    GROUP BY v.tipoAereo;
    
#query4
SELECT v.tipoAereo,a.nPass
	FROM volo AS v
	INNER JOIN aereo AS a
    ON v.tipoAereo = a.tipoAereo
    INNER JOIN aeroporto as ar
    ON v.aeroportoPart = ar.id
    WHERE ar.citta = 'Roma'
    GROUP BY v.tipoAereo;
    
#query 5  
SELECT a1.citta FROM aeroporto AS a1
	INNER JOIN volo AS v
    ON a1.id = v.aeroportoPart
    INNER JOIN aeroporto as a2
    ON a2.id = v.aeroportoArr
    WHERE a2.citta = 'Amsterdam'
    ORDER BY a1.citta ;
    
#query 6

SELECT COUNT(v.idVolo) AS nr_voli 
		FROM volo as v
        INNER JOIN aeroporto as a1
        ON a1.id= v.aeroportoPart
        WHERE v.giornoSett = 'Venerdi' and a1.citta ='Napoli';
        
#query 7
SELECT a1.citta
	FROM aeroporto as a1 
    INNER JOIN volo AS v 
    ON a1.id = v.aeroportoPart 
    INNER JOIN aeroporto AS a2 
    ON a2.id = v.aeroportoArr
	WHERE a1.nazione='Italia' AND a2.nazione='Olanda'
	GROUP BY a1.citta
	HAVING COUNT(a1.citta)>=2;

#query 8    
SELECT a.citta
	FROM aeroporto AS a 
    INNER JOIN volo AS v 
    ON a.id = v.aeroportoPart 
    INNER JOIN aereo AS ae 
    ON v.tipoaereo =ae.tipoaereo
	WHERE ae.npass =(SELECT max(ae.npass)
					FROM aereo AS ae
					JOIN volo AS v ON ae.tipoaereo = v.tipoaereo);
                    
#query 9
SELECT a.citta
	FROM aeroporto AS a 
    INNER JOIN volo AS v 
    ON a.id = v.aeroportoArr 
    INNER JOIN aereo AS ae 
    ON v.tipoaereo =ae.tipoaereo
	WHERE ae.npass =(SELECT max(ae.npass)
					FROM aereo AS ae
					JOIN volo AS v ON ae.tipoaereo = v.tipoaereo);

#query 10
SELECT a1.citta 
	FROM aeroporto AS a1 
    INNER JOIN volo AS v 
    ON a1.id = v.aeroportoPart 
    INNER JOIN aereo AS ae
    ON v.tipoaereo =ae.tipoaereo
	WHERE ae.npass =(SELECT max(ae.npass)
					FROM aereo AS ae
					JOIN volo AS v ON ae.tipoaereo = v.tipoaereo)
UNION 

SELECT a2.citta 
	FROM aeroporto AS a2 
    INNER JOIN volo AS v 
    ON a2.id = v.aeroportoArr 
    INNER JOIN aereo AS ae
    ON v.tipoaereo =ae.tipoaereo
	WHERE ae.npass =(SELECT max(ae.npass)
					FROM aereo AS ae
					JOIN volo AS v ON ae.tipoaereo = v.tipoaereo);


    
    
	
        
        
        
        