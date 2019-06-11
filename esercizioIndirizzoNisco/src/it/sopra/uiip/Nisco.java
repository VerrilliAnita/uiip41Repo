package it.sopra.uiip;

import java.util.ArrayList;
import java.util.Date;

public class Nisco {
		public static ArrayList<Persona> piùAnziana(ArrayList<Persona> lista){
			Date max=lista.get(0).getDataNascita();
			ArrayList<Persona> result=new ArrayList<Persona>();
			for(Persona p:lista) {
				if(max.after(p.getDataNascita())) {
					max=p.getDataNascita();
				}
			}
			
			for(Persona p:lista) {
				if(p.getDataNascita().equals(max)) {
					result.add(p);
				}
			}
			return result;
		}
		
		public static ArrayList<Persona> piùGiovane(ArrayList<Persona> lista){
			Date min=lista.get(0).getDataNascita();
			ArrayList<Persona> result=new ArrayList<Persona>();
			for(Persona p:lista) {
				if(min.before(p.getDataNascita())) {
					min=p.getDataNascita();
				}
			}
			
			for(Persona p:lista) {
				if(p.getDataNascita().equals(min)) {
					result.add(p);
				}
			}
			return result;
		}
}
