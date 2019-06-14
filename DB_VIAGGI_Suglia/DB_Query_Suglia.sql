# 1 Le città con un aeroporto di cui non è noto il numero di piste
SELECT A.citta FROM aeroporto AS A WHERE A.nPiste is null;

# 2 Le nazioni da cui parte e arriva il volo con codice 1;
SELECT V.idVolo, A1.nazione, A2.nazione FROM aeroporto AS A1 
    INNER JOIN volo AS V ON V.aeroportoPart = A1.id
    INNER JOIN aeroporto AS A2 ON A2.id = V.aeroportoArr
    WHERE V.idVolo=1
    GROUP BY A1.id;


# 3 Tipi di aerei usati nei voli che partono da Roma
SELECT AE.citta, A.tipoAereo FROM aereo AS A
	INNER JOIN volo AS V ON V.tipoAereo = A.tipoAereo
    INNER JOIN aeroporto AS AE ON V.aeroportoPart = AE.id
    WHERE AE.citta LIKE 'Roma'
    GROUP BY A.tipoAereo;
	
/* 4 I tipi di aereo e il corrispondente numero di passeggeri 
per i voli che partono da Roma
*/
SELECT AE.citta, A.tipoAereo, A.nPass FROM aereo AS A
	INNER JOIN volo AS V ON V.tipoAereo = A.tipoAereo
    INNER JOIN aeroporto AS AE ON V.aeroportoPart = AE.id
    WHERE AE.citta LIKE 'Roma'
    GROUP BY A.tipoAereo;

/* 5 Le città da cui partono voli diretti ad Amsterdam(Monaco),
ordinate alfabeticamente
*/
SELECT DISTINCT A1.citta as Citta_Partenza, A2.citta as Citta_Arrivo FROM aeroporto AS A1
	INNER JOIN volo AS V ON A1.id=V.aeroportoPart
    INNER JOIN aeroporto AS A2 ON A2.id=V.aeroportoArr
    WHERE A2.citta LIKE 'Monaco' ORDER BY A1.citta;


# 6 Il numero di voli che partono il venerdì da Napoli
SELECT COUNT(V.idVolo) FROM volo AS V
	INNER JOIN aeroporto AS A ON V.aeroportoPart=A.id
    WHERE V.giornoSettimana = 'venerdì' && A.citta = 'Napoli';


# 7 Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda
SELECT AP.citta FROM aeroporto AS AP
	INNER JOIN volo AS VP ON VP.aeroportoPart=AP.id
    INNER JOIN aeroporto AS AA ON AA.id=VP.AeroportoArr
    WHERE AP.nazione = 'Italia' && AA.nazione = 'Francia'
    GROUP BY AP.citta HAVING COUNT(AP.citta)>=2;


# 8 Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT A.citta, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoPart=A.id
    INNER JOIN aereo AS AE ON AE.tipoAereo=V.tipoAereo
	WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);

# 9 Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT A.citta, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoArr=A.id
    INNER JOIN aereo AS AE ON AE.tipoAereo=V.tipoAereo
	WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);


/*
# 10 Le città che sono servite dall'aereo 
caratterizzato dal massimo numero di passeggeri;
*/
SELECT A.citta as Città_servite, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoPart=A.id
    INNER JOIN aereo AS AE ON AE.tipoAereo=V.tipoAereo
	WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo) 
    UNION 
	SELECT A.citta, AE.nPass
	FROM volo AS V
		INNER JOIN aeroporto AS A ON V.aeroportoArr=A.id
		INNER JOIN aereo AS AE ON AE.tipoAereo=V.tipoAereo
		WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);
