package it.sopra.uiip.morante.viaggi;

import it.sopra.uiip.morante.viaggi.dao.impl.DefaultAereoDao;
import it.sopra.uiip.morante.viaggi.dao.impl.DefaultAeroportoDao;
import it.sopra.uiip.morante.viaggi.dao.impl.DefaultVoloDao;
import it.sopra.uiip.morante.viaggi.model.AereoModel;
import it.sopra.uiip.morante.viaggi.model.AeroportoModel;
import it.sopra.uiip.morante.viaggi.model.VoloModel;

public class App {
	public static void main( String[] args ){

		DefaultAereoDao dad = new DefaultAereoDao();
		DefaultAeroportoDao dapd = new DefaultAeroportoDao();
		DefaultVoloDao dvd = new DefaultVoloDao();
		int risultato;

		//inserimento aereo
		System.out.println("\nTest Insert Aereo");
		risultato = dad.insertAereo(new AereoModel("ZZZZZ", 79, 4));
		if(risultato == 1)
			System.out.println("Inserimento aereo andato a buon fine");
		else
			System.out.println("Inserimento aereo fallito");

		//test select all da tipo
		System.out.println("\nTest Select Aereo");
		AereoModel aereo = dad.selectAereo("AAAAA");
		if(aereo != null)
			System.out.println(aereo.toString());
		else
			System.out.println("Aereo non presente");

		//test update posti
		System.out.println("\nUpdate numero posti");
		risultato = dad.updatePasseggieri("AAAAA", 20);
		if(risultato == 1)
			System.out.println("Aggiornamento andato a buon fine");
		else
			System.out.println("Aggiornamento fallito");

		//inserimento aeroporto
		System.out.println("\nTest Insert Aereoporto");
		risultato = dapd.insertAeroporto(new AeroportoModel(10, "Cagliari", "Italia", 4));
		if(risultato == 1)
			System.out.println("Inserimento aeroporto andato a buon fine");
		else
			System.out.println("Inserimento aeroporto fallito");

		//test select all da id
		System.out.println("\nTest Select aeroporto");
		AeroportoModel aeroporto = dapd.selectAeroporto(2);
		if(aeroporto != null)
			System.out.println(aeroporto.toString());
		else
			System.out.println("Aeroporto non presente");

		//test update numero piste
		System.out.println("\nTest Update numero piste");
		risultato = dapd.updateNumeroPiste(4, 5);
		if(risultato == 1)
			System.out.println("Aggiornamento andato a buon fine");
		else
			System.out.println("Aggiornamento fallito");

		//inserimento volo
		System.out.println("\nTest Insert volo");
		risultato = dvd.insertVolo(new VoloModel(15, "Sabato", 3, 4, "CCCCC", 14, 15));
		if(risultato == 1)
			System.out.println("Inserimento volo andato a buon fine");
		else
			System.out.println("Inserimento volo fallito");




	}
}
