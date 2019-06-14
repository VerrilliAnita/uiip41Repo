#1
SELECT a.citta
FROM aeroporto AS a
WHERE a.numeroPiste IS NULL;

#2
SELECT a.nazione AS partenza, b.nazione AS arrivo
FROM aeroporto AS a
INNER JOIN volo AS v ON a.id = v.aeroportoPart
INNER JOIN aeroporto AS b ON v.aeroportoArr = b.id
WHERE v.id = 5;

#3
SELECT a.tipo
FROM aereo AS a
INNER JOIN volo AS v ON a.tipo = v.aereo
INNER JOIN aeroporto AS ap ON v.aeroportoPart = ap.id
WHERE ap.citta = 'Roma';

#4
SELECT a.tipo, a.numeroPosti
FROM aereo AS a
INNER JOIN volo AS v ON a.tipo = v.aereo
INNER JOIN aeroporto AS ap ON v.aeroportoPart = ap.id
WHERE ap.citta = 'Roma';

#5
SELECT app.citta
FROM aeroporto AS app
INNER JOIN volo AS v ON app.id = v.aeroportoPart
INNER JOIN aeroporto AS apa ON apa.id = v.aeroportoArr  
WHERE apa.citta = 'Berlino';

#6
SELECT COUNT(v.id) AS numeroVoli
FROM volo AS v
INNER JOIN aeroporto AS app ON v.aeroportoPart = app.id
INNER JOIN aeroporto AS apa ON v.aeroportoArr = apa.id
WHERE app.citta = 'Berlino' AND v.giorno = 'Venerdi';

#7
SELECT app.citta
FROM aeroporto AS app
INNER JOIN volo AS v ON app.id = v.aeroportoPart
INNER JOIN aeroporto AS apa ON v.aeroportoArr = apa.id
WHERE app.nazione = 'Italia' AND apa.nazione = 'Germania'
GROUP BY app.id HAVING COUNT(app.citta) > 1;

#8
SELECT app.citta AS cittaPartenzaMassimoPasseggeri
FROM aeroporto AS app
INNER JOIN volo AS v ON app.id = v.aeroportoPart
INNER JOIN aereo AS a ON a.tipo = v.aereo 
WHERE a.numeroPosti = (SELECT MAX(numeroPosti)
					   FROM aereo)
GROUP BY app.citta;


#9
SELECT apa.citta AS cittaArrivoMassimoPasseggeri
FROM aeroporto AS apa
INNER JOIN volo AS v ON apa.id = v.aeroportoArr
INNER JOIN aereo AS a ON a.tipo = v.aereo 
WHERE a.numeroPosti = (SELECT MAX(numeroPosti)
					   FROM aereo)
GROUP BY apa.citta;
                       
#10
SELECT app.citta AS cittaPartenza, apa.citta AS cittaArrivo
FROM aeroporto AS app
INNER JOIN volo AS v ON app.id = v.aeroportoPart
INNER JOIN aeroporto AS apa ON apa.id = v.aeroportoArr
INNER JOIN aereo AS a ON a.tipo = v.aereo 
WHERE a.numeroPosti = (SELECT MAX(numeroPosti)
					   FROM aereo);