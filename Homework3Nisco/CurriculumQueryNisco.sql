#query 1
select c.nome , c.cognome , t.numero
from candidato as c join telefono as t on c.codice = t.candidato;


#query 2
select c.nome , c.cognome , t.numero
from candidato as c left join telefono as t on c.codice = t.candidato;


#query 3
select c.nome, c.cognome
from candidato as c join istruzione as i on c.codice=i.candidato join titolostudio as t on  i.titolo=t.codice
group by c.nome, c.cognome
having count(t.codice)>= 2;
