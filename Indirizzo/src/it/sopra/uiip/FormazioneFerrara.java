package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneFerrara {
	
	public static ArrayList<Studente> formazioneStudenti(ArrayList<Studente> listaStudenti){
		ArrayList<Studente> listaStudentiFormazione = new ArrayList<>();
		for(Studente s:listaStudentiFormazione) {
			if(s.getCorsiDiFormazione().size()>0)
				listaStudentiFormazione.add(s);
		}
		return listaStudentiFormazione;
	}

}
