package it.sopra.uiip;

public class Client {

	public static void main(String[] args) {
		
		Indirizzo i1 = new Indirizzo("Via dei Santini",15,"Cesinali",83020,"Avellino","Campania");
		
		Persona danilo = new Persona("Danilo","Ferrara",i1);
		
		System.out.println(danilo.toString());

	}

}
