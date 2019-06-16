#- tutti gli aerei presenti nel database con relativa compagnia aerea di appartenenza;
select a.tipoAereo, a.npass, a.quantitamerci , c.nome
from aereo as a join compagniaAerea as c on a.tipoaereo=c.tipoaereo;

#restituire i tipi di aerei per ogni compagnia ordinandoli per tipo aereo;
 
select c.nome , a.tipoAereo
from aereo as a join compagniaAerea as c on a.tipoaereo=c.tipoaereo
group by c.nome,a.tipoAereo
order by a.tipoAereo;

#- restituire i codici fiscali dei viaggiatori che hanno prenotato voli che partono da Roma;

select p.passeggero , a1.citta as PARTENZA, a2.citta as ARRIVO
from prenotazione as p join volo as v on p.volo=v.idvolo 
	join aeroporto as a1  on v.aeroportoPart=a1.id
    join aeroporto as a2  on v.aeroportoArr=a2.id
where a1.citta='Roma';

#restituire le informazioni di tutte le prenotazioni del volo che parte da Roma alle ore 15.

select c.nome,  v.idvolo, v.orapartenza,a1.citta as Partenza ,a2.citta as Arrivo,p.codiceFiscale, p.nome , p.cognome , p.datadiNascita 
from persona as p join prenotazione as pr on p.codiceFiscale=pr.passeggero
	 join volo as v on pr.volo=v.idvolo 
	join aeroporto as a1  on v.aeroportoPart=a1.id
    join aeroporto as a2  on v.aeroportoArr=a2.id
    join compagniaAerea as c on v.compagnia=c.id
where a1.citta='roma' and v.oraPartenza=15;