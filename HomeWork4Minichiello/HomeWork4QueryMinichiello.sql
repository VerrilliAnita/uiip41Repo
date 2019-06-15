#query1#
select A.tipoAereo, C.nome
from aereo as A join volo as V on A.tipoAereo=V.tipoAereo
				join compagnia as C on V.compagnia=C.idCompagnia;
                
#query2#
select distinct A.tipoAereo
from aereo as A join volo as V on A.tipoAereo=V.tipoAereo
				join compagnia as C on V.compagnia=C.idCompagnia;
#query3#
select Vi.cf
from volo as V join prenotazione as P on P.volo=V.idVolo
			   join viaggiatore as Vi on Vi.cf=P.viaggiatore
               join aeroporto as A on A.id=V.aeroportoPart
where A.citta="Roma";

#query4#
select P.*
from volo as V join prenotazione as P on P.volo=V.idVolo
               join aeroporto as A on A.id=V.aeroportoPart
where A.citta="Roma"and V.oraPArtenza=15;