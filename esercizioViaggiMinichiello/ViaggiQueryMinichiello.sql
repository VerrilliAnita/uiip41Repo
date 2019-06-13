#query#
select distinct A.citta
from aeroporto as A
where npiste is null;

#query2#
select A1.nazione as NazionePartenza, A2.nazione as NazioneArrivo
from aeroporto as A1 Join volo as V on A1.id=V.aeroportoPart Join aeroporto as A2 on V.aeroportoArr=A2.id
where V.idVolo=1;

#query3#
select Ae.tipoAereo
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoPart=A.id
where A.citta="Roma";

#query4#
select Ae.tipoAereo, Ae.nPass
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoPart=A.id
where A.citta="Roma";

#query5#
select distinct A1.citta
from aeroporto as A1 Join volo as V on A1.id=V.aeroportoPart Join aeroporto as A2 on V.aeroportoArr=A2.id
where A2.citta="Amsterdam"
order by A1.citta;

#query6#
select count(V.idVolo) as NumeriVoli
from volo as V join aeroporto as A on V.aeroportoPart=A.id
where V.giornoSett="Venerdi" and A.citta="Napoli";

#query7#
select A1.citta
from aeroporto as A1 
inner Join volo as V on A1.id=V.aeroportoPart 
inner Join aeroporto as A2 on V.aeroportoArr=A2.id
where A2.nazione="Olanda" and A1.nazione="Italia"
group by A1.citta
having count(A1.citta)>=2;

#query8#
select distinct A.citta
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoPart=A.id
where Ae.nPass=(select max(nPass)
				from aereo);

#query9#
select distinct A.citta
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoArr=A.id
where Ae.nPass=(select max(nPass)
				from aereo);
              
#query10#
select distinct A.citta
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoPart=A.id
where Ae.nPass=(select max(nPass)
				from aereo)
Union select distinct A.citta
from aereo as Ae join volo as V on Ae.tipoAereo=V.tipoAereo Join aeroporto as A on V.aeroportoArr=A.id
where Ae.nPass=(select max(nPass)
				from aereo);