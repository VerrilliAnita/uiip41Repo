#query1#
select C.cognome, C.nome, T.numero
from candidato as C join telefono as T on C.codice=T.candidato;

#query2#
select C.cognome, C.nome, T.numero
from candidato as C left join telefono as T on C.codice=T.candidato;

#query#
select C.cognome, C.nome
from candidato as C join istruzione as I on C.codice=I.candidato join titolostudio as T on I.titolo =T.codice
group by C.cognome, C.nome
having count(I.titolo)>=2;
