SELECT S.nome FROM strumento AS S
	INNER JOIN abilita AS A ON A.strumento = S.nome
    INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
	WHERE S.nome NOT IN (SELECT S.nome FROM strumento AS S
				INNER JOIN abilita AS A ON A.strumento = S.nome
				INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
				WHERE M.sesso LIKE "F");

SELECT M.nome, M.cognome, M.datanascita , S.nome FROM musicista As M
	INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
    WHERE S.categoria LIKE "ottoni";

SELECT M.nome, M.cognome, M.datanascita FROM musicista AS M
	INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
	GROUP BY M.nome, M.cognome, M.datanascita HAVING COUNT(*)>=3;


#4 terminare
SELECT S.nome FROM strumento AS S
	INNER JOIN abilita AS A ON A.strumento = S.nome
    INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
	WHERE M.nome LIKE ("Pompilio");
    
    