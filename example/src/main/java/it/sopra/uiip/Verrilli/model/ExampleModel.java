package it.sopra.uiip.Verrilli.model;

public class ExampleModel {
	
	private int attribute1;
	private String attribute2;
	
	public ExampleModel(int attribute1, String attribute2) {
		super();
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}

	public int getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	@Override
	public String toString() {
		return "ExampleModel [attribute1=" + attribute1 + ", attribute2=" + attribute2 + "]";
	}
	
	
	

}
