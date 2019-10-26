package arrayclass;

public class Ogrenci {
	private String ad;
	private String soyad;
	private int number;
	private String bolum;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public void goruntule() {
		System.out.println("--------------------------");
		System.out.println("Ogr No: " + number + "\nOgr Ad: " + ad
				+ "\nOgr Soyad: " + soyad + "\nOgr Bolum: " + bolum);
	}

}
