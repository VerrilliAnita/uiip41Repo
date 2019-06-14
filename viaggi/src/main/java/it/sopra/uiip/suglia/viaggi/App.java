package it.sopra.uiip.suglia.viaggi;

import it.sopra.uiip.suglia.viaggi.dao.AereoDao;
import it.sopra.uiip.suglia.viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.suglia.viaggi.model.Aereo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AereoDao a1 = new DefaultAereoDao();
		Aereo aereo1 = new Aereo(" Boing 345 - 45 ", 700, 150);

		//Inserimento aereo
		int inserito = a1.insertAereo(aereo1);
		if (inserito == 1) {
			System.out.println("L'aereo è stato iserito con succeso!!!");
		} else {
			System.out.println("L'aereo non è stato inserito!!!");
		}
		
		//Seleziona aereo
		System.out.println(a1.selectAereoByTipo("'Boing 345 - 45'").toString());
		
		//Aggiorna numero passeggeri 
		int aggiornato = a1.updatePasseggeri("Boing 345 - 45" , 200);
		if (aggiornato == 1) {
			System.out.println("L'aereo è stato aggiornato con succeso!!!");
		} else {
			System.out.println("L'aereo non è stato aggiornato!!!");
		}
	}
}
