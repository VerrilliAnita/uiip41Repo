#q1
SELECT * FROM smartphone;

#q2
SELECT S.name,S.ram,S.size,S.cpu from smartphone as S;

#q3
SELECT S.name from smartphone as S
	WHERE S.displayResolution = "1080x1920";

#q4
SELECT S.name from smartphone as S
	WHERE S.displayResolution = "1080x1920" AND S.ram ="3Gb";

#q5
SELECT * from smartphone as S
	WHERE S.name LIKE "%Galaxy%";

#q6    
SELECT * from smartphone as S
	WHERE S.name LIKE "%Galaxy%" AND S.cpu LIKE "%dual-core%";
    
#q7
SELECT * from smartphone as S
	WHERE S.weight >= 150;

#q8
SELECT * from smartphone as S
	WHERE S.weight < 150;

#q9
SELECT * from smartphone as S
	ORDER BY S.displayPpi;
    
#q10
SELECT * from smartphone as S
	ORDER BY S.displayPpi DESC;

#q11    
SELECT B.name as NameBrand, S.name as NameSmartphone
	FROM brand as B INNER JOIN smartphone as S
    ON B.id = S.brand;

#q12    
SELECT S.name as NameSmarthphone, O.description as OpSys
	FROM smartphone as S JOIN opsys as O
    ON S.opSys = O.id
    ORDER BY S.name;

#q13
SELECT S.name as NameSmarthphone, O.description as OpSys, S.weight as WeightSmartphone
	FROM smartphone as S JOIN opsys as O
    ON S.opSys = O.id
    WHERE O.description = "Android"
    ORDER BY S.weight DESC;  
    
#q14
SELECT S.name as NameSmarthphone, B.name as NameBrand, C.name as CountryName
	FROM smartphone as S JOIN brand as B
    ON S.brand = B.id JOIN country as C
    ON B.country = C.code
    ORDER BY C.name;  
    
#q15
SELECT COUNT(S.id) as Nr3GBSmartphone
	FROM smartphone as S
    WHERE S.ram ="3Gb";
    
#q16
SELECT O.description as OS, COUNT(S.id) as NrOfSmartphone
	FROM opsys as O JOIN smartphone as S
    ON O.id = S.opSys
    GROUP BY O.description;

#q17
SELECT C.name as NameCountry, COUNT(S.id) as NrOfSmartphone
	FROM country as C JOIN brand as B
    ON C.code = B.country
    JOIN smartphone as S
    ON B.id = S.brand
    GROUP BY C.name;
	
#q18
SELECT C.name as NameCountry, B.name as NameBrand
	FROM country as C LEFT JOIN brand as B
    ON C.code = B.country
    

    
	