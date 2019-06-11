package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneGiso {
	
	public static ArrayList<Studente> formazioneStudenti(ArrayList<Studente> listaStudenti){
		ArrayList<Studente>result = new ArrayList<Studente>();
		for (Studente stud : listaStudenti) {
			if(stud.getCorsiDiFormazione().size()>0)
				result.add(stud);
		}
		return result;
	}

}
