#1
SELECT s.nome, COUNT(a.musicista) as numero_maschi FROM strumento AS s
	INNER JOIN abilita AS a ON a.strumento = s.nome
		INNER JOIN musicista AS m ON m.codiceFiscale = a.musicista
			WHERE s.nome NOT IN (
				SELECT s.nome FROM strumento AS s
					INNER JOIN abilita AS a ON a.strumento = s.nome
						INNER JOIN musicista AS m ON m.codiceFiscale = a.musicista
							WHERE m.sesso = 'F') 
            GROUP BY s.nome;

#2
SELECT m.nome, m.cognome, m.dataNascita, s.nome FROM musicista AS m
	INNER JOIN abilita AS a ON a.musicista = m.codiceFiscale
		INNER JOIN strumento AS s ON s.nome = a.strumento
			WHERE s.categoria = 'ottone';
            
#3
SELECT m.nome, m.cognome, m.dataNascita FROM musicista AS m
	INNER JOIN abilita AS a ON a.musicista = m.codiceFiscale
		INNER JOIN strumento AS s ON s.nome = a.strumento
			GROUP BY m.codiceFiscale HAVING COUNT(a.musicista) >= 5;

#4
SELECT s.nome FROM strumento AS s
	INNER JOIN abilita AS a ON a.strumento = s.nome
		INNER JOIN musicista AS m ON m.codiceFiscale = a.musicista
			GROUP BY s.nome HAVING COUNT(a.musicista) = 2;

#5
SELECT m.nome, m.cognome FROM musicista AS m
	WHERE m.dataNascita = (SELECT MIN(m.dataNascita) FROM musicista AS m);
	

#6 Da completare
SELECT m.nome, m.cognome, s.nome FROM musicista AS m
	INNER JOIN abilita AS a ON a.musicista = m.codiceFiscale
		INNER JOIN strumento AS s ON s.nome = a.strumento
			WHERE m.dataNascita = (SELECT MAX(m.dataNascita) FROM musicista AS m
				INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista);    
    
#7
SELECT m.cognome, m.nome, COUNT(a.musicista) as numero_strumenti FROM musicista AS m
	INNER JOIN abilita AS a ON a.musicista = m.codiceFiscale
        GROUP BY (a.musicista);
	