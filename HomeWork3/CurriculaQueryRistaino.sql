# visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
SELECT c.cognome, c.nome, t.numero FROM candidato AS c
	INNER JOIN telefono AS t ON t.candidato = c.codice;
    
/*
visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono, 
includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
*/
SELECT c.cognome, c.nome, t.numero FROM candidato AS c
	LEFT JOIN telefono AS t ON t.candidato = c.codice;
    
/*
visualizzare nome e cognome dei candidati che hanno almeno due titoli di studio
*/
SELECT c.nome, c.cognome FROM candidato AS c
	INNER JOIN istruzione AS i ON i.candidato = c.codice
		INNER JOIN titolostudio AS t ON t.codice = i.titolo
			GROUP BY c.codice HAVING COUNT(t.codice) >= 2;