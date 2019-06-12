

#SELECT * FROM smartphone;

#SELECT S.name, S.ram, S.cpu, S.cpu FROM smartphone AS S;

#SELECT S.name FROM smartphone AS S WHERE S.displayResolution = "1080x1920";

#SELECT S.name FROM smartphone AS S WHERE S.displayResolution = "1080x1920" && s.ram = "3Gb";

#SELECT * FROM smartphone AS S WHERE S.name LIKE "%Galaxy%";

#SELECT * FROM smartphone AS S WHERE S.name LIKE "%Galaxy%" && S.cpu LIKE "%dual-core%";

#SELECT * FROM smartphone AS S WHERE S.weight>=150;

#SELECT * FROM smartphone AS S WHERE S.weight<150;

#SELECT * FROM smartphone AS S order by s.displayPpi;

#SELECT * FROM smartphone AS S order by s.displayPpi desc;

#Query 2 
SELECT S.name, S.brand FROM smartphone AS S;

SELECT S.name, O.description FROM smartphone AS S INNER JOIN opSys AS O ON S.OpSys=O.id ORDER BY S.name;

SELECT S.name, S.weight, O.description FROM smartphone AS S INNER JOIN opsys AS O ON S.opSys=O.id 
	WHERE O.description LIKE "%Android%" ORDER BY S.weight desc;

SELECT S.name, B.name, C.name FROM smartphone AS S 
	INNER JOIN brand AS B ON S.brand=B.Id
	INNER JOIN country AS C ON B.country=C.code
	ORDER BY C.name;

SELECT COUNT(S.id) FROM smartphone As S WHERE S.ram LIKE "%3Gb%";

SELECT COUNT(S.id), O.description FROM smartphone AS S 
	INNER JOIN opSys AS O ON S.opSys=O.Id
    GROUP BY O.description;

SELECT COUNT(S.id), C.name FROM smartphone AS S
	INNER JOIN brand AS B ON S.brand=B.Id
    INNER JOIN country AS C ON B.country=C.code
    GROUP BY C.name;

SELECT C.name, B.name FROM country AS C
	LEFT JOIN brand AS B ON B.country=C.code;
    
	


