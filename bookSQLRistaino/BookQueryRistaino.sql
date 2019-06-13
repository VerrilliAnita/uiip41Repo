#Fornire tutti i libri nel database
SELECT * FROM book;

#Selezionare il titolo e l'autore di tutti i libri presenti all'internod el database
SELECT b.title, b.author FROM book AS b;

#Contare il numero di libri il cui autore è Patrick Routhfuss
SELECT COUNT(b.id), b.author as numero_libri FROM book as b
	WHERE b.author = 'Patrick Routhfuss';