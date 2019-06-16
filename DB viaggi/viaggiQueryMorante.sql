#1
SELECT a.tipo AS tipoAereo, a.numeroPosti, a.quantitaMerci, c.nome AS nomeCompagnia, c.nazione AS nazioneCompagnia
FROM aereo AS a
INNER JOIN compagnia AS c ON a.compagnia = c.id;

#2
SELECT a.tipo, c.nome
FROM aereo AS a
INNER JOIN compagnia AS c ON a.compagnia = c.id
ORDER BY c.nome, a.tipo;

#3
SELECT p.codiceFiscale
FROM passeggero AS p
INNER JOIN biglietto AS b ON p.codiceFiscale = b.passeggero
INNER JOIN volo AS v ON b.idvolo = v.id AND b.giorno = v.giorno
INNER JOIN aeroporto AS app ON v.aeroportoPart = app.id
WHERE app.citta = 'Roma';

#4
SELECT p.nome, p.cognome, p.codiceFiscale, b.prezzo, apa.citta AS arrivo, v.oraArr AS oraArrivo
FROM passeggero AS p
INNER JOIN biglietto AS b ON p.codiceFiscale = b.passeggero
INNER JOIN volo AS v ON b.idvolo = v.id AND b.giorno = v.giorno
INNER JOIN aeroporto AS app ON v.aeroportoPart = app.id
INNER JOIN aeroporto AS apa ON v.aeroportoArr = apa.id
WHERE app.citta = 'Roma' AND v.oraPart = 15;