package it.sopra.uiip.suglia.viaggi;

import java.util.ArrayList;

import it.sopra.uiip.suglia.viaggi.dao.AereoDao;
import it.sopra.uiip.suglia.viaggi.dao.AeroportoDao;
import it.sopra.uiip.suglia.viaggi.dao.CompagniaDao;
import it.sopra.uiip.suglia.viaggi.dao.PasseggeroDao;
import it.sopra.uiip.suglia.viaggi.dao.PrenotazioneDao;
import it.sopra.uiip.suglia.viaggi.dao.VoloDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultCompagniaDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultPasseggeroDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultPrenotazioneDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.suglia.viaggi.model.Aereo;
import it.sopra.uiip.suglia.viaggi.model.Aeroporto;
import it.sopra.uiip.suglia.viaggi.model.Compagnia;
import it.sopra.uiip.suglia.viaggi.model.Passeggero;
import it.sopra.uiip.suglia.viaggi.model.Prenotazione;
import it.sopra.uiip.suglia.viaggi.model.Volo;

public class App {
	public static void main(String[] args) {

		AereoDao a1 = new DefaultAereoDao();
		AeroportoDao aero1 = new DefaultAeroportoDao();
		VoloDao v1 = new DefaultVoloDao();
		CompagniaDao c1 = new DefaultCompagniaDao();
		PasseggeroDao p1 = new DefaultPasseggeroDao();
		PrenotazioneDao pre1 = new DefaultPrenotazioneDao();
		
		Aereo aereo1 = new Aereo("Boing 345 - 45", 200, 150);
		Aeroporto aeroporto1 = new Aeroporto(9, "Bari", "Italia", 3);
		Compagnia comp1 = new Compagnia(17, "Meridiana", aereo1.getTipoAereo());
		Volo volo1 = new Volo(10, "lunedi", 1, 6, comp1.getIdComp(), 12, 16);
		Passeggero pass1 = new Passeggero("SGLPPL89M17A399W", "Pompilio", "Suglia");
		Prenotazione preno1 = new Prenotazione("M0000", pass1.getCodiceFiscale(), volo1.getIdVolo());

		System.out.println("----------------TEST AEROPORTO----------------------------------------------------");

		System.out.println("\n > Inserimento Aeroporto");
		int checkAeroporto = aero1.insertAeroporto(aeroporto1);
		if (checkAeroporto == 1) {
			System.out.println("L'aeroporto è stato iserito con succeso!");
			System.out.println(aero1.selectAeroportoById(aeroporto1.getId()).toString());
		} else {
			System.out.println("L'aeroporto selezionato è già presente nel database!");
			System.out.println(aero1.selectAeroportoById(aeroporto1.getId()).toString());
		}

		System.out.println("\n > update numero piste");
		int checkupdateAero = aero1.updateNumeroPiste(aeroporto1.getId(), 7);
		if (checkupdateAero == 1) {
			System.out.println("L'aeroporto è stato aggiornato con succeso!");
			System.out.println(aero1.selectAeroportoById(aeroporto1.getId()).toString());
		} else {
			System.out.println("L'aeroporto non è stato aggiornato!");
			System.out.println(aero1.selectAeroportoById(aeroporto1.getId()).toString());
		}

		System.out.println("\n\n----------------TEST AEREO----------------------------------------------------");

		System.out.println("\n > Inserimento Aereo");
		int inserito = a1.insertAereo(aereo1);
		if (inserito == 1) {
			System.out.println("L'aereo è stato iserito con succeso!");
			System.out.println(a1.selectAereoByTipo(aereo1.getTipoAereo()).toString());

		} else {
			System.out.println("L'aereo è già presente nel database!");
			System.out.println(a1.selectAereoByTipo(aereo1.getTipoAereo()).toString());

		}

		System.out.println("\n > Aggiorna Passeggeri");
		int aggiornato = a1.updatePasseggeri(aereo1.getTipoAereo(), 280);
		if (aggiornato == 1) {
			System.out.println("L'aereo è stato aggiornato con succeso!");
			System.out.println(a1.selectAereoByTipo(aereo1.getTipoAereo()).toString());

		} else {
			System.out.println("L'aereo non è stato aggiornato!");
			System.out.println(a1.selectAereoByTipo(aereo1.getTipoAereo()).toString());
		}
		

		System.out.println("\n\n----------------TEST COMPAGNIA----------------------------------------------------");

		System.out.println("\n > Inserimento Compagnia");
		int checkinsertCompagnia = c1.insertCompagnia(comp1);
		if (checkinsertCompagnia == 1) {
			System.out.println("La compagnia è stata iserita con succeso!");
			System.out.println(c1.selectCompagniaById(comp1.getIdComp()).toString());
		} else {
			System.out.println("La è già presente nel database!");
			System.out.println(c1.selectCompagniaById(comp1.getIdComp()).toString());
		}
		
	
		System.out.println("\n\n----------------TEST VOLO----------------------------------------------------");

		System.out.println("\n > Inserimento Volo");
		int checkinsertVolo = v1.insertVolo(volo1);
		if (checkinsertVolo == 1) {
			System.out.println("Il volo è stato iserito con succeso!");
			System.out.println(v1.selectVoloById(volo1.getIdVolo()).toString());

		} else {
			System.out.println("Il volo è gia presente nel database!");
			System.out.println(v1.selectVoloById(volo1.getIdVolo()).toString());
		}
		
		
		System.out.println("\n\n----------------TEST PASSEGGERO----------------------------------------------------");

		System.out.println("\n > Inserimento Passeggero");
		int checkinsertPasseggero = p1.insertPasseggero(pass1);
		if (checkinsertPasseggero == 1) {
			System.out.println("Il passeggero è stato inserito con succeso!");
			System.out.println(p1.selectPasseggeroById(pass1.getCodiceFiscale()).toString());
		} else {
			System.out.println("Il passeggero è già presente nel database!");
			System.out.println(p1.selectPasseggeroById(pass1.getCodiceFiscale()).toString());
		}

		System.out.println("\n\n----------------TEST PRENOTAZIONE----------------------------------------------------");

		System.out.println("\n > Inserimento Prenotazione");
		int checkinsertPrenotazione = pre1.inserPrenotazione(preno1);
		if (checkinsertPrenotazione == 1) {
			System.out.println("La prenotazione è stato inserita con succeso!");
			System.out.println(pre1.selectPrenotazione(preno1.getCodicePrenotazione()).toString());
		} else {
			System.out.println("La prenotazione è già presente nel database!");
			System.out.println(pre1.selectPrenotazione(preno1.getCodicePrenotazione()).toString());
		}

		
	}
}
