
#visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
SELECT C.cognome, C.nome, T.numero FROM candidato AS C
	INNER JOIN telefono AS T ON T.candidato=C.codice;

/*
visualizzare, per ogni candidato,
il cognome, il nome, ed il numero di telefono, 
includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
*/
SELECT C.cognome, C.nome, T.numero FROM candidato AS C
	LEFT JOIN telefono AS T ON T.candidato=C.codice;

/*
visualizzare nome e cognome
dei candidati che hanno almeno due titoli di studio
*/
SELECT C.nome, C.cognome 
	FROM candidato AS C
	INNER JOIN istruzione AS I ON I.candidato=C.codice
    INNER JOIN titolostudio AS T ON T.codice= I.titolo
    GROUP BY C.codice 
    HAVING count(T.codice) >=2;