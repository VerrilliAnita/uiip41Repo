select *
 from smartphone;
 
 select name, ram, size, cpu
 from smartphone;
 
 
select s.name
 from smartphone as s
 where displayResolution = "1080x1920";
 
 select s.name
 from smartphone as s
 where displayResolution = "1080x1920" and ram = "3Gb";
 
 
 select s.name
 from smartphone as s
 where s.name  like "%Galaxsy%" and s.cpu like "%dual-core%";
 
 select*
 from smartphone as s
 where s.weight>="150";
 
 select*
 from smartphone as s
 where s.weight<="150";
 
 select*
 from smartphone as s
 order by s.displayppi desc;
 
 
 