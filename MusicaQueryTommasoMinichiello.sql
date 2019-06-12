#query1#
select distinct S.nome
from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
where S.nome not in (select distinct S.nome
				from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
				where M.sesso ='F');


#query2#
select M.nome, M.cognome, M.datanascita, S.nome
from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
where S.categoria="ottone";

#query3#
select M.nome, M.cognome, M.datanascita
from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
group by M.nome, M.cognome, M.datanascita
having count(A.musicista)>=4;

#query4#
select distinct S.nome
from strumento as S Join abilita as A on S.nome=A.strumento 
group by S.nome
having count(S.nome)=2;

#query5#

select M.nome, M.cognome
from musicista as M
where M.datanascita = (select min(datanascita)
						from musicista);
                        
#query6#

select M.nome, M.cognome, S.nome
from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
where M.datanascita = (select max(datanascita)
						from musicista);
                        
#query7#
select M.nome, M.cognome, Count(A.strumento)
from strumento as S Join abilita as A on S.nome=A.strumento Join musicista as M on A.musicista= M.codiceFiscale
group by M.nome, M.cognome;

