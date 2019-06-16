                    
#query 1 HOMEWORK WEEKEND
SELECT a.tipoAereo AS tipologia_aereo, p.compagnia AS nome_compagnia
	FROM aereo AS a INNER JOIN proprieta AS p
    ON a.tipoAereo = p.aereo
	ORDER BY p.compagnia;

#query 2 HOME WORK WEEKEND    
SELECT a.tipoAereo AS tipologia_aereo, p.compagnia AS nome_compagnia
	FROM aereo AS a INNER JOIN proprieta AS p
    ON a.tipoAereo = p.aereo
    ORDER BY a.tipoAereo;
    
#query 3 HOMEWORK WEEKEND    
SELECT p.codiceFiscale as CF, p.nome AS nome_passeggero, p.cognome AS cognome_passeggero
	FROM prenotazione AS p
	INNER JOIN volo AS v
    ON p.volo = v.idVolo
    INNER JOIN aeroporto AS a
    ON v.aeroportoPart = a.id
    WHERE a.citta ='Roma'
    GROUP BY p.codiceFiscale;
    
#query 4 HOMEWORK WEEKEND 
SELECT p.id AS id_prenotazione,p.codiceFiscale,p.nome,p.cognome,
	p.volo,v.tipoAereo,v.compagnia,v.oraPartenza,v.oraArrivo,
	a1.citta AS citta_partenza,a1.nazione AS nazione_partenza,
    a2.citta AS citta_arrivo,a2.nazione AS nazione_arrivo
	FROM prenotazione AS p
	INNER JOIN volo AS v
    ON p.volo = v.idVolo
    INNER JOIN proprieta as pr
    ON (pr.compagnia,pr.aereo) = (v.compagnia,v.tipoAereo)
    INNER JOIN aeroporto AS a1
    ON v.aeroportoPart = a1.id
    INNER JOIN aeroporto AS a2
    ON v.aeroportoArr = a2.id
    WHERE a1.citta ='Roma' AND v.oraPartenza = 15
    GROUP BY p.codiceFiscale;




    


    
    
	
        
        
        
        