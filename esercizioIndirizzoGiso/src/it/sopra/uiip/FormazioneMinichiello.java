package it.sopra.uiip;

import java.util.ArrayList;

public class FormazioneMinichiello {
	public static ArrayList< Studente> formazioneStudenti(ArrayList<Studente> listaStudenti){
		ArrayList<Studente> temp=new ArrayList<>();
		for(Studente s: listaStudenti) {
			if(s.getCorsiDiFormazione().size()>0)
				temp.add(s);
		}
		return temp;
	}
}
