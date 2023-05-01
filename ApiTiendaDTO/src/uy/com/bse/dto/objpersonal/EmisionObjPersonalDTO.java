package uy.com.bse.dto.objpersonal;

import java.io.Serializable;

public class EmisionObjPersonalDTO  implements Serializable {
	private static final long serialVersionUID = -4414245436115270129L;

	private PolizaObjPersonalDTO polizaObjPersonal;

	public PolizaObjPersonalDTO getPolizaObjPersonal() {
		return polizaObjPersonal;
	}

	public void setPolizaObjPersonal(PolizaObjPersonalDTO polizaObjPersonal) {
		this.polizaObjPersonal = polizaObjPersonal;
	}
}
