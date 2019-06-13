#1
SELECT c.cognome, c.nome, t.numero
FROM candidato AS c, telefono AS t
WHERE c.codice = t.candidato;

#2
SELECT c.cognome, c.nome, t.numero
FROM candidato AS c
LEFT JOIN telefono AS t ON c.codice = t.candidato;

#3
SELECT c.cognome, c.nome, COUNT(i.titolo) AS numeroTitoli
FROM candidato AS c
INNER JOIN istruzione AS i ON c.codice = i.candidato
GROUP BY c.codice HAVING COUNT(i.titolo) > 1;
 



