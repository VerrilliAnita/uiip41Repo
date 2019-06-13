package it.sopra.uiip.Verrilli.dao;

import it.sopra.uiip.Verrilli.model.ExampleModel;

public interface ExampleDao {
	
	public void insertExample(ExampleModel example);
	public ExampleModel selectExampleByAttribute1(int attribute1);

}
