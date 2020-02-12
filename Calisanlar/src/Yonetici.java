public class Yonetici extends Calisan {

	private int sorumluKisisay�s�;

	public Yonetici(String ad, String soyad, String iD, int sorumluKisisayisi) {
		super(ad, soyad, iD);
		this.sorumluKisisay�s� = sorumluKisisayisi;
	}

	public void bilgleriGoster() {
		super.bilgleriGoster();
		System.out.println("Y�neticinin sorumlu ki�i sayisi :"
				+ sorumluKisisay�s�);
	}

	public void zamYap(int zam){
		System.out.println(getAd()+" �al��anlara "+zam+" tl zam yap�yor.");
	}
}
