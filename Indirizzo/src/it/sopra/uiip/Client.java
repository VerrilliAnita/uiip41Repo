package it.sopra.uiip;

public class Client {

	public static void main(String[] args) {
		
		Indirizzo i1 = new Indirizzo("Via Roma", 23, "Roma", 80045, "Roma", "Lazio");
		Persona suglia = new Persona("Pompilio", "Suglia", i1);
		
		System.out.println(suglia.toString());

	}

}
