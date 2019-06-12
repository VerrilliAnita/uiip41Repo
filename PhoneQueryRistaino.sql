/*
SELECT * FROM smartphone;

SELECT S.name, S.ram, S.size, S.cpu FROM SMARTPHONE AS S;

SELECT S.name FROM SMARTPHONE AS S WHERE S.displayResolution = '1080x1920';

SELECT S.name FROM SMARTPHONE AS S 
	WHERE S.displayResolution = '1080x1920' AND S.ram = '3Gb';
    
SELECT * FROM smartphone AS S
	WHERE S.name LIKE '%Galaxy%';

SELECT * FROM smartphone AS S
	WHERE S.name LIKE '%Galaxy%' AND S.cpu LIKE '%dual-core%';

SELECT * FROM smartphone AS S
	WHERE S.weight >= 150;
    

SELECT * FROM smartphone AS S
	WHERE S.weight <= 150;
    

SELECT * FROM smartphone AS S
	ORDER BY S.displayPpi;
    

SELECT * FROM smartphone AS S
	ORDER BY S.displayPpi DESC;
    
SELECT S.name, S.brand FROM smartphone as S;

SELECT S.name, S.opSys FROM smartphone as S
	ORDER BY S.name;
    
SELECT S.name, O.description FROM smartphone AS s 
	INNER JOIN opsys AS O ON S.opSys = O.id;
    
SELECT S.name, O.description FROM smartphone AS S, opsys AS O 
	WHERE S.opSys = O.id
    ORDER BY S.name;

SELECT S.name, O.description FROM smartphone AS S
	INNER JOIN opsys AS O ON S.opSys = O.id 
		WHERE O.description = 'Android'
		ORDER BY S.weight DESC;
*/
/*
#4
SELECT S.name, B.name, C.name FROM smartphone AS S
	INNER JOIN brand AS B ON S.brand = B.id
    INNER JOIN country AS C ON B.country = C.code
    ORDER BY C.name;

*/
#5
SELECT COUNT(s.id) FROM smartphone AS s
	WHERE s.ram LIKE '3Gb';
    
#6
SELECT COUNT(s.id) FROM smartphone AS s
	INNER JOIN opSys AS o ON s.opSys = o.id
    GROUP BY s.opSys;
    
SELECT COUNT(s.id) FROM smartphone AS s
	INNER JOIN brand AS b ON s.brand = b.id
	INNER JOIN country AS c ON b.country = c.code
    GROUP BY (c.code);
    
SELECT c.name, b.name FROM country AS c
	RIGHT JOIN brand AS b ON c.code = b.country;

	
