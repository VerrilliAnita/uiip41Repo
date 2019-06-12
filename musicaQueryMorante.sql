#1
SELECT s.nome, COUNT(a.musicista) AS maschi
FROM strumento AS s
INNER JOIN abilita AS a ON s.nome = a.strumento
INNER JOIN musicista AS m ON a.musicista = m.codiceFiscale
WHERE s.nome NOT IN (SELECT s.nome
					FROM strumento AS s
					INNER JOIN abilita AS a ON s.nome = a.strumento
					INNER JOIN musicista AS m ON a.musicista = m.codiceFiscale
					WHERE m.sesso = 'F')
GROUP BY s.nome;

#2
SELECT m.nome, m.cognome, m.dataNascita, s.nome
FROM musicista AS m
INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista 
INNER JOIN strumento AS s ON a.strumento = s.nome
WHERE s.categoria = 'Corde';

#3
SELECT m.nome, m.cognome, m.dataNascita
FROM musicista AS m
INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista 
GROUP BY a.musicista HAVING COUNT(a.musicista) > 1;

#4
SELECT s.nome
FROM strumento AS s
INNER JOIN abilita AS a ON s.nome = a.strumento
GROUP BY s.nome HAVING COUNT(a.musicista) = 2;

#5
SELECT m.nome, m.cognome
FROM musicista AS m
WHERE m.dataNascita = (SELECT MIN(m.dataNascita) FROM musicista AS m);

#6
SELECT m.nome, m.cognome, s.nome
FROM musicista AS m
INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista
INNER JOIN strumento AS s ON a.strumento = s.nome
WHERE m.dataNascita = (SELECT MAX(m.dataNascita) 
						FROM musicista AS m 
						INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista);

#7
SELECT m.nome, m.cognome, COUNT(m.codiceFiscale) AS nomeroStrumenti
FROM musicista AS m
INNER JOIN abilita AS a ON m.codiceFiscale = a.musicista 
GROUP BY (a.musicista);