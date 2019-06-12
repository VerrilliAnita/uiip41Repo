
#Query 1
select *
from smartphone;

#Query 2
select S.name, S.ram, S.size,S.cpu
from smartphone as S;

#Query 3
select S.name
from smartphone as S
where S.displayResolution='1080x1920';

#Query 4
select S.name
from smartphone as S
where S.displayResolution='1080x1920' AND S.ram='3gb';

#Query 5
Select *
from smartphone as s
where s.name Like '%Galaxy%';

#Query 6
Select *
from smartphone as s
where s.name Like '%Galaxy%' and s.cpu like '%dual-core%';

#Query 7
Select *
from smartphone as s
where s.weight>= '150';

#Query 8
Select *
from smartphone as s
where s.weight < '150';

#Query 9
Select *
from smartphone as s
order by s.displayPpi;

#Query 10
Select *
from smartphone as s
order by  s.displayPpi DESC;

#--------------------------------------------------------------


#Query 1
select S.name, B.name 
from smartphone as S join brand as b on S.brand = B.id;


#Query 2
select S.name, O.description 
from smartphone as S join opsys as O on S.opsys = O.id
order by S.name;


#Query 3
select S.name, O.description 
from smartphone as S join opsys as O on S.opsys = O.id
where O.description like '%Android%'
order by S.weight;


#query 4
Select S.name , C.name, B.name
from smartphone as s join brand as b on s.brand = b.id join country as c on b.country=c.code
order by c.name;

#query 5
select count(S.id) as count
from smartphone as S
where S.ram='3Gb';


#query6
select count(S.opsys) as count , O.description
from smartphone as s join opsys as o on s.opsys = o.id
group by O.description;


#query7
select count(C.code) as count , C.name
from smartphone as s join brand as b on s.brand = b.id join country as c on b.country=c.code
group by C.code;


#query8
select c.name, B.name 
from brand as b right join country as c on b.country = c.code;
