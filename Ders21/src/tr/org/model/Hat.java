package tr.org.model;
public class Hat extends BaseModel{
	
	private String ozellik;
	
	private int uzunluk;
	
	private int iletkenlik;

	private TrafoMerkezi basTM;
	
	private TrafoMerkezi bitTM;

	public String getOzellik() {
		return ozellik;
	}

	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public int getIletkenlik() {
		return iletkenlik;
	}

	public void setIletkenlik(int iletkenlik) {
		this.iletkenlik = iletkenlik;
	}

	public TrafoMerkezi getBasTM() {
		return basTM;
	}

	public void setBasTM(TrafoMerkezi basTM) {
		this.basTM = basTM;
	}

	public TrafoMerkezi getBitTM() {
		return bitTM;
	}

	public void setBitTM(TrafoMerkezi bitTM) {
		this.bitTM = bitTM;
	}
	
	
	
}
