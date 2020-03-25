public class Anakart {

	private String model;
	private String üretici;
	private int yuvaSayisi;
	private String isletimSistemi;

	public Anakart(String model, String üretici, int yuvaSayisi,
			String isletimSistemi) {

		this.model = model;
		this.üretici = üretici;
		this.yuvaSayisi = yuvaSayisi;
		this.isletimSistemi = isletimSistemi;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getÜretici() {
		return üretici;
	}

	public void setÜretici(String üretici) {
		this.üretici = üretici;
	}

	public int getYuvaSayisi() {
		return yuvaSayisi;
	}

	public void setYuvaSayisi(int yuvaSayisi) {
		this.yuvaSayisi = yuvaSayisi;
	}

	public String getIsletimSistemi() {
		return isletimSistemi;
	}

	public void setIsletimSistemi(String isletimSistemi) {
		this.isletimSistemi = isletimSistemi;
	}

	public void isletimSistemiYukle(String isletimSistemi) {

		this.isletimSistemi = isletimSistemi;
		System.out.println(isletimSistemi + " yüklendi..");
	}

	public void yuvaSayisiArttir(int yuvasayisi) {
		this.yuvaSayisi = yuvasayisi;
		System.out.println("Mevcut yuva sayýsý :" + yuvasayisi +" arttýrýldý.");
	}
}
