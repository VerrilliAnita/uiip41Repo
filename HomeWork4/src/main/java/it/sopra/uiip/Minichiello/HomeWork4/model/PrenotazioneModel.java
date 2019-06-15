package it.sopra.uiip.Minichiello.HomeWork4.model;

public class PrenotazioneModel {
	private int id;
	private VoloModel volo;
	private ViaggiatoreModel viaggiatore;
	
	public PrenotazioneModel(int id, VoloModel volo, ViaggiatoreModel viaggiatore) {
		super();
		this.id = id;
		this.volo = volo;
		this.viaggiatore = viaggiatore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VoloModel getVolo() {
		return volo;
	}

	public void setVolo(VoloModel volo) {
		this.volo = volo;
	}

	public ViaggiatoreModel getViaggiatore() {
		return viaggiatore;
	}

	public void setViaggiatore(ViaggiatoreModel viaggiatore) {
		this.viaggiatore = viaggiatore;
	}

	@Override
	public String toString() {
		return "PrenotazioneModel [id=" + id + ", volo=" + volo + ", viaggiatore=" + viaggiatore + "]";
	}
	
	
}
