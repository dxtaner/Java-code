public class Calisan {
	private String ad;
	private String soyad;
	private String ID;

	public Calisan(String ad, String soyad, String iD) {
		this.ad = ad;
		this.soyad = soyad;
		ID = iD;
	}
public void bilgleriGoster(){
	System.out.println("Çalýþan Bilgileri");
	System.out.println("Ad :"+ad);
	System.out.println("Soyad :"+soyad);
	System.out.println("Id :"+ID);
	
}
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
