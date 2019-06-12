#1
select * 
from smartphone;

#2
select s.name, s.ram, s.size, s.cpu 
from smartphone as s;

#3
select s.name 
from smartphone as s 
where displayResolution='1080x1920';

#4
select s.name 
from smartphone as s 
where displayResolution='1080x1920' && ram='3Gb';

#5
select * 
from smartphone as s 
where s.name like 'Galaxy%';

#6
select * 
from smartphone as s 
where s.name like 'Galaxy%' && s.cpu like '%dual-core%';

#7
select * 
from smartphone as s 
where s.weight >= 150;

#8
select * 
from smartphone as s 
where s.weight <= 150;

#9
select * 
from smartphone as s 
order by displayPpi;

#10
select * 
from smartphone as s 
order by displayPpi DESC;

#1
select s.name, b.name, b.id, b.country
from smartphone as s
INNER JOIN brand as b ON s.brand = b.id;

#2
select s.name, o.description, o.company
from smartphone as s
INNER JOIN opsys as o on s.opSys = o.id
ORDER BY name;

#3
select s.name, s.weight, o.description
from smartphone as s
INNER JOIN opsys as o on s.opSys = o.id
where o.description = 'Android'
order by weight DESC;

#4
select s.name, b.name, c.name
from smartphone as s
INNER JOIN brand as b ON s.brand = b.id
INNER JOIN country as c ON b.country = c.code
order by c.name;

#5
select count(s.id)
from smartphone as s
where ram = '3Gb';

#6
select count(s.id), o.description
from smartphone as s
INNER JOIN opsys as o ON s.opSys = o.id
group by s.opSys;

#7
select count(s.id), c.name
from smartphone as s
INNER JOIN brand as b ON s.brand = b.id
INNER JOIN country as c ON b.country = c.code
group by c.name;

#8
select c.name, b.name
from country as c
LEFT JOIN brand as b on c.code = b.country