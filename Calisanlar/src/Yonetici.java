public class Yonetici extends Calisan {

	private int sorumluKisisayısı;

	public Yonetici(String ad, String soyad, String iD, int sorumluKisisayisi) {
		super(ad, soyad, iD);
		this.sorumluKisisayısı = sorumluKisisayisi;
	}

	public void bilgleriGoster() {
		super.bilgleriGoster();
		System.out.println("Yöneticinin sorumlu kişi sayisi :"
				+ sorumluKisisayısı);
	}

	public void zamYap(int zam){
		System.out.println(getAd()+" çalışanlara "+zam+" tl zam yapıyor.");
	}
}
