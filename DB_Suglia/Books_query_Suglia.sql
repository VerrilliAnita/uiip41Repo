SELECT * FROM book;

SELECT B.title, B.author FROM book AS B;

SELECT  author, COUNT(id) FROM book WHERE author LIKE "Minichiello";

