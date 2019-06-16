#tutti gli aerei presenti nel database con relativa compagnia aerea di appartenenza;
SELECT a.tipoAereo, c.nome AS compagnia FROM aereo AS a
	INNER JOIN compagnia AS c ON c.nome = a.nomeCompagnia;

#restituire i tipi di aerei per ogni compagnia ordinandoli per tipo aereo;
SELECT a.tipoAereo, c.nome AS compagnia FROM aereo AS a
	INNER JOIN compagnia AS c ON c.nome = a.nomeCompagnia
		ORDER BY a.tipoAereo;

#restituire i codici fiscali dei viaggiatori che hanno prenotato voli che partono da Roma;
SELECT DISTINCT pass.codiceFiscale AS viaggiatore FROM passeggero AS pass
	INNER JOIN prenotazione AS p ON p.idPasseggero = pass.codiceFiscale
		INNER JOIN volo AS v ON v.idVolo = p.idVolo
			INNER JOIN aeroporto AS a ON a.id = v.aeroportoPart
				WHERE a.citta LIKE 'Roma';

#restituire le informazioni di tutte le prenotazioni del volo che parte da Roma alle ore 15.
SELECT DISTINCT p.idPasseggero, p.prezzo, p.giornoSett FROM prenotazione AS p
	INNER JOIN volo AS v ON v.idVolo = p.idVolo
		INNER JOIN aeroporto AS a ON a.id = v.aeroportoPart
			WHERE v.oraPartenza = 15 AND a.citta LIKE 'Roma';
	