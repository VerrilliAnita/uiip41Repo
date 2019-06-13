
select *
from book;

select b.title, b.author
from book as b;

select count (b.id)
from book as b
where b. author like"%gonchar%";

 
