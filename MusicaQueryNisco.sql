# query 1

select s.nome
from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
where s.nome not in (select S.nome
			  from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
			   where sesso = 'f');
               


#query2

select m.nome , m.cognome, m.datadinascita , s.nome
from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
where s.categoria='ottone';


#query3
select m.nome,m.cognome,m.datadinascita
from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
group by m.nome, m.cognome , m.datadinascita
having count(a.musicista)>=3;


#query4
select m.nome
from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
group by m.nome
having count(a.musicista)=2;



#query5
select m.nome, m.cognome
from musicista as m
where datadinascita = (select min(m.datadinascita) 
						from musicista as m);

 
 #query6
select m.nome, m.cognome , s.nome
from abilita as a join musicista as m on a.musicista=m.codiceFiscale join strumento as s on a.strumento = s.nome
where datadinascita = (select max(m.datadinascita) 
						from musicista as m);

 
 
 #query7
 
 select   count(a.strumento), m.nome,m.cognome
 from abilita as a join musicista as m on a.musicista=m.codicefiscale
 group by m.nome,m.cognome ;




