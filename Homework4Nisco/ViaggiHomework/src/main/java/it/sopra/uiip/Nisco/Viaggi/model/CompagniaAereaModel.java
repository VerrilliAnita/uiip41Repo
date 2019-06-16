package it.sopra.uiip.Nisco.Viaggi.model;

public class CompagniaAereaModel {
			private int id;
			private String nome;
			private AereoModel aereo;
			
			public CompagniaAereaModel(int id, String nome, AereoModel aereo) {
				this.id = id;
				this.nome = nome;
				this.aereo = aereo;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public AereoModel getAereo() {
				return aereo;
			}

			public void setAereo(AereoModel aereo) {
				this.aereo = aereo;
			}

			@Override
			public String toString() {
				return "CompagniaAerea [id=" + id + ", nome=" + nome + ", aereo=" + aereo + "]";
			}
			
			
			

}
