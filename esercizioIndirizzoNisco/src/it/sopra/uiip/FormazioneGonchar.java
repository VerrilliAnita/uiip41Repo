package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneGonchar {

	public static ArrayList<Studente> formazioneStudenti(ArrayList<Studente>listaStudenti){
		
		ArrayList<Studente> resul = new ArrayList<Studente>();
		for (Studente s :listaStudenti) {
			if (!s.getCorsiDiFormazione().isEmpty())
				resul.add(s);
		}
		return resul;
	}
	

}
