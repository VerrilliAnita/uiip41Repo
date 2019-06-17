

select a.citta
from aeroporto as a
where npiste<1;


select ap.nazione, ar.nazione
from volo as v
inner join aeroporto as ap on v.aeroportoPart = ap.id
inner join aeroporto as ar on v.aeroportoArri = ar.id
where  v.id =3454;

select  aer.tipoAereo
from volo as v
left join aereo as aer on v.tipoAereo = aer.tipoAereo
inner join aeroporto as ap on v.aeroportoPart = ap.id
where ap.id =24;


select aer. tipoAereo, nPass
from volo as v
left join aereo as aer on v.tipoAereo = aer.tipoAereo
inner join aeroporto as ap on v.aeroportoPart = ap.id
where ap.id =24;

select v.id
from volo as v
inner join aeroporto as ap on v.aeroportoPart = ap.id
where giornoSett like 'Venerd' 
and ap.id =22;

select tipoAereo, nomeCompagnia
from compagnia;

select tipoAereo, nomeCompagnia
from compagnia
order by tipoAereo;

select pren.codiceFiscale
from prenotazione as pren
where id=9877;







