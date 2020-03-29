package kalıtım;

public class Calisan { // superclass

	private String isim;
	private int maas;
	private String departman;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public Calisan(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}

	public void calıs() {
		System.out.println("Çalışılıyor..");
	}

	public void bilgileriGoster() {
		System.out.println("isim :" + isim);
		System.out.println("maas :" + maas);
		System.out.println("departman :" + departman);
	}

	public void departmanDegis(String yenidepartman) {

		this.departman = yenidepartman;
		System.out.println("Yeni departman :" + departman);
	}
}
