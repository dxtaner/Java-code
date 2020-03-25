public class Kasa {
	private String model;
	private String uretici;
	private String malzame;

	public Kasa(String model, String uretici, String malzame) {

		this.model = model;
		this.uretici = uretici;
		this.malzame = malzame;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getMalzame() {
		return malzame;
	}

	public void setMalzame(String malzame) {
		this.malzame = malzame;
	}

	public void bilgisayariAc() {
		System.out.println("Bilgisayar açýlýyor..");
	}

	public void bilgisayariKapat() {
		System.out.println("Bilgisayar kapatýlýyor..");
	}
}
