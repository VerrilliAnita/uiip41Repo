package it.sopra.uiip.Nisco.Viaggi.dao;

import it.sopra.uiip.Nisco.Viaggi.model.AereoModel;

public interface AereoDao {
			public int insertAereo(AereoModel aereo);
			public AereoModel selectAereoByTipoAereo(String tipoAereo );
			public int updateNpassByTipoAereo(String tipoAereo, int nPass);
}
