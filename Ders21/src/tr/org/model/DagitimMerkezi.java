package tr.org.model;

import java.util.List;

public class DagitimMerkezi extends BaseModel {
	
	private List<Il> iller;
	
	private List<Ilce> ilceler;
	
	private List<TrafoMerkezi> trafoMerkeziler;
	
	private List<Hat> hatlar;

	public List<Il> getIller() {
		return iller;
	}

	public void setIller(List<Il> iller) {
		this.iller = iller;
	}

	public List<Ilce> getIlceler() {
		return ilceler;
	}

	public void setIlceler(List<Ilce> ilceler) {
		this.ilceler = ilceler;
	}

	public List<TrafoMerkezi> getTrafoMerkeziler() {
		return trafoMerkeziler;
	}

	public void setTrafoMerkeziler(List<TrafoMerkezi> trafoMerkeziler) {
		this.trafoMerkeziler = trafoMerkeziler;
	}

	public List<Hat> getHatlar() {
		return hatlar;
	}

	public void setHatlar(List<Hat> hatlar) {
		this.hatlar = hatlar;
	}
	
	


}
