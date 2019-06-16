# 1 Le città con un aeroporto di cui non è noto il numero di piste
SELECT A.citta FROM aeroporto AS A WHERE A.nPiste is null;

# 2 Le nazioni da cui parte e arriva il volo con codice 1;
SELECT V.idVolo, A1.nazione, A2.nazione FROM aeroporto AS A1 
    INNER JOIN volo AS V ON V.aeroportoPart = A1.id
    INNER JOIN aeroporto AS A2 ON A2.id = V.aeroportoArr
    WHERE V.idVolo=1
    GROUP BY A1.id;

# 3 Tipi di aerei usati nei voli che partono da Roma
SELECT AE.citta, C.tipoAereo FROM compagnia AS C
	INNER JOIN volo AS V ON V.compagnia = C.idComp
    INNER JOIN aeroporto AS AE ON V.aeroportoPart = AE.id
    WHERE AE.citta LIKE 'Roma'
    GROUP BY C.tipoAereo;
	
/* 4 I tipi di aereo e il corrispondente numero di passeggeri 
per i voli che partono da Roma
*/
SELECT AE.citta, C.tipoAereo, A.nPass FROM compagnia AS C
	INNER JOIN volo AS V ON V.compagnia = C.idComp
    INNER JOIN aeroporto AS AE ON V.aeroportoPart = AE.id
    INNER JOIN aereo AS A ON A.tipoAereo = C.tipoAereo
    WHERE AE.citta LIKE 'Roma'
    GROUP BY A.tipoAereo;

/* 5 Le città da cui partono voli diretti ad Monaco,
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

# 7 Le città italiane da cui partono almeno 2 voli alla settimana diretti in Francia
SELECT AP.citta FROM aeroporto AS AP
	INNER JOIN volo AS VP ON VP.aeroportoPart=AP.id
    INNER JOIN aeroporto AS AA ON AA.id=VP.AeroportoArr
    WHERE AP.nazione = 'Italia' && AA.nazione = 'Francia'
    GROUP BY AP.citta HAVING COUNT(AP.citta)>=2;

# 8 Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT A.citta, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoPart=A.id
    INNER JOIN compagnia AS C ON C.idComp = V.compagnia
    INNER JOIN aereo AS AE ON AE.tipoAereo=C.tipoAereo
	WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);

# 9 Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT A.citta, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoArr=A.id
    INNER JOIN compagnia AS C ON C.idComp = V.compagnia
    INNER JOIN aereo AS AE ON AE.tipoAereo=C.tipoAereo
    WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);

/*
# 10 Le città che sono servite dall'aereo 
caratterizzato dal massimo numero di passeggeri;
*/
SELECT A.citta as Città_servite, AE.nPass
	FROM volo AS V
    INNER JOIN aeroporto AS A ON V.aeroportoPart=A.id
    INNER JOIN compagnia AS C ON C.idComp = V.compagnia
    INNER JOIN aereo AS AE ON AE.tipoAereo=C.tipoAereo
	WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo) 
    UNION 
	SELECT A.citta, AE.nPass
	FROM volo AS V
		INNER JOIN aeroporto AS A ON V.aeroportoArr=A.id
		INNER JOIN compagnia AS C ON C.idComp = V.compagnia
		INNER JOIN aereo AS AE ON AE.tipoAereo=C.tipoAereo
		WHERE AE.nPass = (SELECT MAX(nPass) FROM aereo);

#--------HOME WORK - WEEK END--------------------------------------------------------------

/*
# 11 tutti gli aerei presenti nel database con la relativa compagnia aere di appartenza
*/
SELECT A.tipoAereo as Tipo_Aereo,  
	A.nPass as Numero_Passeggeri,
    A.quantitaMerci as Merci,
    C.nomeCompagnia as Compagnia
    FROM aereo AS A
    INNER JOIN compagnia As C ON C.tipoAereo = A.tipoAereo
    ORDER BY C.nomecompagnia;

/*
# 12 restituire i tipi di aerei per ogni compagnia ordinandoli per tipo aereo
*/
SELECT A.tipoAereo as Tipo_Aereo,  
    C.nomeCompagnia as Compagnia
    FROM aereo AS A
    INNER JOIN compagnia As C ON C.tipoAereo = A.tipoAereo
    ORDER BY C.tipoAereo;

/*
# 13 Restituire i codici fiscali dei viaggiatori che hanno prenotato voli 
che partono da Roma
*/
SELECT A.citta as Città_Partenza,
	PRE.codicePrenotazione as Codice_Prenotazione, 
    P.codiceFiscale as Codice_Fiscale
    FROM passeggero AS P
	INNER JOIN prenotazione AS PRE ON PRE.codiceFiscale = P.codiceFiscale
    INNER JOIN volo AS V ON V.idVolo = Pre.idVolo
    INNER JOIN aeroporto AS A ON A.id=V.aeroportoPart
    WHERE A.citta = 'Roma';
    
/*
# 14 Restituire tutte le informazioni di tutte le prenotazioni del volo
che parte da Roma alle ore 15
*/
SELECT 	V.idVolo as Volo,
		C.tipoAereo,
        C.nomeCompagnia as Compagnia,
        A_PART.citta as Citta_Partenza,
		V.oraPartenza as Ora_Partenza,
		A_ARR.citta	as Citta_Arrivo,
        V.oraArrivo as Ora_Arrivo,
		PRE.codicePrenotazione as Prenotazione,
		PRE.codiceFiscale as Codice_Fiscale,
        P.cognome as Cognome_Passeggero
		FROM prenotazione AS PRE
        INNER JOIN passeggero AS P ON P.codiceFiscale=PRE.codiceFiscale
        INNER JOIN volo AS V ON v.idVolo = PRE.idVolo
        INNER JOIN compagnia AS C ON C.idComp = V.compagnia
        INNER JOIN aeroporto AS A_PART ON A_PART.id = V.aeroportoPart
        INNER JOIN aeroporto AS A_ARR ON A_ARR.id = V.aeroportoArr
        WHERE A_PART.citta = 'Roma' AND V.oraPartenza = 15;