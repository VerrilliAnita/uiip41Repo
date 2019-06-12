
#q1
SELECT S.nome FROM Strumento as S
	JOIN abilita as A
    ON S.nome = A.strumento
    JOIN musicista as M
    ON A.musicista = M.codiceFiscale
    WHERE S.nome NOT IN ( SELECT S.nome FROM strumento as S
		JOIN abilita as A
		ON S.nome = A.strumento
		JOIN musicista as M
		ON A.musicista = M.codiceFiscale
		WHERE M.sesso ="F");
#q2        
SELECT M.nome,M.cognome,M.dataNascita, S.categoria,S.nome
	FROM musicista as M JOIN abilita as A
    ON M.codiceFiscale = A.musicista
    JOIN strumento as S
    ON A.strumento = S.nome
    WHERE S.categoria = 'ottone';
    
#q3
SELECT M.nome,M.cognome,M.dataNascita  
	FROM musicista as M JOIN abilita as A
    ON M.codiceFiscale = A.musicista
    GROUP BY M.nome,M.cognome,M.dataNascita
    HAVING COUNT(A.musicista) >=4;

#q4
SELECT S.nome 
	FROM strumento as S JOIN abilita as A
    ON S.nome = A.strumento
    GROUP BY S.nome
    HAVING COUNT(A.musicista) =2;
    
#q5
SELECT M.nome,M.cognome
	FROM musicista as M
    WHERE M.dataNascita IN (SELECT MIN (dataNascita) from musicista);
    
#q6
SELECT M.nome,M.cognome,S.nome
	FROM musicista as M
    JOIN abilita as A
    on M.codiceFiscale = A.musicista
    JOIN strumento as S
    on A.strumento = S.nome
    WHERE M.dataNascita IN (SELECT MAX(dataNascita) from musicista);
    
#q7    
SELECT M.nome, M.cognome, COUNT(A.musicista) as numeroStrumenti
	FROM musicista as M
    JOIN abilita as A 
    on M.codiceFiscale = A.musicista
    GROUP BY M.nome,M.cognome;
    
