
SELECT c.nome, c.cognome, t.numero FROM candidato AS c
INNER JOIN telefono AS t
ON c.codice = t.candidato;

SELECT c.nome, c.cognome, t.numero FROM candidato AS c
LEFT JOIN telefono AS t
ON c.codice = t.candidato;

SELECT c.nome, c.cognome FROM candidato AS c
INNER JOIN istruzione AS i
ON c.codice = i.candidato
INNER JOIN titolostudio AS ts
On ts.codice = i.titolo
GROUP BY c.nome, c.cognome HAVING COUNT(i.titolo)>=2;







