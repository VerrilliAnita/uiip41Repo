
#query 1
SELECT c.cognome,c.nome,t.numero FROM candidato AS c
	INNER JOIN telefono AS t
    ON c.codice = t.candidato;
    
#query 2
SELECT c.cognome,c.nome,t.numero FROM candidato AS c
	LEFT JOIN telefono AS t
    ON c.codice = t.candidato;
    
#query 3
SELECT c.cognome,c.nome,COUNT(i.titolo) as numero_titoli
	FROM candidato AS c
	INNER JOIN istruzione AS i
    ON c.codice = i.candidato
    INNER JOIN titolostudio AS ts
    ON i.titolo = ts.codice
    GROUP BY c.cognome,c.nome HAVING COUNT(i.titolo)>=2;