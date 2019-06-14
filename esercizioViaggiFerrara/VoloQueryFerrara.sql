#Query1#
SELECT a.citta FROM aeroporto AS a
WHERE npiste IS NULL;

#Query2#
SELECT a1.nazione AS NazionePartenza, a2.nazione AS NazioneArrivo FROM aeroporto AS a1
JOIN volo AS v ON a1.id=v.aeroportoPart JOIN aeroporto AS a2 ON v.aeroportoArr=a2.id
WHERE v.idVolo=1;

#Query3#
SELECT ae.tipoAereo FROM aereo AS ae
JOIN volo AS v ON ae.tipoAereo=v.tipoAereo JOIN aeroporto AS a ON v.aeroportoPart=a.id
where a.citta="Roma";

#Query4#
SELECT ae.tipoAereo, ae.nPass FROM aereo AS ae
JOIN volo AS v ON ae.tipoAereo=v.tipoAereo JOIN aeroporto AS a ON v.aeroportoPart=a.id
where a.citta="Roma";

#Query5#
SELECT DISTINCT a1.citta FROM aeroporto AS a1
JOIN volo AS v ON a1.id=v.aeroportoPart JOIN aeroporto AS a2 ON v.aeroportoArr=a2.id
WHERE a2.citta="Amsterdam"
ORDER BY a1.citta;

#Query6#
SELECT COUNT(v.idVolo) as NumeriVoli FROM volo AS v
JOIN aeroporto AS a ON v.aeroportoPart=a.id
WHERE v.giornoSett="Venerdi" and a.citta="Napoli";

#Query7#
SELECT a1.citta FROM aeroporto AS a1 
INNER JOIN volo AS v ON a1.id=v.aeroportoPart 
INNER JOIN aeroporto AS a2 ON v.aeroportoArr=a2.id
WHERE a2.nazione="Olanda" AND a1.nazione="Italia" GROUP BY a1.citta
HAVING COUNT(a1.citta)>=2;

#Query8#
SELECT DISTINCT a.citta FROM aereo as ae
JOIN volo AS v ON ae.tipoAereo=v.tipoAereo JOIN aeroporto AS a ON v.aeroportoPart=a.id
WHERE ae.nPass=(SELECT MAX(nPass) FROM aereo);

#Query9#
SELECT DISTINCT a.citta FROM aereo AS ae
JOIN volo AS v ON ae.tipoAereo=v.tipoAereo JOIN aeroporto AS a ON v.aeroportoArr=a.id
WHERE ae.nPass=(SELECT MAX(nPass) FROM aereo);

#Query10#
SELECT DISTINCT a.citta FROM aereo AS ae
JOIN volo AS v ON ae.tipoAereo=v.tipoAereo JOIN aeroporto AS a ON v.aeroportoPart=a.id
WHERE ae.nPass=(SELECT MAX(nPass) FROM aereo)





