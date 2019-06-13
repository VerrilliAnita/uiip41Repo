#q1
SELECT * FROM book;

#q2
SELECT b.title,b.author FROM book as b;

#q3
SELECT b.author as autore, COUNT(b.author) as numero_libri 
	FROM book as b
    WHERE b.author = "Italo Calvino"
    GROUP BY b.author;


