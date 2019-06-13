#query1#
select *
from book;

#query2#
select L.title as TitoloLibro, L.author as AutoreLbro
from book as L;

#query3#
select count(L.id) as NumeroLibriDiDanBrown
from book as L
where L.author="Dan Brown";
