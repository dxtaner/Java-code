public class Anakart {

	private String model;
	private String �retici;
	private int yuvaSayisi;
	private String isletimSistemi;

	public Anakart(String model, String �retici, int yuvaSayisi,
			String isletimSistemi) {

		this.model = model;
		this.�retici = �retici;
		this.yuvaSayisi = yuvaSayisi;
		this.isletimSistemi = isletimSistemi;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String get�retici() {
		return �retici;
	}

	public void set�retici(String �retici) {
		this.�retici = �retici;
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
		System.out.println(isletimSistemi + " y�klendi..");
	}

	public void yuvaSayisiArttir(int yuvasayisi) {
		this.yuvaSayisi = yuvasayisi;
		System.out.println("Mevcut yuva say�s� :" + yuvasayisi +" artt�r�ld�.");
	}
}
