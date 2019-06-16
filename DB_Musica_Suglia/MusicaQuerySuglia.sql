/*
1.	Restituire il nome degli strumenti suonati esclusivamente 
	da musicisti di sesso maschile;

*/
SELECT S.nome FROM strumento AS S
	INNER JOIN abilita AS A ON A.strumento = S.nome
    INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
	WHERE S.nome NOT IN (SELECT S.nome FROM strumento AS S
				INNER JOIN abilita AS A ON A.strumento = S.nome
				INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
				WHERE M.sesso LIKE "F");
                
/*
2.	Per ogni musicista che suoni strumenti della categoria 
	‘Ottoni’ restituire il nome, il cognome, la data di nascita
	e gli strumenti della categoria 'Ottoni' da lui suonati 
*/          
SELECT M.nome, M.cognome, M.datanascita , S.nome FROM musicista As M
	INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
    WHERE S.categoria LIKE "ottoni";
    
    
/*
3.	Restituire nome, cognome e data di nascita dei musicisti 
	che suonano almeno 5 strumenti;
*/     
SELECT M.nome, M.cognome, M.datanascita FROM musicista AS M
	INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
	GROUP BY M.nome, M.cognome, M.datanascita HAVING COUNT(*)>=3;


/*
4.	Restituire il nome degli strumenti suonati da esattamente due musicisti;
*/ 
SELECT S.nome as Nome_Strumento,
	M.nome as Musicista
	FROM strumento AS S
	INNER JOIN abilita AS A ON A.strumento = S.nome
    INNER JOIN musicista AS M ON M.codiceFiscale = A.musicista
	WHERE M.nome = 'Pompilio' OR M.nome='Laura';

/*
5.	Restituire il nome ed il cognome del musicista più vecchio 
	(o dei musicisti più vecchi, se ci sono musicisti nati nello stesso giorno)
*/ 
SELECT M.nome as Nome_Musicitsa,
	M.cognome as Cognome_Musicista,
    M.datanascita as Data_Nascita
    FROM musicista AS M
    WHERE M.datanascita = (SELECT MIN(datanascita) FROM musicista);

/*
6.	Restituire il nome ed il cognome del musicista più giovane 
	(o dei musicisti più giovani, se ci sono musicisti nati nello stesso giorno)
	fra quelli che suonano almeno uno strumento,
	e gli strumenti da lui (da loro) suonati. ***RIVEDERE*****
*/
SELECT M.nome as Nome_Musicitsa,
	M.cognome as Cognome_Musicista,
    M.datanascita as Data_Nascita,
    S.nome as Strumento
    FROM musicista AS M
    INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
    WHERE M.datanascita = (SELECT MAX(datanascita) FROM musicista)
    GROUP BY S.nome HAVING COUNT(S.nome)>=1;
    
/*
7.	Restituire il numero di strumenti suonati da ciascun musicista.
*/
SELECT M.nome as Nome,
	M.cognome as Cognome,
    COUNT(S.nome) as Numero_Strumenti
    FROM musicista AS M
	INNER JOIN abilita AS A ON A.musicista = M.codiceFiscale
    INNER JOIN strumento AS S ON S.nome = A.strumento
    GROUP BY M.nome;
    
    
    
    
    
    