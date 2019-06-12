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