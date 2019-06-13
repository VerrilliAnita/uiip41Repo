
#query1
select a.citta 
from aeroporto as a
where a.npiste is null;

#query2
select a.nazione 
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr
where v.idVolo=111111;



#query3
select p.tipoaereo
from aereo as p join volo as v on p.tipoaereo = v.tipoaereo join aeroporto as a on v.aeroportoPart = a.id
where a.citta='Roma';


#query4
select p.tipoaereo , p.npass
from aereo as p join volo as v on p.tipoaereo = v.tipoaereo join aeroporto as a on v.aeroportoPart = a.id
where a.citta='Roma';


#query5
select a1.citta modificata da Amsterdam a Mosca
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr
where a2.citta='Mosca'
order by a1.citta;


#query6 modificata da Napoli a Roma
select count(v.idvolo)
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr
where a1.citta='roma' and v.giornoSett='venerdi';


#query7 modificata da Olanda in Spagna
select a1.citta
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr
where a1.nazione='italia' and a2.nazione='Spagna'
group by a1.citta
having count(a1.citta)>=2;


#query8
select a1.citta
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr join aereo as p on v.tipoaereo =p.tipoaereo
where p.npass =(select max(p.npass)
				from aereo as p);



#query9
select a2.citta
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr join aereo as p on v.tipoaereo =p.tipoaereo
where p.npass =(select max(p.npass)
				from aereo as p);
                

#query10
select a1.citta
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr join aereo as p on v.tipoaereo =p.tipoaereo
where p.npass =(select max(p.npass)
				from aereo as p) 
UNION 
select a2.citta
from aeroporto as a1 join volo as v on a1.id = v.aeroportoPart join aeroporto as a2 on a2.id = v.aeroportoArr join aereo as p on v.tipoaereo =p.tipoaereo
where p.npass =(select max(p.npass)
				from aereo as p);
                
                
                

