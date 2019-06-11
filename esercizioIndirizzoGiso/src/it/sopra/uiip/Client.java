package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		Persona p1 = new Persona("Gianluca","Giso",new Date(91, 05, 22),
				new Indirizzo("Via Carlo Alberto Dalla Chiesa",36,"Vallata",83059,"Avellino","Campania"));
		
		Indirizzo indi=new Indirizzo("c.da sant'andrea", 21, "Grottaminarda", 83035, "Avellino", "Campania");
		Persona tommaso=new Persona("tommaso", "minichiello", new Date(94, 00, 05), indi);
		
		ArrayList<String> corsiS1 = new ArrayList<String>();
		corsiS1.add("Ingegneria del Software");
		corsiS1.add("Tecniche di Programmazione");
		corsiS1.add("ASSD");
		Studente s1 = new Studente(p1,2,"Ingegneria Informatica",corsiS1);
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		
		
		System.out.println(tommaso.toString());
		listaPersone.add(p1);
		listaPersone.add(tommaso);
		
		System.out.println("PERSONE CON INDIRIZZO CAMPANIA MINICHIELLO");
		for(Persona pp: ResidentiCampaniaMinichiello.trovaResidentiCampania(listaPersone)) {
			System.out.println(pp.toString());
		}

		
		System.out.println("PERSONE CON INDIRIZZO CAMPANIA GISO");
		for(Persona p: ResidentiCampaniaGiso.trovaResidentiCampania(listaPersone))
			System.out.println(p.toString());

		
		ArrayList<String> corsiTommaso=new ArrayList<>();
		corsiTommaso.add("programmazione Java");
		corsiTommaso.add("Architettura");
		Studente s2=new Studente(tommaso, 1, "informatica", corsiTommaso);
		System.out.println(s2.toString());
		

		ArrayList<Studente> listaStudenti = new ArrayList<Studente>();
		listaStudenti.add(s1);
		listaStudenti.add(s2);
		
		System.out.println("LISTA STUDENTI CON ALMENO UN CORSO GISO");
		for (Studente studente : FormazioneGiso.formazioneStudenti(listaStudenti)) 
			System.out.println(studente.toString());

		
		System.out.println("LISTA STUDENTI CON ALMENO UN CORSO MINICHIELLO");
		for(Studente s:FormazioneMinichiello.formazioneStudenti(listaStudenti)) {
			System.out.println(s.toString());
		}
		

		System.out.println("PERSONA PIU' GIOVANE GISO");
		for (Persona pers: Giso.calcolaPiuGiovane(listaPersone)) {
			System.out.println(pers.toString());
		}
		
		System.out.println("PERSONA PIU' ADULTA GISO");
		for (Persona pers: Giso.calcolaPiuAdulto(listaPersone)) {
			System.out.println(pers.toString());
		}
		

		System.out.println("Persone più anziana MINICHIELLO");
		for(Persona p:Minichiello.calcolaPersonaAdulta(listaPersone)) {
			System.out.println(p.toString());
		}
		System.out.println("Persone più giovane MINICHIELLO");
		for(Persona p:Minichiello.calcolaPersonaGiovane(listaPersone)) {
			System.out.println(p.toString());
		}

	}
	
}
