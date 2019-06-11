package it.sopra.uiip;

public class Client {

	public static void main(String[] args) {
		
		Persona morich = new Persona("Emanuele", "Morante", new Indirizzo("Atlantici", 16, "Benevento", 82100, "BN", "Campania"));
		
		System.out.println(morich.toString());
		
	}

}
