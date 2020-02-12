public class Yazilimci extends Calisan {
	private String diller;

	public Yazilimci(String ad, String soyad, String iD, String diller) {
		super(ad, soyad, iD);
		this.diller = diller;
	}

	public void formatAt(String isletimSistemi) {
		System.out.println(getAd() + " " + isletimSistemi + " ni yüklüyor..");
	}

	public void bilgleriGoster() {
		// TODO Auto-generated method stub
		super.bilgleriGoster();
		System.out.println("Yazilimcinin bildiði diller :"+diller);
	}
}
