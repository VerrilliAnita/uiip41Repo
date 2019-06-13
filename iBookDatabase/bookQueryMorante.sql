#1
SELECT *
FROM book AS b;

#2
SELECT b.title, b.author
FROM book AS b;

#3
SELECT COUNT(b.author) AS numeroLibri
FROM book AS b
WHERE b.author = 'Camilleri'
GROUP BY b.author;