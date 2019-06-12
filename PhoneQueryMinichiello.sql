#query1#
/*SELECT *
FROM smartphone;

#query2#
SELECT B.name ,B.ram ,B.size, B.cpu 
FROM smartphone as B;

#query3#
SELECT B.name
FROM smartphone as B
WHERE B.displayResolution = "1080x1920";

#query4#
SELECT B.name
FROM smartphone as B
WHERE B.displayResolution = "1080x1920" AND B.ram= "3Gb";

#query5#
SELECT *
FROM smartphone as S
WHERE S.name LIKE "%Galaxy%";

#query6#
SELECT *
FROM smartphone as S
WHERE S.name LIKE "%Galaxy%" AND S.cpu LIKE "%dual-core%";

#query7#
SELECT *
FROM smartphone as S
WHERE S.weight >=150;

#query8#
SELECT *
FROM smartphone as S
WHERE S.weight <150;

#query9#
SELECT *
FROM smartphone as S
ORDER BY displayPpi;

#query10#
SELECT *
FROM smartphone as S
ORDER BY displayPpi DESC;
*/
#query11#

SELECT B.name As NomeBrand, S.name as NomeSmartphone
FROM brand as B JOIN smartphone as S on B.id=S.brand;

#query12#
SELECT S.name as NomeSmartphone, O.description as SistemaOperativo
FROM opsys as O JOIN smartphone as S on O.id=S.opSys
Order by S.name;

#query13#
SELECT S.name as NomeSmartphone, O.description as SistemaOperativo
FROM opsys as O JOIN smartphone as S on O.id=S.opSys
Where O.description LIKE "%Android%"
Order by S.weight;

#query14#
SELECT S.name as NomeSmartphone, B.name as NomeBrand, C.name as NomeCountry
FROM brand as B JOIN smartphone as S
	on B.id=S.brand JOIN country as C 
    on C.code=B.country
order by NomeCountry;

#query15#
SELECT COUNT(S.id) as count
FROM smartphone as S
where s.ram="3Gb";

#query6#
SELECT O.description, COUNT(S.id) as count
FROM opsys as O JOIN smartphone as S on O.id=S.opSys
group by O.description;

#query7#
SELECT C.name, COUNT(S.id) as count
FROM brand as B JOIN smartphone as S on B.id=S.brand JOIN country as C on C.code=B.country
group by C.name;

#query8#
SELECT C.name, B.name
FROM brand as B right JOIN country as C on C.code=B.country;